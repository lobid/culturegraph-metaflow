package org.culturegraph.metaflow;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.culturegraph.metaflow.parser.MetaflowLexer;
import org.culturegraph.metaflow.parser.MetaflowParser;
import org.culturegraph.util.ResourceUtil;

/**
 * @author Markus Michael Geipel
 * 
 */
public final class Metaflow2 {

	



	private Metaflow2() {
		// no instances
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(final String[] args) throws IOException, RecognitionException {
		final InputStream flowDef;
		if(args.length==1){
			flowDef = new ByteArrayInputStream(args[0].getBytes("UTF-8"));
		}else if(args.length==2 && "-f".equals(args[0])){
			flowDef = ResourceUtil.getStream(args[1]);
		}else {
			//printHelp();
			return;
		}

		final MetaflowParser parser = new MetaflowParser(new CommonTokenStream(new MetaflowLexer(new ANTLRInputStream(flowDef))));
		parser.flow();
		
		parser.getFlow().start();
	}

}
