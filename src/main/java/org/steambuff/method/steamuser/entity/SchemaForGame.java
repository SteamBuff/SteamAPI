package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Schema for game.
 */
public class SchemaForGame {

    @SerializedName("gameName")
    private String gameName;

    @SerializedName("gameVersion")
    private String gameVersion;

    @SerializedName("stats")
    private List<AvailableGameStats> availableGameStatsList;


    @SerializedName("achievements")
    private List<AvailableGameAchievements> availableGameAchievementsList;


    /**
     * Gets game name.
     *
     * @return the game name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Gets game version.
     *
     * @return the game version
     */
    public String getGameVersion() {
        return gameVersion;
    }


    /**
     * Gets available game stats list.
     *
     * @return the available game stats list
     */
    public List<AvailableGameStats> getAvailableGameStatsList() {
        return availableGameStatsList;
    }

    /**
     * Gets available game achievements list.
     *
     * @return the available game achievements list
     */
    public List<AvailableGameAchievements> getAvailableGameAchievementsList() {
        return availableGameAchievementsList;
    }
}
