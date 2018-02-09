package method;

import driver.DriverInterface;

public class AbstractSteamInterface implements SteamApiInterface {

    private String key;

    private DriverInterface driverInterface;

    private ReturnFormat returnFormat;

    AbstractSteamInterface(String key, DriverInterface driverInterface){
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
}
