package org.steambuff.steamuser;

import org.junit.jupiter.api.Test;
import org.steambuff.ResourceHelper;
import org.steambuff.SteamApi;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.entity.PlayerSummaries;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class PlayerSummariesTest {

    static String KEY_STEAM_API = "GOOD_KEY";
    private DriverInterface driver = new DriverPlayerSummaries();

    private SteamApi steamApi = new SteamApi(KEY_STEAM_API, driver);
    private SteamUserInterface steamUserInterface = steamApi.getSteamUserInterface();

    @Test
    void checkParserGood() throws SteamApiException {
        PlayerSummaries tester = steamUserInterface.getPlayerSummaries(new SteamId(0, 23)).get(0);
        assertEquals(tester.getDisplayName(), "Wheels");
    }

    @Test()
    void badSteamId() throws SteamApiException {
        assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, -1)).size());
        try {
            assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, 1)).size());
            fail();
        } catch (SteamApiException e) {
        }
    }

}

class DriverPlayerSummaries implements DriverInterface {

    @Override
    public String getData(String url, Params params, String method) {
        if (params.getParamByKey("key") == PlayerSummariesTest.KEY_STEAM_API) {
            switch ((String) params.getParamByKey("steamids")) {
                case "76561197960265774,":
                    return ResourceHelper.getJSON("PS_good_1");
                case "76561197960265726,":
                    return ResourceHelper.getJSON("PS_bad_1");
                case "76561197960265730,":
                    return ResourceHelper.getJSON("PS_bad_2");
            }
            System.out.println(params.getParamByKey("steamids"));
        }
        return null;
    }
}
