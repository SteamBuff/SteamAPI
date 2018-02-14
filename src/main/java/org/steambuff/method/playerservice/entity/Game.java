package org.steambuff.method.playerservice.entity;

//TODO add Extended Game like (img_icon_url, img_logo_url, name)
public class Game {

    /**
     * Unique identifier for the game
     */
    private long appId;
    /**
     * The total number of minutes played "on record", since Steam began tracking total playtime in early 2009.
     */
    private long playtimeForever;
    /**
     * The total number of minutes played in the last 2 weeks
     */
    private long playtimeTwoWeek;
}
