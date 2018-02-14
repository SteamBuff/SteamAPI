package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

public class PlayerSummaries {

    @SerializedName("steamid")
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

    public PlayerSummaries() {
    }

}


/**
 On Public
 "steamid": "76561198176893622",
 "communityvisibilitystate": 3,
 "profilestate": 1,
 "personaname": "DELETE",
 "lastlogoff": 1485868979,
 "commentpermission": 2,
 "profileurl": "http://steamcommunity.com/id/BigTows2/",
 "avatar": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a.jpg",
 "avatarmedium": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_medium.jpg",
 "avatarfull": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_full.jpg",
 "personastate": 0,
 "realname": "DELETE",
 "primaryclanid": "103582791429521408",
 "timecreated": 1422736160,
 "personastateflags": 0,
 "loccountrycode": "NF"

 */