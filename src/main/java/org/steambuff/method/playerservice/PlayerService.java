package org.steambuff.method;


import org.steambuff.driver.DriverInterface;
import org.steambuff.entity.SteamId;
import org.steambuff.entity.playerservice.OwnedGames;

import java.util.List;

public class PlayerService extends AbstractSteamInterface implements PlayerServiceInterface {


    public PlayerService(String key, DriverInterface driverInterface) {
        super(key, driverInterface);
    }


    //TODO Edit SteamID to Interface SteamID
    @Override
    public OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId) {
            return new OwnedGames();
    }

    @Override
    public OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo) {
        return getOwnedGames(steamId, includeAppInfo, false, null);
    }

    @Override
    public OwnedGames getOwnedGames(SteamId steamId) {
        return getOwnedGames(steamId, false, false, null);
    }
}
