package io.git.Hashibutogarasu.gui.widgets;

import io.git.Hashibutogarasu.WorldPreset;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextIconButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModConfigButtons {        
        public static TextIconButtonWidget createModConfigButton(int width, ButtonWidget.PressAction onPress,
                        boolean hideText) {
                Text text = hideText ? Text.translatable("options.worldpreset")
                                : Text.translatable("worldpreset.onboarding.accessibility.button");
                return TextIconButtonWidget.builder(text, onPress, hideText).width(width)
                                .texture(new Identifier(WorldPreset.MOD_ID, "icon/worldpreset"), 15, 15).build();
        }
}
