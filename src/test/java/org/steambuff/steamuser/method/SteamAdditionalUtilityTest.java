package org.steambuff.steamuser.method;

import org.junit.Assert;
import org.junit.Test;
import org.steambuff.driver.SteamDriver;
import org.steambuff.method.SteamId;
import org.steambuff.method.util.SteamAdditionalUtilityImpl;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * The type Steam additional utility test.
 */
public class SteamAdditionalUtilityTest {

    /**
     * steamAdditionalUtility interface
     */
    private SteamAdditionalUtilityImpl steamAdditionalUtility = new SteamAdditionalUtilityImpl(new SteamDriver());

    /**
     * Gets steam id by page.
     *
     * @throws MalformedURLException the malformed url exception
     */
    @Test
    public void getSteamIdByPage() throws MalformedURLException {
        SteamId steamId = steamAdditionalUtility.getSteamIdByPage(new URL("https://steamcommunity.com/id/bigtows"));
        Assert.assertEquals(76561198802139714L, steamId.toId64());
    }

}
