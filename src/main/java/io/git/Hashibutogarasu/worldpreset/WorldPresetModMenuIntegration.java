package io.git.Hashibutogarasu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import io.git.Hashibutogarasu.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;

public class WorldPresetModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(ModConfig.class, parent).get();
    }
}