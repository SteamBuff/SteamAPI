package org.steambuff.method.playerservice.entity;

import com.google.gson.annotations.SerializedName;

/**
 * The type Game.
 */
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


    /**
     * Gets app id.
     *
     * @return the app id
     */
    public long getAppId() {
        return appId;
    }

    /**
     * Gets playtime forever.
     *
     * @return the playtime forever
     */
    public long getPlaytimeForever() {
        return playtimeForever;
    }

    /**
     * Gets playtime two week.
     *
     * @return the playtime two week
     */
    public long getPlaytimeTwoWeek() {
        return playtimeTwoWeek;
    }

    /**
     * Gets icon url.
     *
     * @return the icon url
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Has community visible stats boolean.
     *
     * @return the boolean
     */
    public boolean hasCommunityVisibleStats() {
        return communityVisibleStats;
    }
}
