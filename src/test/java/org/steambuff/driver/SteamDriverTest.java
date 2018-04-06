package org.steambuff.driver;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.steambuff.exception.SteamApiException;

class SteamDriverTest {

    private SteamDriver steamDriver = new SteamDriver();

    @Test
    void getDataWithNullParams() {
        sendRequestToGoogle(true);
    }

    @Test
    void getDataWithNullUrl() {
        try {
            steamDriver.getData(null, null, null);
            Assert.fail();
        } catch (SteamApiException e) {
            if (!e.getMessage().equals("Url is null.")) {
                Assert.fail();
            }
        }
    }

    @Test
    void useHttps() {
        steamDriver.useHttps(false);
        sendRequestToGoogle(false);
        steamDriver.useHttps(true);
        sendRequestToGoogle(true);
    }

    private void sendRequestToGoogle(boolean isHttps) {
        try {
            steamDriver.getData("google.ru/ping", null, null);
            Assert.fail();
        } catch (SteamApiException e) {
            if (!e.getMessage().equals("Server returned HTTP response code: 400 for URL: http" + (isHttps ? "s" : "") + "://google.ru/ping")) {
                Assert.fail("Bad exception message: "+e.getMessage());
            }
        }
    }
}