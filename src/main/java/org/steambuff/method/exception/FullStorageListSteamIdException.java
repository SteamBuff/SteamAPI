package org.steambuff.method.exception;

/**
 * The type Full storage list steam id exception.
 */
public class FullStorageListSteamIdException extends ListSteamIdException {
    /**
     * Instantiates a new Full storage list steam id exception.
     *
     * @param message the message
     */
    public FullStorageListSteamIdException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Full storage list steam id exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public FullStorageListSteamIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
