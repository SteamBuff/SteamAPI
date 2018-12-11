package org.steambuff.steamuser.method;

import org.junit.Assert;
import org.junit.Test;
import org.steambuff.ReactionDriver;
import org.steambuff.SteamApi;
import org.steambuff.SteamApiTest;
import org.steambuff.TesterDriver;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;

/**
 * The type User stats.
 */
public class UserStats {

    private static TesterDriver testDriver = new TesterDriver("api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v0002/").
            addReaction(new ReactionDriver("GET", "US_good_1").addSteamId(new SteamId(0, 420936993)).addAppId(730).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "US_bad_2").addSteamId(new SteamId(0, 1)).addAppId(222).addKey(SteamApiTest.GOOD_KEY)).
            addReaction(new ReactionDriver("GET", "US_bad_1").addSteamIds(new SteamId(0, 420936994)).addAppId(730).addKey(SteamApiTest.GOOD_KEY));


    private SteamApi apiGood = new SteamApi(SteamApiTest.GOOD_KEY, testDriver);
    private SteamApi apiBad = new SteamApi(SteamApiTest.BAD_KEY, testDriver);

    /**
     * Test good parsing.
     *
     * @throws SteamApiException the steam api exception
     */
    @Test
    public void testGoodParsing() throws SteamApiException {
        org.steambuff.method.steamuser.entity.UserStats stats = apiGood.getSteamUserInterface().getUserStatsForGame(new SteamId(0, 420936993), 730);
        Assert.assertEquals(stats.getGameName(), "ValveTestApp260");
        Assert.assertEquals(stats.getSteamId().toString(), "STEAM_0:0:420936993");
        Assert.assertFalse(!stats.getProgressGame().getAchievementsList().get(0).isAchieved());
        Assert.assertEquals(stats.getProgressGame().getAchievementsList().get(0).getAchievementName(), "WIN_BOMB_PLANT");
        Assert.assertEquals(stats.getProgressGame().getStatsList().get(10).getNameStat(), "total_kills_glock");
        Assert.assertEquals(stats.getProgressGame().getStatsList().get(10).getValue(), 70);
    }

    /**
     * Test not full json.
     */
    @Test
    public void testNotFullJSON() {
        try {
            org.steambuff.method.steamuser.entity.UserStats stats = apiGood.getSteamUserInterface().getUserStatsForGame(new SteamId(0, 420936994), 730);
            Assert.fail();
        } catch (SteamApiException ignored) {
        }
    }

    /**
     * Test bad json.
     */
    @Test
    public void testBadJSON() {
        try {
            apiGood.getSteamUserInterface().getUserStatsForGame(new SteamId(0, 1), 222);
            Assert.fail();
        } catch (SteamApiException e) {
            if (!e.getMessage().equals("java.lang.IllegalStateException: Not a JSON Object: \"IS\"")) {
                Assert.fail();
            }
        }
    }


}
