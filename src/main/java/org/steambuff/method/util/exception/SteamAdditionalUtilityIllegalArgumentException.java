package org.steambuff.method.util.exception;

import org.steambuff.method.exception.SteamMethodIllegalArgumentException;

/**
 * The type Steam additional utility illegal argument exception.
 */
public class SteamAdditionalUtilityIllegalArgumentException extends SteamMethodIllegalArgumentException {
    /**
     * Instantiates a new Steam additional utility illegal argument exception.
     *
     * @param message the message
     */
    public SteamAdditionalUtilityIllegalArgumentException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Steam additional utility illegal argument exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SteamAdditionalUtilityIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
