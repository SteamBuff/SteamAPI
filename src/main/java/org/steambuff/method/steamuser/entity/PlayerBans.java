package org.steambuff.method.steamuser.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

/**
 * The type Player bans.
 */
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


    /**
     * Gets steam id.
     *
     * @return the steam id
     */
    public SteamId getSteamId() {
        if (steamId == null) {
            steamId = new SteamId(this.steamIdString);
        }
        return steamId;
    }

    /**
     * Has community bannded boolean.
     *
     * @return the boolean
     */
    public boolean hasCommunityBannded() {
        return communityBannded;
    }

    /**
     * Has vac banned boolean.
     *
     * @return the boolean
     */
    public boolean hasVacBanned() {
        return vacBanned;
    }

    /**
     * Gets number of vac bans.
     *
     * @return the number of vac bans
     */
    public int getNumberOfVACBans() {
        return numberOfVACBans;
    }

    /**
     * Gets days since last ban.
     *
     * @return the days since last ban
     */
    public int getDaysSinceLastBan() {
        return daysSinceLastBan;
    }

    /**
     * Gets number of game bans.
     *
     * @return the number of game bans
     */
    public int getNumberOfGameBans() {
        return numberOfGameBans;
    }

    /**
     * Gets economy ban string.
     *
     * @return the economy ban string
     */
    public String getEconomyBanString() {
        return EconomyBanString;
    }
}
