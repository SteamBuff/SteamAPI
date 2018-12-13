package org.steambuff.method.util.exception;

import org.steambuff.method.exception.SteamMethodException;

/**
 * The type Steam additional utility exception.
 */
public class SteamAdditionalUtilityException extends SteamMethodException {
    /**
     * Instantiates a new Steam additional utility exception.
     *
     * @param message the message
     */
    public SteamAdditionalUtilityException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Steam additional utility exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SteamAdditionalUtilityException(String message, Throwable cause) {
        super(message, cause);
    }
}
