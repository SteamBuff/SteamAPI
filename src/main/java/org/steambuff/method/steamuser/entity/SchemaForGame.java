package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SchemaForGame {

    @SerializedName("gameName")
    private String gameName;

    @SerializedName("gameVersion")
    private String gameVersion;

    @SerializedName("stats")
    private List<AvailableGameStats> availableGameStatsList;


    @SerializedName("achievements")
    private List<AvailableGameAchievements> availableGameAchievementsList;


    public String getGameName() {
        return gameName;
    }

    public String getGameVersion() {
        return gameVersion;
    }


    public List<AvailableGameStats> getAvailableGameStatsList() {
        return availableGameStatsList;
    }

    public List<AvailableGameAchievements> getAvailableGameAchievementsList() {
        return availableGameAchievementsList;
    }
}
