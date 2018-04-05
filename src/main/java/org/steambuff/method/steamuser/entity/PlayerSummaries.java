package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.enums.CommunityVisibilityState;
import org.steambuff.method.steamuser.entity.enums.PersonaState;
import org.steambuff.method.steamuser.entity.enums.ProfileState;

public class PlayerSummaries {

    @SerializedName("steamid")
    private String steamIdString;
    private SteamId steamId;


    @SerializedName("communityvisibilitystate")
    private int communityVisibilityStateInt;
    private CommunityVisibilityState communityVisibilityState;

    @SerializedName("profilestate")
    private int profileStateInt;
    private ProfileState profileState;

    @SerializedName("personaname")
    private String displayName;

    @SerializedName("lastlogoff")
    private int lastLogOff;

    @SerializedName("profileurl")
    private String profileUrl;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatarmedium")
    private String avatarMedium;

    @SerializedName("avatarfull")
    private String avatarFull;

    @SerializedName("personastate")
    private int personaStateInt;
    private PersonaState personaState;


    public SteamId getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(this.steamIdString);
        }
        return steamId;
    }

    public CommunityVisibilityState getCommunityVisibilityState() {
        if (communityVisibilityState == null) {
            communityVisibilityState = CommunityVisibilityState.getEnumByInt(this.communityVisibilityStateInt);
        }
        return communityVisibilityState;
    }

    public ProfileState getProfileState() {
        if (profileState == null) {
            profileState = ProfileState.getEnumByInt(this.profileStateInt);
        }
        return profileState;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getLastLogOff() {
        return lastLogOff;
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

    public PersonaState getPersonaState() {
        if (personaState == null) {
            personaState = PersonaState.getEnumByInt(this.personaStateInt);
        }
        return personaState;
    }

}


/**
 * On Public
 * "steamid": "76561198176893622",
 * "communityvisibilitystate": 3,
 * "profilestate": 1,
 * "personaname": "DELETE",
 * "lastlogoff": 1485868979,
 * "commentpermission": 2,
 * "profileurl": "http://steamcommunity.com/id/BigTows2/",
 * "avatar": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a.jpg",
 * "avatarmedium": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_medium.jpg",
 * "avatarfull": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_full.jpg",
 * "personastate": 0,
 * "realname": "DELETE",
 * "primaryclanid": "103582791429521408",
 * "timecreated": 1422736160,
 * "personastateflags": 0,
 * "loccountrycode": "NF"
 * <p>
 * onPrivate
 * "steamid": "76561198176893622",
 * "communityvisibilitystate": 1,
 * "profilestate": 1,
 * "personaname": "DELETE",
 * "lastlogoff": 1485868979,
 * "commentpermission": 2,
 * "profileurl": "http://steamcommunity.com/id/BigTows2/",
 * "avatar": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a.jpg",
 * "avatarmedium": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_medium.jpg",
 * "avatarfull": "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/db/db7de3c1158222cfa1e5dffb000b5075231df70a_full.jpg",
 * "personastate": 0
 */