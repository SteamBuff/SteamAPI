package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

public class StatsGame {

    @SerializedName("name")
    private String nameStat;

    //TODO Rename
    @SerializedName("value")
    private long value;
}
