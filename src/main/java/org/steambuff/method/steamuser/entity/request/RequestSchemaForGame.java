package org.steambuff.method.steamuser.entity.request;

import org.steambuff.driver.Params;
import org.steambuff.driver.RequestParams;
import org.steambuff.method.RequestEntity;

public class RequestSchemaForGame implements RequestEntity {

    private int appId;

    @Override
    public RequestEntity add(Object object) {
        if (object instanceof Integer) {
            this.appId = (int) object;
        }
        return this;
    }

    @Override
    public Params getParams() {
        return new RequestParams().addParams("appid", appId);
    }

    @Override
    public String getURL() {
        return "api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/";
    }
}
