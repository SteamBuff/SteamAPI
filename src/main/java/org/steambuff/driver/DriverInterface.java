package org.steambuff.driver;

import java.util.Map;

public interface DriverInterface {

    /**
     * Get data from Resource
     * @param url URL
     * @param params Params for Request
     * @param method Type request
     * @return Data form resource
     */
    String getData(String url, Params params, String method);

}
