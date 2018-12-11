package org.steambuff.method.steamuser.deserializer;

import com.google.gson.*;
import org.steambuff.method.steamuser.entity.ProgressGame;
import org.steambuff.method.steamuser.entity.UserStats;

import java.lang.reflect.Type;

/**
 * The type User stats deserializer.
 */
public class UserStatsDeserializer implements JsonDeserializer<UserStats> {

    @Override
    public UserStats deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        this.checkAllRequiredJsonElements(json.getAsJsonObject(), "playerstats");
        JsonElement data = json.getAsJsonObject().get("playerstats");

        this.checkAllRequiredJsonElements(data.getAsJsonObject(), "stats", "achievements");
        JsonElement statsJsonElement = data.getAsJsonObject().get("stats");
        JsonElement achievements = data.getAsJsonObject().get("achievements");

        data.getAsJsonObject().add("progressGame", new JsonObject());
        data.getAsJsonObject().get("progressGame").getAsJsonObject().add("stats", statsJsonElement.getAsJsonArray());
        data.getAsJsonObject().get("progressGame").getAsJsonObject().add("achievements", achievements.getAsJsonArray());
        context.deserialize(json, ProgressGame.class);
        return gson.fromJson(data, UserStats.class);
    }

    /**
     * TODO move to AbstractDeserializer
     *
     * @param root         root Json Object where store element
     * @param nameElements names Elements
     * @throws JsonParseException throw if element not exits
     */
    private void checkAllRequiredJsonElements(JsonObject root, String... nameElements) throws JsonSyntaxException {
        for (String nameElement : nameElements) {
            if (root.get(nameElement) == null) {
                throw new JsonSyntaxException("Not found object '" + nameElement + "'");
            }
        }
    }
}
