package org.steambuff.method.steamuser.entity.request;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.RequestEntity;
import org.steambuff.method.SteamIdInterface;

/**
 * The type Request stats game.
 */
public class RequestStatsGame implements RequestEntity {


    private SteamIdInterface steamId;
    private int appId;

    @Override
    public RequestEntity add(Object object) {
        if (object instanceof SteamIdInterface) {
            this.steamId = (SteamIdInterface) object;
        } else if (object instanceof Integer) {
            this.appId = (int) object;
        }
        return this;
    }

    @Override
    public Params getParams() {
        return new RequestParams().addParams("steamid", steamId.toId64()).addParams("appid", this.appId);
    }

    @Override
    public String getURL() {
        return "api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v0002/";
    }
}
