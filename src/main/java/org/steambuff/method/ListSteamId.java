package org.steambuff.method;

import org.steambuff.method.exception.FullStorageListSteamIdException;
import org.steambuff.method.exception.ListSteamIdException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The type List steam id.
 */
public class ListSteamId {

    /**
     * This max count requested id's in method's steam.
     */
    private static final Integer MAX_COUNT_STEAM_ID = 100;

    /**
     * Storage of steam id.
     */
    private List<SteamId> steamIdList = new ArrayList<>();


    /**
     * Instantiates a new List steam id.
     *
     * @param steamIdList the steam id list
     * @throws ListSteamIdException when can't put item in storage
     */
    public ListSteamId(Collection<SteamId> steamIdList) throws ListSteamIdException {
        if (steamIdList.size() > MAX_COUNT_STEAM_ID) {
            throw new ListSteamIdException("Max count steam id must be " + MAX_COUNT_STEAM_ID);
        }
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
     * @throws ListSteamIdException when can't put item in storage
     */
    public ListSteamId add(SteamId steamId) throws ListSteamIdException {
        this.checkCanPutInStore();
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

    /**
     * Check you can put the items in the store
     *
     * @throws FullStorageListSteamIdException when storage is full
     */
    private void checkCanPutInStore() throws FullStorageListSteamIdException {
        if (steamIdList.size() == MAX_COUNT_STEAM_ID) {
            throw new FullStorageListSteamIdException("Storage is full");
        }
    }
}
