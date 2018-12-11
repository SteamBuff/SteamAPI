package org.steambuff.method.exception;

/**
 * The type Steam method illegal argument exception.
 */
public class SteamMethodIllegalArgumentException extends IllegalArgumentException {
    /**
     * Instantiates a new Steam method illegal argument exception.
     *
     * @param message the message
     */
    public SteamMethodIllegalArgumentException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Steam method illegal argument exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SteamMethodIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
