package org.steambuff.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The type List steam id.
 */
public class ListSteamId {
    private List<SteamId> steamIdList = new ArrayList<>();


    /**
     * Instantiates a new List steam id.
     *
     * @param steamIdList the steam id list
     */
    public ListSteamId(Collection<SteamId> steamIdList) {
        this.steamIdList.addAll(steamIdList);
    }

    /**
     * Instantiates a new List steam id.
     *
     * @param steamId the steam id
     */
    public ListSteamId(SteamId steamId) {
        steamIdList.add(steamId);
    }

    /**
     * Instantiates a new List steam id.
     */
    public ListSteamId() {

    }

    /**
     * Add list steam id.
     *
     * @param steamId the steam id
     * @return the list steam id
     */
    public ListSteamId add(SteamId steamId) {
        steamIdList.add(steamId);
        return this;
    }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size() {
        return steamIdList.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        steamIdList.forEach(steamId -> stringBuilder.append(steamId.toId64()).append(","));
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
