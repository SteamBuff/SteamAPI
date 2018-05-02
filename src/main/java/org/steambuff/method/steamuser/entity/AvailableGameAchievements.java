package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

public class AvailableGameAchievements {


    @SerializedName("name")
    private String name;

    @SerializedName("defaultvalue")
    private String defaultValue;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("hidden")
    private int hidden;

    @SerializedName("description")
    private String description;

    @SerializedName("icon")
    private String icon;

    @SerializedName("icongray")
    private String iconGray;


    public String getName() {
        return name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHidden() {
        return hidden;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public String getIconGray() {
        return iconGray;
    }
}
