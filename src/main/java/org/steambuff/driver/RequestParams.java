package org.steambuff.driver;

import java.util.HashMap;

public class RequestParams implements Params {

    private HashMap<String, Object> params = new HashMap<>();

    @Override
    public Params addParams(String key, Object value) {
        params.put(key, value);
        return this;
    }
}
