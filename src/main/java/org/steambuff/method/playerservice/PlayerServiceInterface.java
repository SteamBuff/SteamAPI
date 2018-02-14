package org.steambuff.method.playerservice;

import org.steambuff.method.SteamId;
import org.steambuff.method.playerservice.entity.OwnedGames;

import java.util.List;

public interface PlayerServiceInterface {

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId);

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo);

    OwnedGames getOwnedGames(SteamId steamId);


}
