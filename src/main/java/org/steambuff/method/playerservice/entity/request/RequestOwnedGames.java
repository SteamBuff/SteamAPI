package org.steambuff.method.playerservice.entity.request;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.RequestEntity;
import org.steambuff.method.SteamId;

public class RequestOwnedGames implements RequestEntity<RequestOwnedGames> {


    private String url = "api.steampowered.com/IPlayerService/GetOwnedGames/v0001/";
    private SteamId steamId;
    private boolean includeAppInfo;
    private boolean includePlayedFreeGames;

    @Override
    public RequestOwnedGames add(Object object) {
        if (object instanceof SteamId) {
            steamId = (SteamId) object;
        }
        return this;
    }

    @Override
    public Params getParams() {
        return new RequestParams().
                addParams("steamid", this.steamId.toId64()).
                addParams("include_appinfo", this.includeAppInfo?1:0).
                addParams("include_played_free_games", this.includePlayedFreeGames?1:0);
    }

    @Override
    public String getURL() {
        return url;
    }

    public RequestOwnedGames includeAppInfo(boolean include) {
        this.includeAppInfo = include;
        return this;
    }

    public RequestOwnedGames includePlayedFreeGames(boolean include) {
        this.includePlayedFreeGames = include;
        return this;
    }
}
