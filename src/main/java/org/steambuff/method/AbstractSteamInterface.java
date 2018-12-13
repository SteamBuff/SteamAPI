package org.steambuff.method;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;

import java.lang.reflect.Type;

/**
 * The type Abstract steam interface.
 */
public abstract class AbstractSteamInterface implements SteamApiInterface {

    private String key;

    private DriverInterface driverInterface;

    private Gson gson;

    /**
     * Instantiates a new Abstract steam interface.
     *
     * @param key             the key
     * @param driverInterface the driver interface
     * @param gson            the gson
     */
    public AbstractSteamInterface(String key, DriverInterface driverInterface, Gson gson) {
        this.key = key;
        this.driverInterface = driverInterface;
        this.gson = gson;
    }

    private DriverInterface getDriver() {
        return driverInterface;
    }

    private String getKey() {
        return key;
    }

    /**
     * Parse t.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @param type the type
     * @return the t
     * @throws JsonSyntaxException the json syntax exception
     */
    protected <T> T parse(String data, Type type) throws JsonSyntaxException {
        T entity = gson.fromJson(data, type);
        if (entity == null) {
            throw new JsonSyntaxException("Response entity is null");
        }
        return entity;
    }

    /**
     * Send get string.
     *
     * @param requestEntity the request entity
     * @return the string
     * @throws SteamApiException the steam api exception
     */
    protected String sendGET(RequestEntity requestEntity) throws SteamApiException {
        return getDriver().getData(
                requestEntity.getURL(),
                requestEntity.getParams().addParams("key", getKey()), "GET");
    }

}
