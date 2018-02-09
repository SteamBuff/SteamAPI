package org.steambuff.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListSteamId {
    private List<SteamId> steamIdList = new ArrayList<>();


    public ListSteamId(Collection<SteamId> steamIdList){
        steamIdList.addAll(steamIdList);
    }
}
