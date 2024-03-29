package io.github.Hashibutogarasu.worldpreset.mixin;

import io.github.Hashibutogarasu.worldpreset.client.WorldPresetClient;
import io.github.Hashibutogarasu.worldpreset.config.ModConfig;
import io.github.Hashibutogarasu.worldpreset.gamerule.GameruleMap;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import net.minecraft.client.gui.screen.world.WorldCreator;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreateWorldScreen.class)
public abstract class CreateWorldScreenMixin extends Screen {
    protected CreateWorldScreenMixin(Text title) {
        super(title);
    }

    @Shadow
    public abstract WorldCreator getWorldCreator();

    @Shadow @Final
    WorldCreator worldCreator;
    @Unique
    private final Logger LOGGER = LoggerFactory.getLogger(WorldPresetClient.class);

    @Inject(method = "init", at = @At("RETURN"))
    private void init(CallbackInfo ci) {
        WorldCreator world = getWorldCreator();
        GameruleMap gameruleMap = new GameruleMap();

        gameruleMap.booleanRuleMap.forEach((key, aBoolean) -> world.getGameRules().get(key).set(aBoolean, null));
        gameruleMap.intRuleMap.forEach((key, integer) -> world.getGameRules().get(key).set(integer, null));
        world.setGenerateStructures(ModConfig.getConfig().generateStructures);
        world.update();
    }
}
