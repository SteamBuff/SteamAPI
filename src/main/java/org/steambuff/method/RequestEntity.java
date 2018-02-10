package org.steambuff.method;

import org.steambuff.driver.Params;

/**
 * The interface Request entity.
 */
public interface RequestEntity <T extends RequestEntity<T>> {


    public T add(Object object);

    /**
     * Gets params.
     *
     * @return the params
     */
    public Params getParams();
}
