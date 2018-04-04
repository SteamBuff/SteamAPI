package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.steambuff.method.steamuser.entity.PlayerSummaries;
import org.steambuff.method.steamuser.entity.StatsGame;
import org.steambuff.method.steamuser.entity.UserStats;

import java.lang.reflect.Type;
import java.util.List;

public class UserStatsDeserializer implements JsonDeserializer<UserStats> {

    @Override
    public UserStats deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        JsonElement data = json.getAsJsonObject().get("playerstats");
        context.deserialize(data.getAsJsonObject().get("stats").getAsJsonArray(),new TypeToken<List<StatsGame>>() {
        }.getType());
        return gson.fromJson(data, UserStats.class);
    }
}
