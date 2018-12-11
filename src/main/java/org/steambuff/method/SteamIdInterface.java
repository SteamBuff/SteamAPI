package org.steambuff.method;

/**
 * The interface Steam id interface.
 */
public interface SteamIdInterface {

    /**
     * Возвращает steam ID в 64 формате
     *
     * @return steamId long
     */
    long toId64();


    /**
     * Gets last bit.
     *
     * @return the last bit
     */
    int getLastBit();


    /**
     * Gets id.
     *
     * @return the id
     */
    long getId();
}
