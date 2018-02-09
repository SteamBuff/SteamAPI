package org.steambuff.method.playerservice.entity;

import org.steambuff.method.SteamId;

import java.util.List;

public class OwnedGames {
    private SteamId steamId;
    private long gameCount;
    private List<Game> games;
}
