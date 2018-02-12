package org.steambuff.method.steamuser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.deserializer.PlayerSummariesDeserializer;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.AbstractSteamInterface;
import org.steambuff.method.steamuser.entity.request.RequestPlayerSummaries;

import java.util.ArrayList;
import java.util.List;

public class SteamUser extends AbstractSteamInterface implements SteamUserInterface {

    private final String PLAYER_SUMMARIES = "https://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/";

    public SteamUser(String key, DriverInterface driverInterface, Gson gson) {
        super(key, driverInterface,gson);
    }

    @Override
    public List<PlayerSummaries> getPlayerSummaries(Iterable<SteamId> listSteamId) {
        return null;
    }

    @Override
    public List<PlayerSummaries>  getPlayerSummaries(SteamId steamId) throws SteamApiException {
        try {
            return parse(sendGET(PLAYER_SUMMARIES, new RequestPlayerSummaries().add(steamId).getParams()),
                    new TypeToken<List<PlayerSummaries>>() {}.getType()
            );
        }catch (JsonSyntaxException exception){
            throw new SteamApiException(exception.getMessage());
        }
    }
}
