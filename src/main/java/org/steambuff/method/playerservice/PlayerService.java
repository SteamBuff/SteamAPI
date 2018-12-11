package org.steambuff.method.playerservice;


import com.google.gson.Gson;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.AbstractSteamInterface;
import org.steambuff.method.SteamId;
import org.steambuff.method.playerservice.entity.OwnedGames;
import org.steambuff.method.playerservice.entity.request.RequestOwnedGames;

import java.util.List;

/**
 * The type Player service.
 */
public class PlayerService extends AbstractSteamInterface implements PlayerServiceInterface {


    /**
     * Instantiates a new Player service.
     *
     * @param key             the key
     * @param driverInterface the driver interface
     * @param gson            the gson
     */
    public PlayerService(String key, DriverInterface driverInterface, Gson gson) {
        super(key, driverInterface, gson);
    }


    //TODO Edit SteamID to Interface SteamID
    @Override
    public OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames, List<Long> filterAppId) throws SteamApiException {
        return parse(sendGET(new RequestOwnedGames().add(steamId).
                        includeAppInfo(includeAppInfo).
                        includePlayedFreeGames(includePlayedFreeGames)),
                OwnedGames.class);
    }

    @Override
    public OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo, boolean includePlayedFreeGames) throws SteamApiException {
        return getOwnedGames(steamId, includeAppInfo, includePlayedFreeGames, null);
    }

    @Override
    public OwnedGames getOwnedGames(SteamId steamId, boolean includeAppInfo) throws SteamApiException {
        return getOwnedGames(steamId, includeAppInfo, false, null);
    }

    @Override
    public OwnedGames getOwnedGames(SteamId steamId) throws SteamApiException {
        return getOwnedGames(steamId, false, false, null);
    }

}
