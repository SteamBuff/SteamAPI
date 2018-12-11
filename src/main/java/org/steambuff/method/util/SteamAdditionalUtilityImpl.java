package org.steambuff.method.util;

import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.RequestParams;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.util.exception.SteamAdditionalUtilityException;
import org.steambuff.method.util.exception.SteamAdditionalUtilityIllegalArgumentException;

import java.net.URL;

public class SteamAdditionalUtilityImpl implements SteamAdditionalUtility {

    private final DriverInterface driver;

    private final static String HOST_STEAM_COMMUNITY = "steamcommunity.com";

    public SteamAdditionalUtilityImpl(DriverInterface driverInterface) {
        this.driver = driverInterface;
    }

    @Override
    public SteamId getSteamIdByPage(URL url) throws SteamAdditionalUtilityIllegalArgumentException, SteamAdditionalUtilityException {
        String content = this.getContentPage(url);
        String[] data = content.split("\"steamid\":\"");
        if (data.length != 2) {
            throw new SteamAdditionalUtilityException("Content error");
        }
        String[] steamId = data[1].split("\"");
        if (steamId.length == 0) {
            throw new SteamAdditionalUtilityException("Content error");
        }
        try {
            return new SteamId(steamId[0]);
        }catch (Exception e){
            throw new SteamAdditionalUtilityException("Parse error");
        }
    }

    private String getContentPage(URL url) throws SteamAdditionalUtilityIllegalArgumentException, SteamAdditionalUtilityException {
        if (!url.getHost().equalsIgnoreCase(HOST_STEAM_COMMUNITY)) {
            throw new SteamAdditionalUtilityIllegalArgumentException("URL host should be the same: " + HOST_STEAM_COMMUNITY);
        }
        try {
            return driver.getData(url.getHost() + url.getPath(), new RequestParams(), "GET");
        } catch (SteamApiException e) {
            throw new SteamAdditionalUtilityException("Error load");
        }
    }
}
