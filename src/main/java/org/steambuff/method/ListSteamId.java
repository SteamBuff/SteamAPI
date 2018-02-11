package org.steambuff.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListSteamId {
    private List<SteamId> steamIdList = new ArrayList<>();


    public ListSteamId(Collection<SteamId> steamIdList){
        steamIdList.addAll(steamIdList);
    }

    public ListSteamId(SteamId steamId){
        steamIdList.add(steamId);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        steamIdList.forEach(steamId -> stringBuilder.append(steamId.toId64()).append(","));
        return stringBuilder.toString();
    }
}
