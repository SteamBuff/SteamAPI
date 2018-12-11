package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

/**
 * The type Achievements game.
 */
public class AchievementsGame {

    @SerializedName("name")
    private String achievementName;

    @SerializedName("achieved")
    private int isAchieved;


    /**
     * Gets achievement name.
     *
     * @return the achievement name
     */
    public String getAchievementName() {
        return achievementName;
    }

    /**
     * Is achieved boolean.
     *
     * @return the boolean
     */
    public boolean isAchieved() {
        return isAchieved == 1;
    }
}
