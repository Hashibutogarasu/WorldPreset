package io.github.Hashibutogarasu.worldpreset.client;

import io.github.Hashibutogarasu.worldpreset.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldPresetClient implements ClientModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger(WorldPresetClient.class);
    public static String MOD_ID = "worldpreset";
    @Override
    public void onInitializeClient() {
        ConfigHolder<ModConfig> configHolder = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModConfig.setConfig(configHolder.getConfig());
    }
}
