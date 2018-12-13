package org.steambuff.method;


import org.steambuff.driver.Params;

/**
 * The interface Request entity.
 *
 * @param <T> the type parameter
 */
public interface RequestEntity<T extends RequestEntity<T>> {

    /**
     * Added object to Request
     *
     * @param object Object
     * @return {@code this}
     */
    T add(Object object);

    /**
     * Gets params.
     *
     * @return the params
     */
    Params getParams();


    /**
     * Get the URL for sending the request
     *
     * @return URL url
     */
    String getURL();
}
