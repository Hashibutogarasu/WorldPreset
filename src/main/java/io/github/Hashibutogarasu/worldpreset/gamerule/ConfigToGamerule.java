package io.github.Hashibutogarasu.worldpreset.gamerule;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.world.GameRules;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ConfigToGamerule {
    public static List<NbtElement> GetGameruleTypeByString(String value) {
        List<NbtElement> list = new ArrayList<>();
        GameRules gameRules = new GameRules();
        NbtCompound nbt = gameRules.toNbt();
        nbt.getKeys().forEach(s -> {
            for (Field field : gameRules.getClass().getFields()) {
                try {
                    if (String.valueOf(field.get(gameRules)).equals(s)) {
                        if (s.equals(value)) {
                            list.add(nbt.get(value));
                        }
                    }
                } catch (IllegalAccessException | NumberFormatException ignored) {

                }
            }
        });

        return list;
    }
}
