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

    private DriverInterface getDriver() {
        return driverInterface;
    }

    protected String getKey() {
        return key;
    }


    protected String sendGET(String url,Params params){
        return getDriver().getData(url, params.addParams("key",getKey()), "GET");
    }

}
