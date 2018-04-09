package org.steambuff.method;


import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;

import java.lang.reflect.Type;

public abstract class AbstractSteamInterface implements SteamApiInterface {

    private String key;

    private DriverInterface driverInterface;

    private Gson gson;

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

    protected <T> T parse(String data, Type type) throws JsonSyntaxException {
        T entity = gson.fromJson(data, type);
        if (entity==null){
            throw new JsonSyntaxException("Response entity is null");
        }
        return entity;
    }

    protected String sendGET(RequestEntity requestEntity) throws SteamApiException {
        return getDriver().getData(requestEntity.getURL(), requestEntity.getParams().addParams("key", getKey()), "GET");
    }

}
