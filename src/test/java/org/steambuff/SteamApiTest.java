package org.steambuff;

import org.junit.jupiter.api.Test;
import org.steambuff.driver.DriverInterface;
import org.steambuff.method.SteamId;

import java.util.ArrayList;
import java.util.List;


class SteamApiTest {

    private DriverInterface driver = new TestDriver();
    private SteamApi steamApi = new SteamApi("KEY?",driver);
    @Test
    void testSteamUserInterface() {
        System.out.println(steamApi.getSteamUserInterface().getPlayerSummaries(new SteamId(1,2)).get(0).getDisplayName());
    }
}