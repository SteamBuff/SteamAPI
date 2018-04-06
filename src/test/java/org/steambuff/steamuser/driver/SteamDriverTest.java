package org.steambuff.steamuser.driver;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.driver.SteamDriver;
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

    @Test
    void testGood() {
        try {
            steamDriver.getData("yandex.ru", new RequestParams(), "GET");
        } catch (SteamApiException e) {
            Assert.fail("fail on request....");
        }
    }

    @Test
    void checkParams(){
        Params params = new RequestParams();
        params.addParams("test","UNIQ_VALUE");
        Assert.assertEquals(params.getParamByKey("test"),"UNIQ_VALUE");
        Assert.assertNull(params.getParamByKey("test2"));
    }

    private void sendRequestToGoogle(boolean isHttps) {
        try {
            steamDriver.getData("google.ru/ping", null, null);
            Assert.fail();
        } catch (SteamApiException e) {
            if (!e.getMessage().equals("Server returned HTTP response code: 400 for URL: http" + (isHttps ? "s" : "") + "://google.ru/ping")) {
                Assert.fail("Bad exception message: " + e.getMessage());
            }
        }
    }
}