package org.steambuff.steamuser.method;

import org.junit.Assert;
import org.junit.Test;
import org.steambuff.SteamApi;
import org.steambuff.method.SteamId;
import org.steambuff.method.util.exception.SteamAdditionalUtilityException;
import org.steambuff.method.util.exception.SteamAdditionalUtilityIllegalArgumentException;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * The type Steam additional utility test.
 */
public class SteamAdditionalUtilityTest {

    /**
     * steamAdditionalUtility interface
     */
    private SteamApi steamApi = SteamApi.getInstance("");

    /**
     * Gets steam id by page.
     *
     * @throws MalformedURLException the malformed url exception
     */
    @Test
    public void getSteamIdByPage() throws MalformedURLException {
        SteamId steamId = steamApi.getSteamAdditionalUtility().getSteamIdByPage(new URL("https://steamcommunity.com/id/bigtows"));
        Assert.assertEquals(76561198802139714L, steamId.toId64());
    }

    /**
     * Gets steam id by page invalid url.
     *
     * @throws MalformedURLException the malformed url exception
     */
    @Test(expected = SteamAdditionalUtilityIllegalArgumentException.class)
    public void getSteamIdByPageInvalidUrl() throws MalformedURLException {
        steamApi.getSteamAdditionalUtility().getSteamIdByPage(new URL("https://notsteamcommunity.com/id/bigtows"));
    }

    /**
     * Gets steam id by page not found.
     *
     * @throws MalformedURLException the malformed url exception
     */
    @Test(expected = SteamAdditionalUtilityException.class)
    public void getSteamIdByPageNotFound() throws MalformedURLException {
        steamApi.getSteamAdditionalUtility().getSteamIdByPage(new URL("https://steamcommunity.com/id/1Not%20LOL"));
    }

    /**
     * Gets steam id by login.
     */
    @Test
    public void getSteamIdByLogin() {
        SteamId steamId = steamApi.getSteamAdditionalUtility().getSteamIdByLogin("BigTows");
        Assert.assertEquals(76561198802139714L, steamId.toId64());
    }

    /**
     * Gets steam id by login not found.
     */
    @Test(expected = SteamAdditionalUtilityException.class)
    public void getSteamIdByLoginNotFound() {
        steamApi.getSteamAdditionalUtility().getSteamIdByLogin("It's my new Login");
    }

}
