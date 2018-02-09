package method;

import driver.DriverInterface;
import entity.SteamId;

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
