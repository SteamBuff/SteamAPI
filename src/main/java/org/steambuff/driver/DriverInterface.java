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
     */
    String getData(String url, Params params, String method) throws SteamApiException;

    DriverInterface useHttps(boolean useHttps);
}
