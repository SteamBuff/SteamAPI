package org.steambuff.method.steamuser;

import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerBans;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.SchemaForGame;
import org.steambuff.method.steamuser.entity.UserStats;

import java.util.List;
import java.util.Optional;

/**
 * The interface Steam user interface.
 */
public interface SteamUserInterface {

    /**
     * Gets player summaries.
     *
     * @param listSteamId the list steam id
     * @return the player summaries
     * @throws SteamApiException the steam api exception
     */
    List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) throws SteamApiException;

    /**
     * Gets player summaries.
     *
     * @param steamId the steam id
     * @return the player summaries
     * @throws SteamApiException the steam api exception
     */
    Optional<PlayerSummaries> getPlayerSummaries(SteamId steamId) throws SteamApiException;

    /**
     * Gets user stats for game.
     *
     * @param steamId the steam id
     * @param appId   the app id
     * @return the user stats for game
     * @throws SteamApiException the steam api exception
     */
    UserStats getUserStatsForGame(SteamId steamId, int appId) throws SteamApiException;

    /**
     * Gets player bans.
     *
     * @param listSteamId the list steam id
     * @return the player bans
     * @throws SteamApiException the steam api exception
     */
    List<PlayerBans> getPlayerBans(ListSteamId listSteamId) throws SteamApiException;

    /**
     * Gets player bans.
     *
     * @param steamId the steam id
     * @return the player bans
     * @throws SteamApiException the steam api exception
     */
    Optional<PlayerBans> getPlayerBans(SteamId steamId) throws SteamApiException;


    /**
     * Gets schema for game.
     *
     * @param appId the app id
     * @return the schema for game
     * @throws SteamApiException the steam api exception
     */
    SchemaForGame getSchemaForGame(int appId) throws SteamApiException;

}
