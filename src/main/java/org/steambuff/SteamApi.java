package org.steambuff;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.SteamDriver;
import org.steambuff.method.SteamUser;
import org.steambuff.method.playerservice.PlayerService;
import org.steambuff.method.playerservice.PlayerServiceInterface;
import org.steambuff.method.playerservice.deserializer.OwnedGamesDeserializer;
import org.steambuff.method.playerservice.entity.OwnedGames;
import org.steambuff.method.steamuser.SteamUserInterface;
import org.steambuff.method.steamuser.deserializer.*;
import org.steambuff.method.steamuser.entity.*;
import org.steambuff.method.util.SteamAdditionalUtility;
import org.steambuff.method.util.SteamAdditionalUtilityImpl;

import java.util.List;

/**
 * The type Steam api.
 */
public final class SteamApi {

    /**
     * Key for access to steamAPI
     */
    private String key;

    /**
     * Driver for connection to Steam
     *
     * @see DriverInterface
     */
    private DriverInterface driver;

    /**
     * PlayerServiceInterface steam.
     */
    private PlayerServiceInterface serviceInterface;

    /**
     * SteamUserInterface steam.
     */
    private SteamUserInterface steamUserInterface;

    /**
     * Steam Additional Utility
     */
    private SteamAdditionalUtility steamAdditionalUtility;

    /**
     * Component for parse JSON.
     */
    private Gson gson;

    /**
     * Get Instance with Custom Driver
     *
     * @param key    Key for access to steamAPI
     * @param driver Driver for connection to Steam
     */
    public SteamApi(String key, DriverInterface driver) {
        this.key = key;
        this.driver = driver;
        this.initGson();
        this.initInterfaces();
    }

    /**
     * Get Instance with default driver
     *
     * @param key Key for access to steamAPI
     * @return SteamAPI Instance
     */
    public static SteamApi getInstance(String key) {
        return new SteamApi(key, new SteamDriver());
    }


    /**
     * Initialize GSON component
     */
    private void initGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        this.registerTypeAdapter(gsonBuilder);
        this.gson = gsonBuilder.create();
    }

    /**
     * Register for GSON Builder type adapter
     *
     * @param gsonBuilder GSON builder
     */
    private void registerTypeAdapter(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(new TypeToken<List<PlayerSummaries>>() {
        }.getType(), new PlayerSummariesDeserializer());
        gsonBuilder.registerTypeAdapter(UserStats.class, new UserStatsDeserializer());
        gsonBuilder.registerTypeAdapter(OwnedGames.class, new OwnedGamesDeserializer());
        gsonBuilder.registerTypeAdapter(ProgressGame.class, new ProgressGameDeserializer());
        gsonBuilder.registerTypeAdapter(SchemaForGame.class, new SchemaForGameDeserializer());
        gsonBuilder.registerTypeAdapter(new TypeToken<List<PlayerBans>>() {
        }.getType(), new PlayerBansDeserializer());
    }

    private void initInterfaces() {
        serviceInterface = new PlayerService(this.key, this.driver, this.gson);
        steamUserInterface = new SteamUser(this.key, this.driver, this.gson);
        steamAdditionalUtility = new SteamAdditionalUtilityImpl(this.driver);
    }


    /**
     * Get PlayerService Interface
     *
     * @return PlayerService Interface
     */
    public PlayerServiceInterface getPlayerServiceInterface() {
        return serviceInterface;
    }

    /**
     * Get SteamUser Interface
     *
     * @return SteamUser Interface
     */
    public SteamUserInterface getSteamUserInterface() {
        return steamUserInterface;
    }

    /**
     * Get SteamAdditionalUtility
     *
     * @return SteamAdditionalUtility
     */
    public SteamAdditionalUtility getSteamAdditionalUtility() {
        return steamAdditionalUtility;
    }
}
