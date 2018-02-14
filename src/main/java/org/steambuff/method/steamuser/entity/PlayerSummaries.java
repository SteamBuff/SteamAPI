package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

public class PlayerSummaries {

    private SteamId steamId;

    @SerializedName("personaname")
    private String displayName;

    @SerializedName("profileurl")
    private String profileUrl;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatarmedium")
    private String avatarMedium;

    @SerializedName("avatarfull")
    private String avatarFull;


    public SteamId getSteamId() {
        return steamId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public String getAvatarFull() {
        return avatarFull;
    }

}
