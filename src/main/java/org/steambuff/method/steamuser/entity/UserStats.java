package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;
import org.steambuff.method.SteamIdInterface;

public class UserStats {

    @SerializedName("steamID")
    private String steamIdString;
    private SteamIdInterface steamId;

    @SerializedName("gameName")
    private String gameName;

    @SerializedName("progressGame")
    private ProgressGame progressGame;

    public SteamIdInterface getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(steamIdString);
        }
        return steamId;
    }

    public String getGameName() {
        return gameName;
    }

    public ProgressGame getProgressGame() {
        return progressGame;
    }
}
