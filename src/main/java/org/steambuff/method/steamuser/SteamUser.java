package org.steambuff.method.steamuser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.steambuff.driver.DriverInterface;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.deserializer.PlayerSummariesDeserializer;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.AbstractSteamInterface;
import org.steambuff.method.steamuser.entity.request.RequestPlayerSummaries;

import java.util.ArrayList;
import java.util.List;

public class SteamUser extends AbstractSteamInterface implements SteamUserInterface {

    private final String PLAYER_SUMMARIES = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/";

    public SteamUser(String key, DriverInterface driverInterface) {
        super(key, driverInterface);
    }

    @Override
    public List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) {

        return null;
    }

    @Override
    public List<PlayerSummaries>  getPlayerSummaries(SteamId steamId) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(new TypeToken<List<PlayerSummaries>>(){}.getType(),new PlayerSummariesDeserializer());
        Gson gson = gsonBuilder.create();
        return gson.fromJson(sendGET("",new RequestPlayerSummaries().add(steamId).getParams()),new TypeToken<List<PlayerSummaries>>(){}.getType());
    }
}
