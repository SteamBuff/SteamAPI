package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

/**
 * The type Available game achievements.
 */
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


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets default value.
     *
     * @return the default value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets hidden.
     *
     * @return the hidden
     */
    public int getHidden() {
        return hidden;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Gets icon gray.
     *
     * @return the icon gray
     */
    public String getIconGray() {
        return iconGray;
    }
}
