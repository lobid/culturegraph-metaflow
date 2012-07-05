package org.culturegraph.metaflow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.culturegraph.metaflow.source.StringSender;
import org.culturegraph.metastream.annotation.Description;
import org.culturegraph.metastream.annotation.In;
import org.culturegraph.metastream.annotation.Out;
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

	private static final ObjectFactory<Object> PIPE_FACTORY = new ObjectFactory<Object>();
	private static final String POPERTIES_LOCATION = "metaflow-pipe.properties";
	private static final String USER_POPERTIES_LOCATION = "metaflow-pipe-user.properties";

	static {
		PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(POPERTIES_LOCATION), Object.class);
		try {
			PIPE_FACTORY.loadClassesFromMap(ResourceUtil.loadProperties(USER_POPERTIES_LOCATION), Object.class);
		} catch (CulturegraphUtilException e) {
			// user properties are not mandatory, so just ignore
		}

	}

	private Metaflow() {
		// no instances
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		if (args.length != 1) {
			printHelp();
			System.exit(0);
		}

		final Object startPoint = buildPipeFromDescription(args[0]);
		startPipe(startPoint);

	}

	private static void startPipe(final Object startPoint) {
		((ObjectReceiver<String>) startPoint).process(null);
	}

	private static Object buildPipeFromDescription(final String string) {
		final String[] parts = PIPE_PATTERN.split(string);

		Object element = new StringSender(parts[0]);
		Object nextElement;
		final Object startPoint = element;
		
		for (int i = 1; i < parts.length; ++i) {
			final String part = parts[i];
			final Matcher matcher = CONSTRUCTOR_PATTERN.matcher(part);
			final String name;
			final String[] args;
			if (matcher.matches()) {
				name = matcher.group(1);
				args = new String[] { matcher.group(2) };
			} else {
				name = part;
				args = new String[0];
			}
			nextElement = PIPE_FACTORY.newInstance(name, args);

			if (element instanceof Sender) {
				final Sender sender = (Sender) element;
				sender.setReceiver(nextElement);
			} else {
				System.err.println("not a sender");
			}
			element = nextElement;
		}

		return startPoint;
	}

	private static void printHelp() {
		System.err.println("Usage:\tMetaflow \"PIPE_DESCRIPTION\"");
		System.err.println("\tPIPE_DESCRIPTION := PIPE_ELEMENT (| PIPE_ELEMENT)*\n");
		System.err.println("Available pipe elements:\n");
		for (String name : PIPE_FACTORY.keySet()) {
			final Class<?> clazz = PIPE_FACTORY.getClass(name);
			final Description desc = clazz.getAnnotation(Description.class);
			System.err.println(name);
			if (desc != null) {
				System.err.println("description:\t" + desc.value());
			}
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
			System.err.println("signiture:\t" + inString + " -> " + outString);
			System.err.println();
			
		}
		System.err.println("Example: FILENAME | openFile | read(marc21) | morph(src/test/resources/morph/ingest.marc21.xml) | stdout");
	}

}
