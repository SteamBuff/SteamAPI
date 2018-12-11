package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;

/**
 * The type Available game stats.
 */
public class AvailableGameStats {

    @SerializedName("name")
    private String name;

    @SerializedName("defaultvalue")
    private int defaultvalue;

    @SerializedName("displayName")
    private String displayName;


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets defaultvalue.
     *
     * @return the defaultvalue
     */
    public int getDefaultvalue() {
        return defaultvalue;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }
}
