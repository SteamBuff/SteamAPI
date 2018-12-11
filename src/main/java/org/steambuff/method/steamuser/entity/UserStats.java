package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;
import org.steambuff.method.SteamIdInterface;

/**
 * The type User stats.
 */
public class UserStats {

    @SerializedName("steamID")
    private String steamIdString;
    private SteamIdInterface steamId;

    @SerializedName("gameName")
    private String gameName;

    @SerializedName("progressGame")
    private ProgressGame progressGame;

    /**
     * Gets steam id.
     *
     * @return the steam id
     */
    public SteamIdInterface getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(steamIdString);
        }
        return steamId;
    }

    /**
     * Gets game name.
     *
     * @return the game name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Gets progress game.
     *
     * @return the progress game
     */
    public ProgressGame getProgressGame() {
        return progressGame;
    }
}
