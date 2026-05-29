package me.alpestrine.c.reward.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.alpestrine.c.reward.config.objects.JsonGlobal;
import me.alpestrine.c.reward.server.MainServer;

import java.util.Map;
import java.util.UUID;

public class GlobalConfigHandler implements BasicConfigReader<Void, Void> {

    @Override
    public JsonArray getJson() {
        // PARCHE: Ahora lee los datos en vivo del servidor en lugar de usar una caché
        // vacía
        JsonArray ja = new JsonArray();
        JsonObject jo = new JsonObject();

        jo.addProperty("millisecondsInDay", MainServer.millisecondsInDay);
        jo.addProperty("updateTickTime", MainServer.ticksPerUpdate);

        JsonArray entitiesJa = new JsonArray();
        for (UUID uuid : MainServer.screenEntities) {
            entitiesJa.add(uuid.toString());
        }
        jo.add("screenentity", entitiesJa);

        ja.add(jo);
        return ja;
    }

    @Override
    public Map<Void, Void> getItems() {
        return Map.of();
    }

    @Override
    public String getDefault() {
        return readStringFromAsset("config/global.json");
    }

    @Override
    public void setJson(JsonArray ja) {
        JsonGlobal global;
        if (ja.isEmpty()) {
            global = new JsonGlobal();
        } else {
            global = new JsonGlobal().fromJson(ja.get(0).getAsJsonObject());
        }
        MainServer.millisecondsInDay = global.getMillisecondsInDay();
        MainServer.ticksPerUpdate = global.getTicksPerUpdate();
        MainServer.screenEntities = global.getScreenEntity();
    }

    @Override
    public String getName() {
        return "global";
    }
}