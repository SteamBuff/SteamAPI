package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;
import org.steambuff.method.SteamIdInterface;

import java.util.List;

public class UserStats {

    @SerializedName("steamID")
    private String steamIdString;
    private SteamIdInterface steamId;

    @SerializedName("gameName")
    private String gameName;

    @SerializedName("stats")
    private List<StatsGame> test;

    public SteamIdInterface getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(steamIdString);
        }
        return steamId;
    }

    public String getGameName() {
        return gameName;
    }

    public List<StatsGame> getTest() {
        return test;
    }
}
