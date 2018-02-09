package org.steambuff.method.entity.response.playerservice;

import org.steambuff.method.entity.SteamId;

import java.util.List;

public class OwnedGames {
    private SteamId steamId;
    private long gameCount;
    private List<Game> games;
}
