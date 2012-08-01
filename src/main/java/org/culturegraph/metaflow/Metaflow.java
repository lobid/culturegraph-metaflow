package org.culturegraph.metaflow;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.culturegraph.metaflow.parser.FlowBuilder;
import org.culturegraph.metaflow.parser.MetaflowLexer;
import org.culturegraph.metaflow.parser.MetaflowParser;
import org.culturegraph.util.ResourceUtil;

/**
 * @author Markus Michael Geipel
 * 
 */
public final class Metaflow {

	private static final Pattern VAR_PATTERN = Pattern.compile("([^=]*)=(.*)");

	private Metaflow() {
		// no instances
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public static void main(final String[] args) throws IOException, RecognitionException {

		// get flow description
		final InputStream flowDef;
		final int varStart;
		if (args.length == 0) {
			Flow.printHelp();
			return;
		} else if (args.length > 1 && "-f".equals(args[0])) {
			flowDef = ResourceUtil.getStream(args[1]);
			varStart = 2;
		} else {
			flowDef = new ByteArrayInputStream(args[0].getBytes("UTF-8"));
			varStart = 1;
		}

		// get variable assignments
		final Map<String, String> vars = new HashMap<String, String>();
		for (int i = varStart; i < args.length; ++i) {
			final Matcher matcher = VAR_PATTERN.matcher(args[i]);
			if (!matcher.find()) {
				Flow.printHelp();
				return;
			}
			vars.put(matcher.group(1), matcher.group(2));
		}

		// run parser and builder
		final MetaflowParser parser = new MetaflowParser(new CommonTokenStream(new MetaflowLexer(new ANTLRInputStream(
				flowDef))));
		final CommonTreeNodeStream treeNodes = new CommonTreeNodeStream(parser.metaflow().getTree());
		final FlowBuilder flowBuilder = new FlowBuilder(treeNodes);
		flowBuilder.addVaribleAssignements(vars);
		final Flow flow = flowBuilder.metaflow();

		flow.start();
	}
}