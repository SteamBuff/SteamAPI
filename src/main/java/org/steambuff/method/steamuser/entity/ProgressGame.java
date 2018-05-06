package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.exception.SteamApiException;

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


    public StatsGame getStatByName(String name) throws SteamApiException {
        for (StatsGame statsGame:statsList){
           if (statsGame.getNameStat().equalsIgnoreCase(name)){
               return statsGame;
           }
        }
        throw new SteamApiException("Stat with name "+name+" not found.");
    }
}
