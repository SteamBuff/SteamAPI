package org.steambuff;

import org.junit.jupiter.api.Test;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;

import java.util.HashMap;
import java.util.Map;


class SteamApiTest {
    @Test
    void test() throws SteamApiException {
        SteamApi steamApi = SteamApi.getInstance("D253200DE0684139B7084C3275068939");
        for (int i = 0; i < 1; i++) {
            System.out.println(steamApi.getSteamUserInterface().getPlayerSummaries(new SteamId(0, i)));
            System.out.println(steamApi.getSteamUserInterface().getPlayerSummaries(new SteamId(1, i)));
        }
    }

}