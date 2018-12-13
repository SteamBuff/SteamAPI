package org.steambuff.steamuser.method;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.steambuff.ReactionDriver;
import org.steambuff.SteamApi;
import org.steambuff.SteamApiTest;
import org.steambuff.TesterDriver;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerBans;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Player bans test.
 */
class PlayerBansTest {

    private static TesterDriver testDriver = new TesterDriver("api.steampowered.com/ISteamUser/GetPlayerBans/v1/").
            addReaction(new ReactionDriver("GET", "PB_good_1").addSteamIds(new SteamId(0, 23)).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "emptyFile").addSteamIds(new SteamId(0, -1)).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "PB_bad_1").addSteamIds(new SteamId(0, -2)).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "PB_good_2").addSteamIds(new ListSteamId().add(new SteamId(0, 123)).add(new SteamId(0, -1))).addKey(SteamApiTest.GOOD_KEY));

    private SteamApi steamApi = new SteamApi(SteamApiTest.GOOD_KEY, testDriver);


    /**
     * Check parser good.
     *
     * @throws SteamApiException the steam api exception
     */
    @Test
    void checkParserGood() throws SteamApiException {
        PlayerBans player = steamApi.getSteamUserInterface().getPlayerBans(new SteamId(0, 23)).get(0);
        Assert.assertEquals(player.getDaysSinceLastBan(), 510);
        Assert.assertEquals(player.getEconomyBanString(), "none");
        Assert.assertEquals(player.getNumberOfGameBans(), 0);
        Assert.assertEquals(player.getNumberOfVACBans(), 1);
        Assert.assertEquals(player.getSteamId().toString(), new SteamId(0, 23).toString());
        Assert.assertTrue(player.hasCommunityBannded());
    }


    /**
     * Check bad npe.
     */
    @Test
    void checkBadNPE() {
        try {
            steamApi.getSteamUserInterface().getPlayerBans(new SteamId(0, -1));
            Assert.fail();
        } catch (SteamApiException ignored) {
        }
    }

    /**
     * Check bad.
     */
    @Test
    void checkBad() {
        try {
            steamApi.getSteamUserInterface().getPlayerBans(new SteamId(0, -2));
            Assert.fail();
        } catch (SteamApiException ignored) {
        }
    }


    /**
     * Test list players.
     *
     * @throws SteamApiException the steam api exception
     */
    @Test
    void testListPlayers() throws SteamApiException {

        ListSteamId listSteamId = new ListSteamId(new SteamId(0, 123)).add(new SteamId(0, -1));
        List<PlayerBans> player = steamApi.getSteamUserInterface().getPlayerBans(listSteamId);
        Assert.assertEquals(player.size(), 1);
        Assert.assertEquals(player.get(0).getSteamId().toId64(), 76561197960265974L);


        List<SteamId> steamIds = new ArrayList<>();
        steamIds.add(new SteamId(0, 123));
        listSteamId = new ListSteamId(steamIds).add(new SteamId(0, -1));
        player = steamApi.getSteamUserInterface().getPlayerBans(listSteamId);
        Assert.assertEquals(player.size(), 1);
        Assert.assertEquals(player.get(0).getSteamId().toId64(), 76561197960265974L);

    }

}
