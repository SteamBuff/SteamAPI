package org.steambuff.steamuser.method;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.steambuff.ReactionDriver;
import org.steambuff.SteamApi;
import org.steambuff.SteamApiTest;
import org.steambuff.TesterDriver;
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


    private static TesterDriver testDriver = new TesterDriver("api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/").
            addReaction(new ReactionDriver("GET", "PS_good_1").addSteamIds(new SteamId(0, 23)).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "PS_bad_1").addSteamIds(new SteamId(0, -1)).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "PS_bad_2").addSteamIds(new SteamId(0, 1)).addKey(SteamApiTest.GOOD_KEY));
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private SteamApi steamApi = new SteamApi(SteamApiTest.GOOD_KEY, testDriver);
    private SteamUserInterface steamUserInterface = steamApi.getSteamUserInterface();


    @Test
    void checkParserGood() throws SteamApiException {
        PlayerSummaries tester = steamUserInterface.getPlayerSummaries(new SteamId(0, 23)).get(0);
        assertEquals(tester.getSteamId().toId64(), new SteamId(0, 23).toId64());
        assertEquals(tester.getAvatar(), "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39.jpg");
        assertEquals(tester.getAvatarFull(), "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39_full.jpg");
        assertEquals(tester.getAvatarMedium(), "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/16/163e2fd02f3bb4257696ce2c5695233b470c3f39_medium.jpg");
        assertEquals(tester.getCommunityVisibilityState(), CommunityVisibilityState.PRIVATE);
        assertEquals(tester.getDisplayName(), "Wheels");
        assertEquals(tester.getProfileState(), ProfileState.CONFIGURED);
        assertEquals(tester.getPersonaState(), PersonaState.OFFLINE);
        assertEquals(tester.getLastLogOff(), 1518382649);
        assertEquals(tester.getProfileUrl(), "http://steamcommunity.com/id/wheels10/");
    }

    @Test()
    void badSteamId() throws SteamApiException {
        assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, -1)).size());

    }

    @Test
    void badJson() {
        try {
            assertEquals(0, steamUserInterface.getPlayerSummaries(new SteamId(0, 1)).size());
            fail();
        } catch (SteamApiException exception) {
            if (!exception.getMessage().equals("java.lang.IllegalStateException: Not a JSON Object: \"THIS!!!ISNOTJSON\"")) {
                fail();
            }
        }
    }

}
