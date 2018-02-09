package org.steambuff.method;


import org.steambuff.driver.DriverInterface;
import org.steambuff.entity.SteamId;

public class PlayerService extends AbstractSteamInterface implements PlayerServiceInterface {



    public PlayerService(String key, DriverInterface driverInterface) {
        super(key,driverInterface);
    }

    @Override
    public void getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames) {

    }

    @Override
    public void getOwnedGames(SteamId steamId,boolean includeAppInfo){
        getOwnedGames(steamId,includeAppInfo,false);
    }

    @Override
    public void getOwnedGames(SteamId steamId) {
        getOwnedGames(steamId,false,false);
    }
}
