package org.steambuff.driver;


import java.util.HashMap;
import java.util.function.Consumer;

/**
 * The type Request params.
 */
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
        params.forEach((key, value) -> action.accept(new KeyValue(key, value)));
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        this.forEach(data -> buffer.append(data.getKey()).append("=").append(data.getValue()).append("&"));

        return buffer.length() > 0 ? buffer.deleteCharAt(buffer.length() - 1).toString() : buffer.toString();
    }
}

