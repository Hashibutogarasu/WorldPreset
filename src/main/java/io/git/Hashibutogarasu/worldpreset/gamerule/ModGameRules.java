package io.git.Hashibutogarasu.gamerule;

import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModGameRules<R extends GameRules.Rule<R>> extends GameRules {
    public static Logger LOGGER = LoggerFactory.getLogger(ModGameRules.class);
    public boolean tryCast(R rule, Class<?> classsz){
        try{
            return rule.equals(classsz.getClass());
        }
        catch (ClassCastException error){
            return false;
        }
    }
}
