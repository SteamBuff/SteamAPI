package org.steambuff.method.util;

import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.RequestParams;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;
import org.steambuff.method.util.exception.SteamAdditionalUtilityException;
import org.steambuff.method.util.exception.SteamAdditionalUtilityIllegalArgumentException;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The type Steam additional utility.
 */
public class SteamAdditionalUtilityImpl implements SteamAdditionalUtility {

    /**
     * Instance of driver
     */
    private final DriverInterface driver;

    /**
     * Host steam community
     */
    private final static String HOST_STEAM_COMMUNITY = "steamcommunity.com";

    /**
     * Path for steam community
     */
    private final static String PATH_TO_ID_PROFILE = "/id/";

    /**
     * Instantiates a new Steam additional utility.
     *
     * @param driverInterface the driver interface
     */
    public SteamAdditionalUtilityImpl(DriverInterface driverInterface) {
        this.driver = driverInterface;
    }

    @Override
    public SteamId getSteamIdByPage(URL url) throws SteamAdditionalUtilityIllegalArgumentException, SteamAdditionalUtilityException {
        String content = this.getContentPage(url);
        return getSteamId(content);
    }

    /**
     * Get content by Steam community
     *
     * @param url URL for steam community
     * @return Content page
     * @throws SteamAdditionalUtilityIllegalArgumentException on invalid host
     * @throws SteamAdditionalUtilityException                on error load page
     */
    private String getContentPage(URL url) throws SteamAdditionalUtilityIllegalArgumentException, SteamAdditionalUtilityException {
        if (!url.getHost().equalsIgnoreCase(HOST_STEAM_COMMUNITY)) {
            throw new SteamAdditionalUtilityIllegalArgumentException("URL host should be the same: " + HOST_STEAM_COMMUNITY);
        }
        try {
            return driver.getData(url.getHost() + url.getPath(), new RequestParams(), "GET");
        } catch (SteamApiException e) {
            throw new SteamAdditionalUtilityException("Error load page from: " + url.toString());
        }
    }

    /**
     * Get SteamId64 string by content
     *
     * @param content content page
     * @return SteamId64 string
     */
    private String getSteamId64ByContent(String content) throws SteamAdditionalUtilityIllegalArgumentException, SteamAdditionalUtilityException {
        String[] data = content.split("\"steamid\":\"");
        if (data.length != 2) {
            throw new SteamAdditionalUtilityException("Can't find on this page steamId");
        }
        String[] steamId = data[1].split("\"");
        if (steamId.length == 0 || steamId[0].length() != 17) {
            throw new SteamAdditionalUtilityException("Can't find on this page steamId");
        }
        return steamId[0];
    }


    @Override
    public SteamId getSteamIdByLogin(String login) {
        String content = this.getContentPage(this.getUrlForSteamCommunityByLogin(login));
        return this.getSteamId(content);
    }


    /**
     * Get URL for steam community profile by login
     *
     * @param login login
     * @return URL for steam community profile
     * @throws SteamAdditionalUtilityIllegalArgumentException on invalid login
     */
    private URL getUrlForSteamCommunityByLogin(String login) throws SteamAdditionalUtilityIllegalArgumentException {
        try {
            return new URL("https://" + HOST_STEAM_COMMUNITY + PATH_TO_ID_PROFILE + login);
        } catch (MalformedURLException e) {
            throw new SteamAdditionalUtilityIllegalArgumentException("Invalid login: " + login);
        }
    }


    /**
     * Get SteamId by content
     *
     * @param content content
     * @return SteamId
     */
    private SteamId getSteamId(String content) {
        String steamIdString = this.getSteamId64ByContent(content);
        try {
            return new SteamId(steamIdString);
        } catch (Exception e) {
            throw new SteamAdditionalUtilityException("Invalid steamId64: " + steamIdString);
        }
    }
}
