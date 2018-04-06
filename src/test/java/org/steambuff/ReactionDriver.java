package org.steambuff;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.SteamId;


public class ReactionDriver {
    private String method;
    private String jsonResource;
    private Params params;


    public ReactionDriver(String method, String jsonResource) {
        this.method = method;
        this.jsonResource = jsonResource;
        params = new RequestParams();
    }

    public ReactionDriver addSteamIds(SteamId value) {
        this.params.addParams("steamids", value.toId64());
        return this;
    }


    public ReactionDriver addKey(String key) {
        this.params.addParams("key", key);
        return this;
    }

    public String getMethod() {
        return method;
    }

    public Params getParams() {
        return params;
    }

    public String getJSON() {
        return jsonResource;
    }

    public ReactionDriver addSteamId(SteamId steamId) {
        this.params.addParams("steamid",steamId.toId64());
        return this;
    }

    public ReactionDriver addAppId(int id) {
        this.params.addParams("appid",id);
        return this;
    }
}
