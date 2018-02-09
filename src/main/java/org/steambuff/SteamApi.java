package org.steambuff;

import org.steambuff.driver.DriverInterface;
import org.steambuff.method.playerservice.PlayerService;
import org.steambuff.method.playerservice.PlayerServiceInterface;
import org.steambuff.method.steamuser.SteamUser;
import org.steambuff.method.steamuser.SteamUserInterface;

public class SteamApi {


    private String key;

    private DriverInterface driver;
    private PlayerServiceInterface serviceInterface;


    private SteamUserInterface steamUserInterface;

    public SteamApi(String key, DriverInterface driver) {
        this.key = key;
        this.driver = driver;
        this.initInterfaces();
    }

    private void initInterfaces() {
        serviceInterface = new PlayerService(this.key, this.driver);
        steamUserInterface = new SteamUser(this.key, this.driver);
    }


    public PlayerServiceInterface getPlayerServiceInterface() {
        return serviceInterface;
    }

    public SteamUserInterface getSteamUserInterface() {
        return steamUserInterface;
    }

}
