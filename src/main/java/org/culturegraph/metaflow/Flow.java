package org.culturegraph.metaflow;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;

import org.culturegraph.metaflow.source.StdInOpener;
import org.culturegraph.metaflow.source.StringSender;
import org.culturegraph.metastream.framework.LifeCycle;
import org.culturegraph.metastream.framework.ObjectReceiver;
import org.culturegraph.metastream.framework.Sender;
import org.culturegraph.util.ObjectFactory;
import org.culturegraph.util.ResourceUtil;

/**
 * @author Markus Michael Geipel
 * 
 */
public class Flow {

	private static final ObjectFactory<LifeCycle> PIPE_FACTORY = new ObjectFactory<LifeCycle>();
	private static final String PROPERTIES_LOCATION = "metaflow-pipe.properties";


	static {
		
		try {
			Enumeration<URL> enumeration = Thread.currentThread().getContextClassLoader().getResources(PROPERTIES_LOCATION);
			while(enumeration.hasMoreElements()){
				final URL url = enumeration.nextElement();
				PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(url.getPath()), LifeCycle.class);
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private LifeCycle element;
	private ObjectReceiver<Object> start;


	public final void addElement(final String name, final Map<String, String> args) {
		addElement(name, args, new Object[0]);
	}

	public final void addElement(final String name, final Map<String, String> args, final String cArg) {
		if (cArg == null) {
			addElement(name, args);
		} else {
			addElement(name, args, new Object[] { cArg });
		}
	}

	public final void addElement(final String name, final Map<String, String> args, final Object[] cArgs) {

		final LifeCycle nextElement;
		if (PIPE_FACTORY.containsKey(name)) {
			nextElement = PIPE_FACTORY.newInstance(name, args, cArgs);

		} else {
			nextElement = ObjectFactory.newInstance(ObjectFactory.loadClass(name, LifeCycle.class), cArgs);
			ObjectFactory.applySetters(nextElement, args);
		}
		addElement(nextElement);
	}

	public final void setStringStart(final String string) {
		start = new StringSender(string);
		element = start;
	}

	public final void setStdInStart() {
		start = new StdInOpener();
		element = start;
	}

	protected final void addElement(final LifeCycle nextElement) {
		if (element instanceof Sender) {
			final Sender sender = (Sender) element;
			sender.setReceiver(nextElement);
		} else {
			System.err.println(element.getClass().getCanonicalName() + "is not a sender");
		}
		element = nextElement;
	}

	public final void start() {
		start.process(null);
		start.closeStream();
	}

	public static void printHelp() {
		HelpPrinter.print(PIPE_FACTORY);
		
	}
	

}
