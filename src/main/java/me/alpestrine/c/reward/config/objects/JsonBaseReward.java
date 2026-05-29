package me.alpestrine.c.reward.config.objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import me.alpestrine.c.reward.util.IMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class JsonBaseReward<N extends Number> implements JSONAble {
    protected N timeThing;
    protected List<JsonStack> rewardItems;
    protected String id;
    protected List<String> commands; // Nuevo campo para almacenar comandos

    public abstract N getTime();

    public List<JsonStack> getRewardItems() {
        return rewardItems;
    }

    public String getId() {
        return id;
    }

    // Nuevo método para obtener los comandos
    public List<String> getCommands() {
        return commands;
    }

    public abstract void writeTimeThing(JsonObject object);

    public abstract N readTimeThing(JsonObject object);

    @Override
    public JsonObject toJson() {
        JsonObject obj = new JsonObject();
        writeTimeThing(obj);
        obj.addProperty("id", id != null ? id : String.valueOf(getTime()));
        
        JsonArray rewards = new JsonArray();
        if (rewardItems != null) {
            for (JsonStack stack : rewardItems) {
                rewards.add(stack.toJson());
            }
        }
        obj.add("items", rewards);

        // Guardar comandos en el JSON
        if (commands != null && !commands.isEmpty()) {
            JsonArray cmds = new JsonArray();
            for (String cmd : commands) {
                cmds.add(cmd);
            }
            obj.add("commands", cmds);
        }
        return obj;
    }

    @SuppressWarnings("unchecked cast") @Override
    public <T extends JSONAble> T fromJson(JsonObject object) {
        timeThing = readTimeThing(object);
        id = object.has("id") ? object.get("id").getAsString() : String.valueOf(getTime());
        
        // Evitamos crasheos si el array de items no existe
        JsonArray ja = object.has("items") ? object.getAsJsonArray("items") : new JsonArray();
        ArrayList<JsonStack> stacks = new ArrayList<>();
        for (JsonElement je : ja) {
            stacks.add(new JsonStack().fromJson(je.getAsJsonObject()));
        }
        rewardItems = List.copyOf(stacks);

        // Leer comandos desde el JSON
        commands = new ArrayList<>();
        if (object.has("commands")) {
            JsonArray cmds = object.getAsJsonArray("commands");
            for (JsonElement je : cmds) {
                commands.add(je.getAsString());
            }
        }
        return (T) this;
    }

    public <T> T addJsonStack(Class<T> clazz, JsonStack... stack) {
        if (rewardItems == null) {
            rewardItems = new ArrayList<>();
        }
        rewardItems.addAll(Arrays.asList(stack));
        return clazz.cast(this);
    }

    public <T> T setTimeThing(Class<T> clazz, N timeThing) {
        this.timeThing = timeThing;
        return clazz.cast(this);
    }
}