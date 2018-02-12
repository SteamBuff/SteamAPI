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

    public void forEach(Consumer<? super KeyValue> action) {
        params.forEach((key,value)-> action.accept(new KeyValue(key,value)));
    }
}
class KeyValue{
    private String key;
    private Object value;


    KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}