package org.steambuff.steamuser.stats;

import org.junit.Assert;
import org.junit.Test;
import org.steambuff.SteamApi;
import org.steambuff.SteamApiTest;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;

public class UserStats {

    private SteamApi apiGood = new SteamApi(SteamApiTest.GOOD_KEY, new DriverUserStats());
    private SteamApi apiBad = new SteamApi(SteamApiTest.BAD_KEY, new DriverUserStats());

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

    @Test
    public void testBadJSON() {
        try {
            org.steambuff.method.steamuser.entity.UserStats stats = apiGood.getSteamUserInterface().getUserStatsForGame(new SteamId(0, 420936994), 730);
            Assert.fail();
        } catch (SteamApiException ignored) {
        }
    }


}
