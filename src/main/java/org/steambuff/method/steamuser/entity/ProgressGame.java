package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProgressGame {

    @SerializedName("stats")
    private List<StatsGame> statsList;

    @SerializedName("achievements")
    private List<AchievementsGame> achievementsList;

    public List<StatsGame> getStatsList() {
        return statsList;
    }

    public List<AchievementsGame> getAchievementsList() {
        return achievementsList;
    }
}
