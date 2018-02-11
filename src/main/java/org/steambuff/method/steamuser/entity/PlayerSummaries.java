package org.steambuff.method.steamuser.entity;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

import java.lang.reflect.Type;

public class PlayerSummaries {

    private SteamId steamId;

    @SerializedName("personaname")
    private String displayName;

    private String profileUrl;

    private String avatar;

    private String avatarmedium;

    private String avatarFull;


    public SteamId getSteamId() {
        return steamId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
