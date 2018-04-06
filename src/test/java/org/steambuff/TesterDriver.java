package org.steambuff;

import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.exception.SteamApiException;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesterDriver implements DriverInterface {

    private String url;

    private List<ReactionDriver> GETreaction = new ArrayList<>();
    private List<ReactionDriver> POSTreaction = new ArrayList<>();

    public TesterDriver(String url) {
        this.url = url;
    }


    public TesterDriver addRection(ReactionDriver reactionDriver) {


            GETreaction.add(reactionDriver);
            return this;
    }


    @Override
    public String getData(String url, Params params, String method) throws SteamApiException {
        if (!url.equals(this.url)) {
            throw new SteamApiException("Undefined URL");
        }
        if (method.equals("GET")) {
            return processGET(params);
        } else if (method.equals("POST")) {
            return processPOST(params);
        }
        throw new SteamApiException("Undefined method");
    }

    private String processPOST(Params params) {
        return null;
    }


    private String processGET(Params params) throws SteamApiException {
       for(ReactionDriver reactionDriver : GETreaction){
            if (params.toString().equals(reactionDriver.getParams().toString())){
                return ResourceHelper.getJSON(reactionDriver.getJSON());
            }
       }
       throw new SteamApiException("Undefined reaction for: "+params.toString());
    }

    @Override
    public DriverInterface useHttps(boolean useHttps) {
        return null;
    }
}
