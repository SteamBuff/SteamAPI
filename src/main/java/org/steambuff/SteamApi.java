package org.steambuff;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.steambuff.driver.DriverInterface;
import org.steambuff.method.playerservice.PlayerService;
import org.steambuff.method.playerservice.PlayerServiceInterface;
import org.steambuff.method.steamuser.SteamUser;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.deserializer.PlayerSummariesDeserializer;
import org.steambuff.method.steamuser.entity.PlayerSummaries;

import java.util.List;

public class SteamApi {


    /**
     * Key for access to steamAPI
     */
    private String key;

    private DriverInterface driver;
    private PlayerServiceInterface serviceInterface;
    private SteamUserInterface steamUserInterface;



    private Gson gson;
    public SteamApi(String key, DriverInterface driver) {
        this.key = key;
        this.driver = driver;
        this.initGson();
        this.initInterfaces();
    }

    private void initGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(new TypeToken<List<PlayerSummaries>>(){}.getType(),new PlayerSummariesDeserializer());
        this.gson = gsonBuilder.create();
    }

    private void initInterfaces() {
        serviceInterface = new PlayerService(this.key, this.driver,this.gson);
        steamUserInterface = new SteamUser(this.key, this.driver,this.gson);
    }


    public PlayerServiceInterface getPlayerServiceInterface() {
        return serviceInterface;
    }

    public SteamUserInterface getSteamUserInterface() {
        return steamUserInterface;
    }

}
