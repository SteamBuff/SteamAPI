package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import org.steambuff.method.steamuser.entity.PlayerSummaries;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PlayerSummariesDeserializer implements JsonDeserializer<List<PlayerSummaries>> {


    @Override
    public List<PlayerSummaries> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List<PlayerSummaries> playerSummariesList = new ArrayList<>();
        Gson gson = new Gson();
        json.getAsJsonObject().get("response").getAsJsonObject().get("players").getAsJsonArray().forEach(data -> {
            if (!data.isJsonNull()) {
                playerSummariesList.add(gson.fromJson(data, PlayerSummaries.class));

            }
        });
        return playerSummariesList;
    }


}
