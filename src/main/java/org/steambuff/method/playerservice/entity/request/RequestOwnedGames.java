package org.steambuff.method.playerservice.entity.request;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.RequestEntity;
import org.steambuff.method.SteamId;

/**
 * The type Request owned games.
 */
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
                addParams("include_appinfo", this.includeAppInfo ? 1 : 0).
                addParams("include_played_free_games", this.includePlayedFreeGames ? 1 : 0);
    }

    @Override
    public String getURL() {
        return url;
    }

    /**
     * Include app info request owned games.
     *
     * @param include the include
     * @return the request owned games
     */
    public RequestOwnedGames includeAppInfo(boolean include) {
        this.includeAppInfo = include;
        return this;
    }

    /**
     * Include played free games request owned games.
     *
     * @param include the include
     * @return the request owned games
     */
    public RequestOwnedGames includePlayedFreeGames(boolean include) {
        this.includePlayedFreeGames = include;
        return this;
    }
}
