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
     * @return SteamId
     */
    SteamId getSteamIdByPage(URL url);
}
