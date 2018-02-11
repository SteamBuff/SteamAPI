package org.steambuff.steamuser;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.*;
import org.steambuff.ResourceHelper;
import org.steambuff.SteamApi;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.entity.PlayerSummaries;

class PlayerSummariesTest {

    static String KEY_STEAM_API = "GOOD_KEY";
    private DriverInterface driver = new DriverPlayerSummaries();

    private SteamApi steamApi = new SteamApi(KEY_STEAM_API,driver);
    private SteamUserInterface steamUserInterface = steamApi.getSteamUserInterface();
    @Test
    void testCheckParserGood() {
        PlayerSummaries tester = steamUserInterface.getPlayerSummaries(new SteamId(0,23)).get(0);
        assertEquals(tester.getDisplayName(),"Wheels");
    }

}

class DriverPlayerSummaries implements DriverInterface {

    @Override
    public String getData(String url, Params params, String method) {
        if (params.getParamByKey("key") == PlayerSummariesTest.KEY_STEAM_API){

            switch ((String) params.getParamByKey("steamids")){
                case "76561197960265774,": return ResourceHelper.getJSON("PS_good_1");
            }
            System.out.println(params.getParamByKey("steamids"));
        }
        return null;
    }
}
