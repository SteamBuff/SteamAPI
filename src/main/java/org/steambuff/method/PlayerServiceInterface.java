package org.steambuff.method;

import org.steambuff.entity.SteamId;

public interface PlayerServiceInterface {

    void getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames);

    void getOwnedGames(SteamId steamId, boolean includeAppInfo);

    void getOwnedGames(SteamId steamId);
}
