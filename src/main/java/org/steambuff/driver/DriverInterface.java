package org.steambuff.driver;

import org.steambuff.exception.SteamApiException;

public interface DriverInterface {

    /**
     * Get data from Resource
     *
     * @param url    URL
     * @param params Params for Request
     * @param method Type request
     * @return Data form resource
     * @throws SteamApiException On error Steam service or Driver
     */
    String getData(String url, Params params, String method) throws SteamApiException;

    /**
     * Use https protocol
     *
     * @param useHttps Use https
     * @return {@code this}
     */
    DriverInterface useHttps(boolean useHttps);
}
