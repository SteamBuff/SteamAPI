package org.steambuff.method.steamuser.entity.request;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.RequestEntity;
import org.steambuff.method.SteamId;


public class RequestPlayerSummaries implements RequestEntity<RequestPlayerSummaries> {


    private ListSteamId listSteamId = new ListSteamId();
    private String url = "api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/";


    public RequestPlayerSummaries (){
    }

    @Override
    public RequestPlayerSummaries add(Object object) {
        if (object instanceof ListSteamId) {
            this.listSteamId = (ListSteamId) object;
        } else if (object instanceof SteamId) {
            this.listSteamId.add((SteamId) object);
        }
        return this;
    }

    @Override
    public Params getParams() {
        return new RequestParams().addParams("steamids", listSteamId.toString());
    }

    @Override
    public String getURL() {
        return url;
    }


}
