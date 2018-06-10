package org.steambuff.method;

public interface SteamIdInterface {

    /**
     * Возвращает steam ID в 64 формате
     *
     * @return steamId
     */
    public long toId64();


    public int getLastBit();


    public long getId();
}
