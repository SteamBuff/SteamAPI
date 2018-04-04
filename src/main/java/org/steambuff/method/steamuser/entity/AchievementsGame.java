package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

public class AchievementsGame {

    @SerializedName("name")
    private String achievementName;

    @SerializedName("achieved")
    private int isAchieved;


    public String getAchievementName() {
        return achievementName;
    }

    public int isAchieved() {
        return isAchieved;
    }
}
