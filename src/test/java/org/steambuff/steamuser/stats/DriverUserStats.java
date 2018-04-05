package org.steambuff.steamuser.stats;

import org.junit.Assert;
import org.steambuff.ResourceHelper;
import org.steambuff.SteamApiTest;
import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.method.SteamId;
import org.steambuff.method.SteamIdInterface;

public class DriverUserStats implements DriverInterface {


    @Override
    public String getData(String url, Params params, String method) {

        if (!method.equals("GET")) {
            Assert.fail("Send not GET method: " + method);
        }else if (!url.equals("api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v0002/")){
            Assert.fail("Bad url... "+url);
        }else if (params.getParamByKey("key")==SteamApiTest.GOOD_KEY){
            return this.prepareGoodRequest(url,params);
        }else if (params.getParamByKey("key")==SteamApiTest.BAD_KEY){
            return this.prepareBadRequest(url,params);
        }else{
            Assert.fail("Key not present: "+params.getParamByKey("key"));
        }

        return "";
    }


    private String prepareGoodRequest(String url, Params params){
       long steamId = (long) params.getParamByKey("steamid");
       if (steamId==76561198802139714L){
           return ResourceHelper.getJSON("US_good_1");
       }else if (steamId==76561198802139716L){
           return ResourceHelper.getJSON("US_bad_1");
       }
        return url;
    }

    private String prepareBadRequest(String url, Params params){
        return url;
    }

    @Override
    public DriverInterface useHttps(boolean useHttps) {
        return null;
    }
}
