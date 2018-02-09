package org.steambuff;

import org.steambuff.driver.DriverInterface;
import org.steambuff.method.PlayerService;
import org.steambuff.method.PlayerServiceInterface;

public class SteamApi {


    private String key;

    private DriverInterface driver;
    private PlayerServiceInterface serviceInterface;
    public SteamApi(String key, DriverInterface driver){
        this.key = key;
        this.driver = driver;
        this.initInterfaces();
    }
    private void initInterfaces() {
        serviceInterface = new PlayerService(this.key,this.driver);
    }


    public PlayerServiceInterface getPlayerServiceInterface() {
        return serviceInterface;
    }
}
