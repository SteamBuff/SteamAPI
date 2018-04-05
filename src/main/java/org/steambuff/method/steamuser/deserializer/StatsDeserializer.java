package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import org.steambuff.method.steamuser.entity.StatsGame;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StatsDeserializer implements JsonDeserializer<List<StatsGame>> {

    @Override
    public List<StatsGame> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List<StatsGame> statsGames = new ArrayList<>();
        Gson gson = new Gson();
        json.getAsJsonArray().forEach(data -> {
            statsGames.add(gson.fromJson(data.getAsJsonObject(), StatsGame.class));
        });
        return statsGames;
    }
}
