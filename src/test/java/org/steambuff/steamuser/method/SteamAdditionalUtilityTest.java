package org.steambuff.steamuser.method;

import org.junit.Assert;
import org.junit.Test;
import org.steambuff.SteamApi;
import org.steambuff.method.SteamId;

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

    @Test
    public void getSteamIdByLogin() {
        SteamId steamId = steamApi.getSteamAdditionalUtility().getSteamIdByLogin("BigTows");
        Assert.assertEquals(76561198802139714L, steamId.toId64());
    }

}
