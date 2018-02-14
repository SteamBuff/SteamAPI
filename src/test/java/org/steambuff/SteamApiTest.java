package org.steambuff;

import org.junit.jupiter.api.Test;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;


class SteamApiTest {
    @Test
    void test() throws SteamApiException {
        SteamApi steamApi = SteamApi.getInstance("");
        ListSteamId steamIdList = new ListSteamId();
        for (int i = 0; i < 1; i++) {
            steamIdList.add(new SteamId(0, 108313947));
        }
        steamApi.getSteamUserInterface().getPlayerSummaries(steamIdList);
    }

}