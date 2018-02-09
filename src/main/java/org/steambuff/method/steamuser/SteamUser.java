package org.steambuff.method.steamuser;

import org.steambuff.driver.DriverInterface;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.AbstractSteamInterface;

import java.util.List;

public class SteamUser extends AbstractSteamInterface implements SteamUserInterface {

    public SteamUser(String key, DriverInterface driverInterface) {
        super(key, driverInterface);
    }

    @Override
    public List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) {
        return null;
    }

    @Override
    public PlayerSummaries getPlayerSummaries(SteamId steamId) {
        return null;
    }
}
