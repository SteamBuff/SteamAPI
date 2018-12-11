package org.steambuff;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;


/**
 * The type Reaction driver.
 */
public class ReactionDriver {
    private String method;
    private String jsonResource;
    private Params params;


    /**
     * Instantiates a new Reaction driver.
     *
     * @param method       the method
     * @param jsonResource the json resource
     */
    public ReactionDriver(String method, String jsonResource) {
        this.method = method;
        this.jsonResource = jsonResource;
        params = new RequestParams();
    }

    /**
     * Add steam ids reaction driver.
     *
     * @param value the value
     * @return the reaction driver
     */
    public ReactionDriver addSteamIds(SteamId value) {
        this.params.addParams("steamids", value.toId64());
        return this;
    }

    /**
     * Add steam ids reaction driver.
     *
     * @param value the value
     * @return the reaction driver
     */
    public ReactionDriver addSteamIds(ListSteamId value) {
        this.params.addParams("steamids", value.toString());
        return this;
    }

    /**
     * Add key reaction driver.
     *
     * @param key the key
     * @return the reaction driver
     */
    public ReactionDriver addKey(String key) {
        this.params.addParams("key", key);
        return this;
    }

    /**
     * Gets method.
     *
     * @return the method
     */
    String getMethod() {
        return method;
    }

    /**
     * Gets params.
     *
     * @return the params
     */
    Params getParams() {
        return params;
    }

    /**
     * Gets json.
     *
     * @return the json
     */
    String getJSON() {
        return jsonResource;
    }

    /**
     * Add steam id reaction driver.
     *
     * @param steamId the steam id
     * @return the reaction driver
     */
    public ReactionDriver addSteamId(SteamId steamId) {
        this.params.addParams("steamid", steamId.toId64());
        return this;
    }

    /**
     * Add app id reaction driver.
     *
     * @param id the id
     * @return the reaction driver
     */
    public ReactionDriver addAppId(int id) {
        this.params.addParams("appid", id);
        return this;
    }
}
