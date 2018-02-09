package org.steambuff.method.steamuser;

import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerSummaries;

import java.util.List;

public interface SteamUserInterface {

    List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId);

    PlayerSummaries getPlayerSummaries(SteamId steamId);
}
