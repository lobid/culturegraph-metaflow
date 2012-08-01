package org.culturegraph.metaflow;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.culturegraph.metastream.annotation.Description;
import org.culturegraph.metastream.annotation.In;
import org.culturegraph.metastream.annotation.Out;
import org.culturegraph.metastream.annotation.ReturnsAvailableArguments;
import org.culturegraph.util.ObjectFactory;

/**
 * prints metaflow help for a given {@link ObjectFactory}
 * 
 * @author Markus Michael Geipel
 *
 */
public final class HelpPrinter {
	private HelpPrinter() {
		//no instances
	}
	
	public static void print(final ObjectFactory<?> factory) {
		System.err.println("Usage:\tMetaflow \"PIPE_DESCRIPTION\" | -f FLOW_FILE");
		System.err.println("\tPIPE_DESCRIPTION := [PIPE_ELEMENT] (| PIPE_ELEMENT)*\n");
		System.err.println("Available pipe elements:\n");
		
		final List<String> keyWords = new ArrayList<String>();
		keyWords.addAll(factory.keySet());
		Collections.sort(keyWords);
		for (String name : keyWords) {
			describe(name, factory);
		}
		System.err
				.println("Example: \"FILENAME\" | open(\"file\") | read(\"marc21\") | morph(\"src/test/resources/morph/ingest.marc21.xml\") | encode(\"pretty-print\") | write(\"stdout\");");
	}

	private static void describe(final String name, final ObjectFactory<?> factory) {
		final Class<?> clazz = factory.getClass(name);
		final Description desc = clazz.getAnnotation(Description.class);
		System.err.println(name);
		
		if (desc != null) {
			System.err.println("description:\t" + desc.value());
		}
		final Collection<String> arguments = getAvailableArguments(clazz);
		if(!arguments.isEmpty()){
			System.err.println("argument in\t" + arguments);
		}
		final Collection<String> options = factory.getAttributes(name);
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
