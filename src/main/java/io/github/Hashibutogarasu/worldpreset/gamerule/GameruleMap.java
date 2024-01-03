package io.github.Hashibutogarasu.worldpreset.gamerule;

import io.github.Hashibutogarasu.worldpreset.config.ModConfig;
import net.minecraft.world.GameRules;

import java.util.HashMap;
import java.util.Map;

public class GameruleMap {
    public Map<GameRules.Key<GameRules.BooleanRule>, Boolean> booleanRuleMap = new HashMap<>();
    public Map<GameRules.Key<GameRules.IntRule>, Integer> intRuleMap = new HashMap<>();

    public GameruleMap() {
        ModConfig config = ModConfig.getConfig();
        booleanRuleMap.put(GameRules.DO_FIRE_TICK, config.doFireTick);
        booleanRuleMap.put(GameRules.DO_MOB_GRIEFING, config.mobGriefing);
        booleanRuleMap.put(GameRules.KEEP_INVENTORY, config.keepInventory);
        booleanRuleMap.put(GameRules.DO_MOB_SPAWNING, config.doMobSpawning);
        booleanRuleMap.put(GameRules.DO_MOB_LOOT, config.doMobLoot);
        booleanRuleMap.put(GameRules.PROJECTILES_CAN_BREAK_BLOCKS, config.projectilesCanBreakBlocks);
        booleanRuleMap.put(GameRules.DO_TILE_DROPS, config.doTileDrops);
        booleanRuleMap.put(GameRules.DO_ENTITY_DROPS, config.doEntityDrops);
        booleanRuleMap.put(GameRules.COMMAND_BLOCK_OUTPUT, config.commandBlockOutput);
        booleanRuleMap.put(GameRules.NATURAL_REGENERATION, config.naturalRegeneration);
        booleanRuleMap.put(GameRules.DO_DAYLIGHT_CYCLE, config.doDaylightCycle);
        booleanRuleMap.put(GameRules.LOG_ADMIN_COMMANDS, config.logAdminCommands);
        booleanRuleMap.put(GameRules.SHOW_DEATH_MESSAGES, config.showDeathMessages);
        intRuleMap.put(GameRules.RANDOM_TICK_SPEED, config.randomTickSpeed);
        booleanRuleMap.put(GameRules.SEND_COMMAND_FEEDBACK, config.sendCommandFeedback);
        booleanRuleMap.put(GameRules.REDUCED_DEBUG_INFO, config.reducedDebugInfo);
        booleanRuleMap.put(GameRules.SPECTATORS_GENERATE_CHUNKS, config.spectatorsGenerateChunks);
        intRuleMap.put(GameRules.SPAWN_RADIUS, config.spawnRadius);
        booleanRuleMap.put(GameRules.DISABLE_ELYTRA_MOVEMENT_CHECK, config.disableElytraMovementCheck);
        intRuleMap.put(GameRules.MAX_ENTITY_CRAMMING, config.maxEntityCramming);
        booleanRuleMap.put(GameRules.DO_WEATHER_CYCLE, config.doWeatherCycle);
        booleanRuleMap.put(GameRules.DO_LIMITED_CRAFTING, config.doLimitedCrafting);
        intRuleMap.put(GameRules.MAX_COMMAND_CHAIN_LENGTH, config.maxCommandChainLength);
        intRuleMap.put(GameRules.MAX_COMMAND_FORK_COUNT, config.maxCommandForkCount);
        intRuleMap.put(GameRules.COMMAND_MODIFICATION_BLOCK_LIMIT, config.commandModificationBlockLimit);
        booleanRuleMap.put(GameRules.ANNOUNCE_ADVANCEMENTS, config.announceAdvancements);
        booleanRuleMap.put(GameRules.DISABLE_RAIDS, config.disableRaids);
        booleanRuleMap.put(GameRules.DO_INSOMNIA, config.doInsomnia);
        booleanRuleMap.put(GameRules.DO_IMMEDIATE_RESPAWN, config.doImmediateRespawn);
        intRuleMap.put(GameRules.PLAYERS_NETHER_PORTAL_DEFAULT_DELAY, config.playersNetherPortalDefaultDelay);
        intRuleMap.put(GameRules.PLAYERS_NETHER_PORTAL_CREATIVE_DELAY, config.playersNetherPortalCreativeDelay);
        booleanRuleMap.put(GameRules.DROWNING_DAMAGE, config.drowningDamage);
        booleanRuleMap.put(GameRules.FALL_DAMAGE, config.fallDamage);
        booleanRuleMap.put(GameRules.FIRE_DAMAGE, config.fireDamage);
        booleanRuleMap.put(GameRules.FREEZE_DAMAGE, config.freezeDamage);
        booleanRuleMap.put(GameRules.DO_PATROL_SPAWNING, config.doPatrolSpawning);
        booleanRuleMap.put(GameRules.DO_TRADER_SPAWNING, config.doTraderSpawning);
        booleanRuleMap.put(GameRules.DO_WARDEN_SPAWNING, config.doWardenSpawning);
        booleanRuleMap.put(GameRules.FORGIVE_DEAD_PLAYERS, config.forgiveDeadPlayers);
        booleanRuleMap.put(GameRules.UNIVERSAL_ANGER, config.universalAnger);
        intRuleMap.put(GameRules.PLAYERS_SLEEPING_PERCENTAGE, config.playersSleepingPercentage);
        booleanRuleMap.put(GameRules.BLOCK_EXPLOSION_DROP_DECAY, config.blockExplosionDropDecay);
        booleanRuleMap.put(GameRules.MOB_EXPLOSION_DROP_DECAY, config.mobExplosionDropDecay);
        booleanRuleMap.put(GameRules.TNT_EXPLOSION_DROP_DECAY, config.tntExplosionDropDecay);
        booleanRuleMap.put(GameRules.WATER_SOURCE_CONVERSION, config.waterSourceConversion);
        booleanRuleMap.put(GameRules.LAVA_SOURCE_CONVERSION, config.lavaSourceConversion);
        booleanRuleMap.put(GameRules.GLOBAL_SOUND_EVENTS, config.globalSoundEvents);
        booleanRuleMap.put(GameRules.DO_VINES_SPREAD, config.doVinesSpread);
        booleanRuleMap.put(GameRules.ENDER_PEARLS_VANISH_ON_DEATH, config.enderPearlsVanishOnDeath);
    }
}
