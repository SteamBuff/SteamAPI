package org.steambuff.method.playerservice;

import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.playerservice.entity.OwnedGames;

import java.util.List;

public interface PlayerServiceInterface {

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId) throws SteamApiException;

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames) throws SteamApiException;

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo) throws SteamApiException;

    OwnedGames getOwnedGames(SteamId steamId) throws SteamApiException;


}
