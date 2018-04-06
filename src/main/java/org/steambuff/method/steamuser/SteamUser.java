package org.steambuff.method;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.UserStats;
import org.steambuff.method.steamuser.entity.request.RequestPlayerSummaries;
import org.steambuff.method.steamuser.entity.request.RequestStatsGame;

import java.util.List;

public class SteamUser extends AbstractSteamInterface implements SteamUserInterface {

    public SteamUser(String key, DriverInterface driverInterface, Gson gson) {
        super(key, driverInterface, gson);
    }

    @Override
    public List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) throws SteamApiException {
        try {
            return parse(sendGET(new RequestPlayerSummaries().add(listSteamId)),
                    new TypeToken<List<PlayerSummaries>>() {
                    }.getType()
            );
        } catch (JsonSyntaxException exception) {
            throw new SteamApiException(exception.getMessage());
        }
    }

    @Override
    public List<PlayerSummaries> getPlayerSummaries(SteamId steamId) throws SteamApiException {
        try {
            return parse(sendGET(new RequestPlayerSummaries().add(steamId)),
                    new TypeToken<List<PlayerSummaries>>() {
                    }.getType()
            );
        } catch (JsonSyntaxException exception) {
            throw new SteamApiException(exception.getMessage());
        }
    }

    @Override
    public UserStats getUserStatsForGame(SteamId steamId, int appId) throws SteamApiException {
        try {
            return parse(sendGET(new RequestStatsGame().add(steamId).add(appId)), UserStats.class);
        } catch (JsonSyntaxException exception) {
            throw new SteamApiException(exception.getMessage());
        }
    }
}
