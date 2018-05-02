package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import org.steambuff.method.steamuser.entity.SchemaForGame;

import java.lang.reflect.Type;

public class SchemaForGameDeserializer implements JsonDeserializer<SchemaForGame> {


    @Override
    public SchemaForGame deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Gson gson = new Gson();

        JsonElement data = json.getAsJsonObject().get("game");

        JsonElement statsJsonElement = data.getAsJsonObject().get("availableGameStats");

        data.getAsJsonObject().add("stats", statsJsonElement.getAsJsonObject().get("stats").getAsJsonArray());
        data.getAsJsonObject().add("achievements", statsJsonElement.getAsJsonObject().get("achievements").getAsJsonArray());


        return gson.fromJson(data, SchemaForGame.class);
    }
}
