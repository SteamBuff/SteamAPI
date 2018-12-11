package org.steambuff.method.playerservice.deserializer;

import com.google.gson.*;
import org.steambuff.method.playerservice.entity.OwnedGames;

import java.lang.reflect.Type;

/**
 * The type Owned games deserializer.
 */
public class OwnedGamesDeserializer implements JsonDeserializer<OwnedGames> {
    @Override
    public OwnedGames deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        JsonElement data = json.getAsJsonObject().get("response");
        return gson.fromJson(data, OwnedGames.class);
    }
}
