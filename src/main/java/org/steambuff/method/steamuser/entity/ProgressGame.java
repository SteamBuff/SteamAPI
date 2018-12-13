package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.exception.SteamApiException;

import java.util.List;

/**
 * The type Progress game.
 */
public class ProgressGame {

    @SerializedName("stats")
    private List<StatsGame> statsList;

    @SerializedName("achievements")
    private List<AchievementsGame> achievementsList;

    /**
     * Gets stats list.
     *
     * @return the stats list
     */
    public List<StatsGame> getStatsList() {
        return statsList;
    }

    /**
     * Gets achievements list.
     *
     * @return the achievements list
     */
    public List<AchievementsGame> getAchievementsList() {
        return achievementsList;
    }


    /**
     * Gets stat by name.
     *
     * @param name the name
     * @return the stat by name
     * @throws SteamApiException the steam api exception
     */
    public StatsGame getStatByName(String name) throws SteamApiException {
        for (StatsGame statsGame:statsList){
            if (statsGame.getNameStat().equalsIgnoreCase(name)) {
                return statsGame;
            }
        }
        throw new SteamApiException("Stat with name "+name+" not found.");
    }
}
