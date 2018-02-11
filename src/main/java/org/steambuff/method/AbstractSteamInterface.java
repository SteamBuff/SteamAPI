package org.steambuff.method;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;

import java.lang.reflect.Type;

public class AbstractSteamInterface implements SteamApiInterface {

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
        return gson.fromJson(data, type);
    }

    protected String sendGET(String url, Params params) {
        return getDriver().getData(url, params.addParams("key", getKey()), "GET");
    }

}
