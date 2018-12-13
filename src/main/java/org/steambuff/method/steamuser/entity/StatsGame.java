package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

/**
 * The type Stats game.
 */
public class StatsGame {
    @SerializedName("name")
    private String nameStat;


    @SerializedName("value")
    private long value;

    /**
     * Gets name stat.
     *
     * @return the name stat
     */
    public String getNameStat() {
        return nameStat;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public long getValue() {
        return value;
    }
}
