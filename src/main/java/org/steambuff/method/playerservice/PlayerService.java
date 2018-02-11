package org.steambuff.method.playerservice;


import org.steambuff.driver.DriverInterface;
import org.steambuff.method.SteamId;
import org.steambuff.method.playerservice.entity.OwnedGames;
import org.steambuff.method.AbstractSteamInterface;

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