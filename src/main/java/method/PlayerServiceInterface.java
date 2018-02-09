package method;

import entity.SteamId;

public interface PlayerServiceInterface {

    public void getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames);

    public void getOwnedGames(SteamId steamId, boolean includeAppInfo);

    public void getOwnedGames(SteamId steamId);
}
