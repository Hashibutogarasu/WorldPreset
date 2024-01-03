package io.git.Hashibutogarasu.mixin;

import io.git.Hashibutogarasu.config.ModConfig;
import io.git.Hashibutogarasu.gui.widgets.ModConfigButtons;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.TextIconButtonWidget;
import net.minecraft.text.Text;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {
    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("RETURN"))
    private void init(CallbackInfo ci) {
        int l = this.height / 4 + 48;
        TextIconButtonWidget modconfigbutton = (TextIconButtonWidget) this
                .addDrawableChild(ModConfigButtons.createModConfigButton(20, (button) -> {
                    this.client.setScreen(AutoConfig.getConfigScreen(ModConfig.class, this).get());
                }, true));
        modconfigbutton.setPosition(this.width / 2 + 104 + 23, l + 72 + 12);
    }
}
