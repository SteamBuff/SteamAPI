package org.steambuff.method.steamuser;

import org.steambuff.exception.SteamApiException;
import org.steambuff.method.ListSteamId;
import org.steambuff.method.SteamId;
import org.steambuff.method.steamuser.entity.PlayerBans;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.SchemaForGame;
import org.steambuff.method.steamuser.entity.UserStats;

import java.util.List;

public interface SteamUserInterface {

    List<PlayerSummaries> getPlayerSummaries(ListSteamId listSteamId) throws SteamApiException;

    List<PlayerSummaries> getPlayerSummaries(SteamId steamId) throws SteamApiException;

    UserStats getUserStatsForGame(SteamId steamId, int appId) throws SteamApiException;

    List<PlayerBans> getPlayerBans(ListSteamId listSteamId) throws SteamApiException;

    List<PlayerBans> getPlayerBans(SteamId steamId) throws SteamApiException;


    SchemaForGame getSchemaForGame(int appId) throws SteamApiException;

}
