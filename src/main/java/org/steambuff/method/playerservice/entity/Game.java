package org.steambuff.method.playerservice.entity;

import com.google.gson.annotations.SerializedName;

public class Game {

    /**
     * Unique identifier for the game
     */
    @SerializedName("appid")
    private long appId;
    /**
     * The total number of minutes played "on record", since Steam began tracking total playtime in early 2009.
     */
    @SerializedName("playtime_forever")
    private long playtimeForever;
    /**
     * The total number of minutes played in the last 2 weeks
     */
    @SerializedName("playtime_2weeks")
    private long playtimeTwoWeek;

    @SerializedName("img_icon_url")
    private String iconUrl;


    @SerializedName("img_logo_url")
    private String logoUrl;


    @SerializedName("has_community_visible_stats")
    private boolean communityVisibleStats;


    public long getAppId() {
        return appId;
    }

    public long getPlaytimeForever() {
        return playtimeForever;
    }

    public long getPlaytimeTwoWeek() {
        return playtimeTwoWeek;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public boolean hasCommunityVisibleStats() {
        return communityVisibleStats;
    }
}
