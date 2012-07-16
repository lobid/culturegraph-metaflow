package org.culturegraph.metaflow;

import java.util.Map;

import org.culturegraph.metaflow.source.StdInOpener;
import org.culturegraph.metaflow.source.StringSender;
import org.culturegraph.metastream.framework.LifeCycle;
import org.culturegraph.metastream.framework.ObjectReceiver;
import org.culturegraph.metastream.framework.Sender;
import org.culturegraph.util.CulturegraphUtilException;
import org.culturegraph.util.ObjectFactory;
import org.culturegraph.util.ResourceUtil;

/**
 * @author Markus Michael Geipel
 * 
 */
public class Flow {

	private static final ObjectFactory<LifeCycle> PIPE_FACTORY = new ObjectFactory<LifeCycle>();
	private static final String POPERTIES_LOCATION = "metaflow-pipe.properties";
	private static final String USER_POPERTIES_LOCATION = "metaflow-pipe-user.properties";

	static {
		PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(POPERTIES_LOCATION), LifeCycle.class);
		try {
			PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(USER_POPERTIES_LOCATION), LifeCycle.class);
		} catch (CulturegraphUtilException e) {
			// user properties are not mandatory, so just ignore
		}
	}
	
	private LifeCycle element;
	private ObjectReceiver<Object> start;

//	public final void addElement(final String name) {
//		addElement(name, new String[0]);
//	}

	public final void addElement(final String name, final Map<String, String> args, final Object[] cArgs) {
	
		final LifeCycle nextElement;
		if(PIPE_FACTORY.containsKey(name)){
			nextElement = PIPE_FACTORY.newInstance(name, args, cArgs);

		}else{
			nextElement = ObjectFactory.newInstance(ObjectFactory.loadClass(name, LifeCycle.class), cArgs) ;
			ObjectFactory.applySetters(nextElement, args);
		}
		addElement(nextElement);
	}
	
	public final void setStringStart(final String string){
		start = new StringSender(string);
		element = start;
	}
	
	public final void setStdInStart(){
		start = new StdInOpener();
		element = start;
	}
	
	protected final void addElement(final LifeCycle nextElement){
		if (element instanceof Sender) {
			final Sender sender = (Sender) element;
			sender.setReceiver(nextElement);
		} else {
			System.err.println(element.getClass().getCanonicalName() + "is not a sender");
		}
		element = nextElement;
	}
	
	public final void start(){
		start.process(null);
	}
}
