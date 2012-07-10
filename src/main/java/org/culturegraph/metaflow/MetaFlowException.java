package org.culturegraph.metaflow;

/**
 * @author Markus Michael Geipel
 *
 */
public final class MetaFlowException extends RuntimeException {

	private static final long serialVersionUID = -5728526458760884738L;

	public MetaFlowException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public MetaFlowException(final String message) {
		super(message);
	}
	
}
