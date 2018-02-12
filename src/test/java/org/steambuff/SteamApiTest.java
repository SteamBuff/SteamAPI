package org.steambuff;

import org.junit.jupiter.api.Test;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;


class SteamApiTest {
    @Test
    void test() throws SteamApiException {
        SteamApi steamApi = SteamApi.getInstance("D253200DE0684139B7084C3275068939");
        ListSteamId steamIdList = new ListSteamId();
        for (int i = 0; i < 50; i++) {
            steamIdList.add(new SteamId(0, i));
            steamIdList.add(new SteamId(1, i));
        }
        steamApi.getSteamUserInterface().getPlayerSummaries(steamIdList).forEach(data -> {
            System.out.println(data.getAvatarFull());
        });
    }

}