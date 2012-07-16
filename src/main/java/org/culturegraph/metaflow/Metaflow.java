package org.culturegraph.metaflow;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.culturegraph.metaflow.source.StdInOpener;
import org.culturegraph.metaflow.source.StringSender;
import org.culturegraph.metastream.annotation.Description;
import org.culturegraph.metastream.annotation.In;
import org.culturegraph.metastream.annotation.Out;
import org.culturegraph.metastream.annotation.ReturnsAvailableArguments;
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
public final class Metaflow {

	private static final Pattern PIPE_PATTERN = Pattern.compile("\\s*\\|\\s*");
	private static final Pattern CONSTRUCTOR_PATTERN = Pattern.compile("(.*)\\((.*)\\)");

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

	private Metaflow() {
		// no instances
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(final String[] args) throws IOException {
		final String flowDef;
		if(args.length==1){
			flowDef = args[0];
		}else if(args.length==2 && "-f".equals(args[0])){
			flowDef = ResourceUtil.loadTextFile(args[1]);
		}else {
			printHelp();
			return;
		}
		final ObjectReceiver<Object> startPoint = buildPipeFromDescription(flowDef);
		startPipe(startPoint);
		startPoint.closeStream();
	}

	
	private static void startPipe(final ObjectReceiver<Object> startPoint) {
		startPoint.process(null);
	}

	private static ObjectReceiver<Object> buildPipeFromDescription(final String string) {
		final String[] parts = PIPE_PATTERN.split(string);
		if(parts.length<2){
			throw new IllegalArgumentException("Flow must contain at least two elements.");
		}
		
		Object element;
		final ObjectReceiver<Object> startPoint;
		if (parts[0].isEmpty()) {
			startPoint = new StdInOpener();
		} else {
			startPoint = new StringSender(parts[0]);
		}

		element = startPoint;

		for (int i = 1; i < parts.length; ++i) {
			final String part = parts[i];
			element = addElement(element, part);
		}

		return startPoint;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Object addElement(final Object element, final String part) {
		final Matcher matcher = CONSTRUCTOR_PATTERN.matcher(part);
		final String name;
		final Object[] args;
		if (matcher.matches()) {
			name = matcher.group(1);
			args = new String[] { matcher.group(2).trim() };
		} else {
			name = part;
			args = new String[0];
		}
		
		final LifeCycle nextElement;
		if(PIPE_FACTORY.containsKey(name)){
			nextElement = PIPE_FACTORY.newInstance(name, args);
		}else{
			nextElement = ObjectFactory.newInstance(ObjectFactory.loadClass(name, LifeCycle.class), args) ;
		}

		if (element instanceof Sender) {
			final Sender sender = (Sender) element;
			sender.setReceiver(nextElement);
		} else {
			System.err.println("not a sender");
		}
		return nextElement;
	}

	private static void printHelp() {
		System.err.println("Usage:\tMetaflow \"PIPE_DESCRIPTION\"");
		System.err.println("\tPIPE_DESCRIPTION := [PIPE_ELEMENT] (| PIPE_ELEMENT)*\n");
		System.err.println("Available pipe elements:\n");
		
		final List<String> keyWords = new ArrayList<String>();
		keyWords.addAll(PIPE_FACTORY.keySet());
		Collections.sort(keyWords);
		for (String name : keyWords) {
			describe(name);
		}
		System.err
				.println("Example: FILENAME | open(file) | read(marc21) | morph(src/test/resources/morph/ingest.marc21.xml) | encode(pretty-print) | write(stdout)");
	}

	private static void describe(final String name) {
		final Class<?> clazz = PIPE_FACTORY.getClass(name);
		final Description desc = clazz.getAnnotation(Description.class);
		System.err.println(name);
		
		if (desc != null) {
			System.err.println("description:\t" + desc.value());
		}
		final Collection<String> arguments = getAvailableArguments(clazz);
		if(!arguments.isEmpty()){
			System.err.println("argument in\t" + arguments);
		}
		final Collection<String> options = PIPE_FACTORY.getAttributes(name);
		if(!options.isEmpty()){
			System.err.println("options:\t" + options);
		}
		
		System.err.println("implementation:\t" + clazz.getCanonicalName());
		String inString = "<unknown>";
		String outString = "";
		final In inClass = clazz.getAnnotation(In.class);
		if (inClass != null) {
			inString = inClass.value().getCanonicalName();
		}
		final Out outClass = clazz.getAnnotation(Out.class);
		if (outClass != null) {
			outString = outClass.value().getCanonicalName();
		}
		System.err.println("signature:\t" + inString + " -> " + outString);
		System.err.println();
	}
	
	@SuppressWarnings("unchecked")
	private static Collection<String> getAvailableArguments(final Class<?> clazz){
		for (Method method : clazz.getMethods()) {
			if(method.getAnnotation(ReturnsAvailableArguments.class)!=null){
				try {
					return (Collection<String>) method.invoke(clazz, new Object[0]);
				} catch (IllegalAccessException e) {
					// silently ignore
				} catch (IllegalArgumentException e) {
					// silently ignore
				} catch (InvocationTargetException e) {
					// silently ignore
				}
			}
		}
		return Collections.emptyList();
	}
}
