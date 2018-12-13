package org.steambuff.driver;

/**
 * The type Key value.
 */
public class KeyValue {
    private String key;
    private Object value;


    /**
     * Instantiates a new Key value.
     *
     * @param key   the key
     * @param value the value
     */
    KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    String getKey() {
        return key;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    Object getValue() {
        return value;
    }
}
