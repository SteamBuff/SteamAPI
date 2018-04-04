package org.steambuff.steamuser;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.steambuff.ResourceHelper;
import org.steambuff.SteamApi;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.enums.CommunityVisibilityState;
import org.steambuff.method.steamuser.entity.enums.PersonaState;
import org.steambuff.method.steamuser.entity.enums.ProfileState;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class PlayerSummariesTest {

    static String KEY_STEAM_API = "GOOD_KEY";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private DriverInterface driver = new DriverPlayerSummaries();

    private SteamApi steamApi = new SteamApi(KEY_STEAM_API, driver);
    private SteamUserInterface steamUserInterface = steamApi.getSteamUserInterface();

    @Test
    void checkParserGood() throws SteamApiException {
        PlayerSummaries tester = steamUserInterface.getPlayerSummaries(new SteamId(0, 23)).get(0);
        assertEquals(tester.getSteamId().toId64(),new SteamId(0,23).toId64());
        assertEquals(tester.getAvatar(),"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39.jpg");
        assertEquals(tester.getAvatarFull(),"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39_full.jpg");
        assertEquals(tester.getAvatarMedium(),"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39_medium.jpg");
        assertEquals(tester.getCommunityVisibilityState(), CommunityVisibilityState.PRIVATE);
        assertEquals(tester.getDisplayName(), "Wheels");
        assertEquals(tester.getProfileState(), ProfileState.CONFIGURED);
        assertEquals(tester.getPersonaState(), PersonaState.OFFLINE);
    }

    @Test()
    void badSteamId() throws SteamApiException {
        assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, -1)).size());

    }

    @Test
    void badJson() throws SteamApiException {
        try {
            assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, 1)).size());
            fail();
        } catch (SteamApiException exception) {

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

    @Override
    public DriverInterface useHttps(boolean useHttps) {
        return this;
    }
}
