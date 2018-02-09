package org.steambuff.entity.playerservice;

import org.steambuff.entity.SteamId;

import java.util.List;

public class OwnedGames {
    private SteamId steamId;
    private long gameCount;
    private List<Game> games;
}
