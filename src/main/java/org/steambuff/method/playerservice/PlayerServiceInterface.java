package org.steambuff.method;

import org.steambuff.entity.SteamId;
import org.steambuff.entity.playerservice.OwnedGames;

import java.util.List;

public interface PlayerServiceInterface {

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId);

    OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo);

    OwnedGames getOwnedGames(SteamId steamId);


}
