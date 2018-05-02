package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

public class AvailableGameStats {

    @SerializedName("name")
    private String name;

    @SerializedName("defaultvalue")
    private int defaultvalue;

    @SerializedName("displayName")
    private String displayName;


    public String getName() {
        return name;
    }

    public int getDefaultvalue() {
        return defaultvalue;
    }

    public String getDisplayName() {
        return displayName;
    }
}
