package org.steambuff.method.playerservice.entity;

import com.google.gson.annotations.SerializedName;
import org.steambuff.method.SteamId;

import java.util.List;

public class OwnedGames {
    @SerializedName("game_count")
    private long gameCount;
    @SerializedName("games")
    private List<Game> games;
}
