package org.steambuff.steamuser.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.exception.FullStorageListSteamIdException;
import org.steambuff.method.exception.ListSteamIdException;

import java.util.ArrayList;
import java.util.List;

public class ListSteamIdTest {


    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void checkMaxCountInConstruct() {
        expectedEx.expect(ListSteamIdException.class);
        expectedEx.expectMessage("Max count steam id must be 100");
        List<SteamId> list = new ArrayList<>();
        for (int steamId = 1; steamId < 102; steamId++) {
            list.add(new SteamId(steamId));
        }
        new ListSteamId(list);
    }

    @Test
    public void checkMaxCount() {
        expectedEx.expect(FullStorageListSteamIdException.class);
        expectedEx.expectMessage("Storage is full");
        ListSteamId listSteamId = new ListSteamId();
        for (int steamId = 1; steamId < 102; steamId++) {
            listSteamId.add(new SteamId(steamId));
        }
    }
}
