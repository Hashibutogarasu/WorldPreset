package io.github.Hashibutogarasu.worldpreset.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.Hashibutogarasu.worldpreset.gamerule.ConfigToGamerule;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.world.GameRules;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.github.Hashibutogarasu.worldpreset.client.WorldPresetClient.MOD_ID;
import static net.gcardone.junidecode.Junidecode.unidecode;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModDataGenerator.class);

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Map<String, String> translations = getTranslations();

        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        String json = gson.toJson(translations);

        LOGGER.info("\n" + unidecode(json) + "\n");

        List<String> strings = getOptionClass();
        StringBuilder data = new StringBuilder();
        strings.add("\n");
        strings.forEach(s -> {
            data.append(s);
            data.append("\n");
        });
        LOGGER.info(data.toString());
    }

    @NotNull
    public static Map<String, String> getTranslations() {
        Map<String, String> translations = new HashMap<>();
        for (Field field : GameRules.class.getFields()) {
            if (field.getType() == GameRules.Key.class) {
                try {
                    GameRules.Key<?> key = ((GameRules.Key<?>) field.get(field));
                    translations.put("text.autoconfig." + MOD_ID + ".option." + key, key.getName());
                    translations.put("text.autoconfig." + MOD_ID + ".option." + key + ".@Tooltip",
                            Text.translatable(key.getTranslationKey()).getString());
                } catch (IllegalAccessException ignored) {

                }
            }
        }
        return translations;
    }

    @NotNull
    public static List<String> getOptionClass() {
        List<String> strings = new ArrayList<>();
        for (Field field : GameRules.class.getFields()) {
            if (field.getType() == GameRules.Key.class) {
                try {
                    GameRules.Key<?> key = ((GameRules.Key<?>) field.get(field));
                    strings.add("@ConfigEntry.Gui.Tooltip()");
                    NbtElement value = ConfigToGamerule.GetGameruleTypeByString(key.getName()).get(0);
                    strings.add("public " + value + " " + key.getName() + " = " + value + ";");

                } catch (IllegalAccessException ignored) {

                }
            }
        }
        return strings;
    }
}
