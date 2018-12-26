package org.steambuff.method.exception;

/**
 * The type List steam id exception.
 */
public class ListSteamIdException extends RuntimeException {
    /**
     * Instantiates a new List steam id exception.
     *
     * @param message the message
     */
    public ListSteamIdException(String message) {
        super(message);
    }

    /**
     * Instantiates a new List steam id exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public ListSteamIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
