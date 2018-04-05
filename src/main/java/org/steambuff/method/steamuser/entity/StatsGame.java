package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

public class StatsGame {
    @SerializedName("name")
    private String nameStat;


    @SerializedName("value")
    private long value;

    public String getNameStat() {
        return nameStat;
    }

    public long getValue() {
        return value;
    }
}
