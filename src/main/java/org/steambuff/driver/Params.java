package org.steambuff.driver;

import java.util.function.Consumer;

/**
 * The interface Params.
 */
public interface Params {

    /**
     * Added params
     *
     * @param key   Unique key params
     * @param value value of key
     * @return self params
     */
    Params addParams(String key, Object value);

    /**
     * Gets param by key.
     *
     * @param key the key
     * @return the param by key
     */
    Object getParamByKey(String key);

    /**
     * For each.
     *
     * @param action the action
     */
    void forEach(Consumer<? super KeyValue> action);
}
