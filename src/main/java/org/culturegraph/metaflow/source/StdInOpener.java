package org.culturegraph.metaflow.source;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.culturegraph.metastream.annotation.Description;
import org.culturegraph.metastream.annotation.In;
import org.culturegraph.metastream.annotation.Out;
import org.culturegraph.metastream.framework.DefaultObjectPipe;
import org.culturegraph.metastream.framework.ObjectReceiver;

/**
 * Helper class to open stdin
 * 
 * @author Markus Michael Geipel
 * 
 */
@Description("Opens a file.")
@In(String.class)
@Out(java.io.Reader.class)
public final class StdInOpener extends DefaultObjectPipe<Object, ObjectReceiver<java.io.Reader>> {

	@Override
	public void process(final Object notUsed) {
		if (notUsed == null) {
			BufferedReader stdin;
			try {
				stdin = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				throw new IllegalStateException("UTF-8 not supported", e);
			}
			getReceiver().process(stdin);
		} else {
			throw new IllegalArgumentException("Parameter not used. Must be null");
		}
	}
}
