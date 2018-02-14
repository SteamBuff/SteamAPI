package org.steambuff.exception;

public class SteamApiException extends Exception {

    public SteamApiException(String badJson) {
        super(badJson);
    }
}
