package org.steambuff.method.playerservice;

import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.playerservice.entity.OwnedGames;

import java.util.List;

/**
 * The interface Player service interface.
 */
public interface PlayerServiceInterface {

    /**
     * Gets owned games.
     *
     * @param steamId                the steam id
     * @param includeAppInfo         the include app info
     * @param includePlayedFreeGames the include played free games
     * @param filterAppId            the filter app id
     * @return the owned games
     * @throws SteamApiException the steam api exception
     */
    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId) throws SteamApiException;

    /**
     * Gets owned games.
     *
     * @param steamId                the steam id
     * @param includeAppInfo         the include app info
     * @param includePlayedFreeGames the include played free games
     * @return the owned games
     * @throws SteamApiException the steam api exception
     */
    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames) throws SteamApiException;

    /**
     * Gets owned games.
     *
     * @param steamId        the steam id
     * @param includeAppInfo the include app info
     * @return the owned games
     * @throws SteamApiException the steam api exception
     */
    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo) throws SteamApiException;

    /**
     * Gets owned games.
     *
     * @param steamId the steam id
     * @return the owned games
     * @throws SteamApiException the steam api exception
     */
    OwnedGames getOwnedGames(SteamId steamId) throws SteamApiException;


}
