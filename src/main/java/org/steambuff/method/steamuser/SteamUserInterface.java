package org.steambuff.method.steamuser;

import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.UserStats;

import java.util.List;

public interface SteamUserInterface {

    List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) throws SteamApiException;

    List<PlayerSummaries> getPlayerSummaries(SteamId steamId) throws SteamApiException;

    UserStats getUserStatsForGame(SteamId steamId, int appId) throws SteamApiException;
}
