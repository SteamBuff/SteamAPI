package org.steambuff.method.util;

import org.steambuff.method.SteamId;

import java.net.URL;

/**
 * Additional functional for work with steam.
 */
public interface SteamAdditionalUtility {

    /**
     * Get steamId by steam profile steam.
     *
     * @param url URL for profile steam
     * @return SteamId steam id by page
     */
    SteamId getSteamIdByPage(URL url);

    /**
     * Get steamId by login
     *
     * @param login https://steamcommunity.com/id/bigtows - BigTows is login
     * @return SteamId steam id by login
     */
    SteamId getSteamIdByLogin(String login);
}
