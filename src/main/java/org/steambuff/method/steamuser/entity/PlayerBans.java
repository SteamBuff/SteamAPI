package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

public class PlayerBans {

    @SerializedName("SteamId")
    private String steamIdString;
    private SteamId steamId;

    @SerializedName("CommunityBanned")
    private boolean communityBannded;

    @SerializedName("VACBanned")
    private boolean vacBanned;

    @SerializedName("NumberOfVACBans")
    private int numberOfVACBans;

    @SerializedName("DaysSinceLastBan")
    private int daysSinceLastBan;

    @SerializedName("NumberOfGameBans")
    private int numberOfGameBans;

    @SerializedName("EconomyBan")
    //TODO Create Enums
    private String EconomyBanString;


    public SteamId getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(this.steamIdString);
        }
        return steamId;
    }

    public boolean hasCommunityBannded() {
        return communityBannded;
    }

    public boolean hasVacBanned() {
        return vacBanned;
    }

    public int getNumberOfVACBans() {
        return numberOfVACBans;
    }

    public int getDaysSinceLastBan() {
        return daysSinceLastBan;
    }

    public int getNumberOfGameBans() {
        return numberOfGameBans;
    }

    public String getEconomyBanString() {
        return EconomyBanString;
    }
}
