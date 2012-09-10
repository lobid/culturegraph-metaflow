package org.culturegraph.metaflow;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.culturegraph.metaflow.source.StdInOpener;
import org.culturegraph.metaflow.source.StringSender;
import org.culturegraph.metastream.framework.LifeCycle;
import org.culturegraph.metastream.framework.ObjectReceiver;
import org.culturegraph.metastream.framework.Sender;
import org.culturegraph.metastream.pipe.Tee;
import org.culturegraph.util.ObjectFactory;
import org.culturegraph.util.ResourceUtil;

/**
 * @author Markus Michael Geipel
 * 
 */
public final class Flow {

	private static final ObjectFactory<LifeCycle> PIPE_FACTORY = new ObjectFactory<LifeCycle>();
	private static final String PROPERTIES_LOCATION = "metaflow-pipe.properties";

	private Deque<Tee<?>> teeStack = new LinkedList<Tee<?>>();
	private Deque<List<LifeCycle>> looseEndsStack = new LinkedList<List<LifeCycle>>();

	static {

		try {
			final Enumeration<URL> enumeration = Thread.currentThread().getContextClassLoader()
					.getResources(PROPERTIES_LOCATION);
			while (enumeration.hasMoreElements()) {
				final URL url = enumeration.nextElement();

				PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(url), LifeCycle.class);
			}

		} catch (IOException e) {
			throw new MetaFlowException("unable to load properties.", e);
		}
	}

	private LifeCycle element;
	private ObjectReceiver<? extends Object> start;
	private boolean joinLooseEnds;

//	public LifeCycle createElement(final String name, final Map<String, String> args) {
//		return createElement(name, args, Collections.emptyList());
//	}

	public LifeCycle createElement(final String name, final Map<String, String> namedArgs, final List<Object> cArgs) {

		final LifeCycle newElement;
		if (PIPE_FACTORY.containsKey(name)) {
			newElement = PIPE_FACTORY.newInstance(name, namedArgs, cArgs.toArray());

		} else {
			newElement = ObjectFactory.newInstance(ObjectFactory.loadClass(name, LifeCycle.class), cArgs.toArray());
			ObjectFactory.applySetters(newElement, namedArgs);
		}
		return newElement;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addElement(final LifeCycle nextElement) {
		if (element instanceof Sender) {
			final Sender sender = (Sender) element;
			if (joinLooseEnds) {
				teeStack.pop();
				for (LifeCycle looseEnd : looseEndsStack.pop()) {
					((Sender) looseEnd).setReceiver(nextElement);
				}
				joinLooseEnds = false;
			} else {
				sender.setReceiver(nextElement);
				//System.out.println("joining " + element + " " + nextElement);
			}
		} else {
			throw new MetaFlowException(element.getClass().getCanonicalName() + "is not a sender");
		}
		element = nextElement;
	}

	public void startTee() {
		if (element instanceof Tee) {
			final Tee<?> tee = (Tee<?>) element;
			teeStack.push(tee);
			looseEndsStack.push(new ArrayList<LifeCycle>());
		} else {
			throw new MetaFlowException("Flow cannot be split without a tee-element.");
		}
	}

	public void endTee() {
		joinLooseEnds = true;
		
	}

	public void endSubFlow() {
		looseEndsStack.peek().add(element);
		element = (LifeCycle) teeStack.peek();
	}

	public void setStringStart(final String string) {
		start = new StringSender(string);
		element = start;
	}

	public void setStdInStart() {
		start = new StdInOpener();
		element = start;
	}

	public void start() {
		start.process(null);
		start.closeStream();
	}

	public static void printHelp() {
		HelpPrinter.print(PIPE_FACTORY);

	}

}
