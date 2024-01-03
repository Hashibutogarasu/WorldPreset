package git.hashibutogarasu.worldpreset.gui.widgets;

import static git.hashibutogarasu.worldpreset.WorldPreset.MOD_ID;

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
                                .texture(new Identifier(MOD_ID, "icon/worldpreset"), 15, 15).build();
        }
}
