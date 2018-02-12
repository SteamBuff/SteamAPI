package org.steambuff;

import org.junit.jupiter.api.Test;
import org.steambuff.driver.DriverInterface;
import org.steambuff.exception.SteamApiException;
import org.steambuff.method.SteamId;

import java.util.ArrayList;
import java.util.List;


class SteamApiTest {
    @Test
    void test() throws SteamApiException {
        SteamApi steamApi = SteamApi.getInstance("a");
        System.out.println(steamApi.getSteamUserInterface().getPlayerSummaries(new SteamId(0,2)).get(0).getDisplayName());
    }

}