package org.steambuff.method;


import org.steambuff.driver.Params;

/**
 * The interface Request entity.
 */
public interface RequestEntity<T extends RequestEntity<T>> {

    /**
     * Added object to Request
     *
     * @param object Object
     * @return {@code this}
     */
    public T add(Object object);

    /**
     * Gets params.
     *
     * @return the params
     */
    public Params getParams();


    /**
     * Get the URL for sending the request
     *
     * @return URL
     */
    String getURL();
}
