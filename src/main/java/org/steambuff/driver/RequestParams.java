package org.steambuff.driver;

import java.util.HashMap;
import java.util.function.Consumer;

public class RequestParams implements Params {

    private HashMap<String, Object> params = new HashMap<>();

    @Override
    public Params addParams(String key, Object value) {
        params.put(key, value);
        return this;
    }

    @Override
    public Object getParamByKey(String key) {
        return params.get(key);
    }

    public void forEach(Consumer<? super Object> action) {
        for (int i = 0; i < params.size(); i++) {
            action.accept(params.keySet().toArray()[i]);
        }
    }
}
