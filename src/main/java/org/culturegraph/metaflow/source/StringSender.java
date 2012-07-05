package org.culturegraph.metaflow.source;

import org.culturegraph.metastream.framework.DefaultSender;
import org.culturegraph.metastream.framework.ObjectPipe;
import org.culturegraph.metastream.framework.ObjectReceiver;


/**
 * Helper class to start a pipe with a {@link String}
 * 
 * @author Markus Michael Geipel
 */
public final class StringSender extends DefaultSender<ObjectReceiver<String>> 
		implements ObjectPipe<Object, ObjectReceiver<String>> {

	private final String string;
	
	public StringSender(final String string) {
		this.string = string;
	}
	
	@Override
	public void process(final Object notUsed) {
		if(notUsed==null){
		getReceiver().process(string);
		}else{
			throw new IllegalArgumentException("Parameter not used. Must be null");
		}
	}

}
