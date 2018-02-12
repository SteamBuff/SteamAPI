package org.steambuff.driver;

import java.util.function.Consumer;

public interface Params {

    /**
     * Added params
     * @param key Unique key params
     * @param value value of key
     * @return self
     */
    public Params addParams(String key, Object value);

    public Object getParamByKey(String key);

    public void forEach(Consumer<? super KeyValue> action);
}
