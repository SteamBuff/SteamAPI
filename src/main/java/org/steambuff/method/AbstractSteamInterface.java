package org.steambuff.method;


import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;

public class AbstractSteamInterface implements SteamApiInterface {

    private String key;

    private DriverInterface driverInterface;

    private ReturnFormat returnFormat;

    public AbstractSteamInterface(String key, DriverInterface driverInterface){
        this.key = key;
        this.driverInterface = driverInterface;
        this.returnFormat = ReturnFormat.JSON;
    }

    @Override
    public void setFormat(ReturnFormat returnFormat) {
        this.returnFormat = returnFormat;
    }

    @Override
    public ReturnFormat getFormat() {
        return this.returnFormat;
    }

    public DriverInterface getDriver() {
        return driverInterface;
    }

    public String getKey() {
        return key;
    }

    public Params getDefaultParams(){
        return new RequestParams().addParams("key",getKey());
    }
}
