package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import org.steambuff.method.steamuser.entity.PlayerBans;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PlayerBansDeserializer implements JsonDeserializer<List<PlayerBans>> {

    @Override
    public List<PlayerBans> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List<PlayerBans> playerBansList = new ArrayList<>();
        Gson gson = new Gson();
        JsonElement element = json.getAsJsonObject().get("players");
        if (element == null) {
            throw new JsonSyntaxException("json equals null");
        }
        element.getAsJsonArray().forEach(data -> {
            if (!data.isJsonNull()) {
                playerBansList.add(gson.fromJson(data, PlayerBans.class));

            }
        });
        return playerBansList;
    }
}
