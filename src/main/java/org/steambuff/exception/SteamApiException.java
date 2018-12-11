package org.steambuff.exception;

/**
 * The type Steam api exception.
 */
public class SteamApiException extends Exception {

    /**
     * Instantiates a new Steam api exception.
     *
     * @param badJson the bad json
     */
    public SteamApiException(String badJson) {
        super(badJson);
    }
}
