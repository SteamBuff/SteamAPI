package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.steambuff.method.steamuser.entity.ProgressGame;
import org.steambuff.method.steamuser.entity.UserStats;

import java.lang.reflect.Type;
import java.util.List;

public class UserStatsDeserializer implements JsonDeserializer<UserStats> {

    @Override
    public UserStats deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        JsonElement data = json.getAsJsonObject().get("playerstats");
        data.getAsJsonObject().add("progressGame",new JsonObject());
        data.getAsJsonObject().get("progressGame").getAsJsonObject().add("stats",data.getAsJsonObject().get("stats").getAsJsonArray());
        data.getAsJsonObject().get("progressGame").getAsJsonObject().add("achievements",data.getAsJsonObject().get("achievements").getAsJsonArray());
        context.deserialize(json,ProgressGame.class);
        return gson.fromJson(data, UserStats.class);
    }
}
