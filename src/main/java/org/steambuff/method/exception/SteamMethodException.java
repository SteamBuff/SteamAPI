package org.steambuff.method.exception;

/**
 * The type Steam method exception.
 */
public class SteamMethodException extends RuntimeException {
    /**
     * Instantiates a new Steam method exception.
     *
     * @param message the message
     */
    public SteamMethodException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Steam method exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SteamMethodException(String message, Throwable cause) {
        super(message, cause);
    }
}
