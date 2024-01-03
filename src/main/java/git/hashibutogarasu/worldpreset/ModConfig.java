package git.hashibutogarasu.worldpreset;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "worldpreset")
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Excluded()
    private static ModConfig config;

    public static void setConfig(ModConfig config) {
        ModConfig.config = config;
    }

    public static ModConfig getConfig() {
        return ModConfig.config;
    }

    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean doFireTick = true;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public boolean mobGriefing = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean keepInventory = false;
    @ConfigEntry.Category("SPAWNING")
    @ConfigEntry.Gui.Tooltip()
    public boolean doMobSpawning = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean doMobLoot = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean projectilesCanBreakBlocks = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean doTileDrops = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean doEntityDrops = true;
    @ConfigEntry.Category("CHAT")
    @ConfigEntry.Gui.Tooltip()
    public boolean commandBlockOutput = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean naturalRegeneration = true;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean doDaylightCycle = true;
    @ConfigEntry.Category("CHAT")
    @ConfigEntry.Gui.Tooltip()
    public boolean logAdminCommands = true;
    @ConfigEntry.Category("CHAT")
    @ConfigEntry.Gui.Tooltip()
    public boolean showDeathMessages = true;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public int randomTickSpeed = 3;
    @ConfigEntry.Category("CHAT")
    @ConfigEntry.Gui.Tooltip()
    public boolean sendCommandFeedback = true;
    @ConfigEntry.Category("MISC")
    @ConfigEntry.Gui.Tooltip()
    public boolean reducedDebugInfo = false;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean spectatorsGenerateChunks = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public int spawnRadius = 10;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean disableElytraMovementCheck = false;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public int maxEntityCramming = 24;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean doWeatherCycle = true;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public boolean doLimitedCrafting = false;
    @ConfigEntry.Category("MISC")
    @ConfigEntry.Gui.Tooltip()
    public int maxCommandChainLength = 65536;
    @ConfigEntry.Category("MISC")
    @ConfigEntry.Gui.Tooltip()
    public int maxCommandForkCount = 65536;
    @ConfigEntry.Category("MISC")
    @ConfigEntry.Gui.Tooltip()
    public int commandModificationBlockLimit = 32768;
    @ConfigEntry.Category("CHAT")
    @ConfigEntry.Gui.Tooltip()
    public boolean announceAdvancements = true;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public boolean disableRaids = false;
    @ConfigEntry.Category("SPAWNING")
    @ConfigEntry.Gui.Tooltip()
    public boolean doInsomnia = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean doImmediateRespawn = false;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public int playersNetherPortalDefaultDelay = 80;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public int playersNetherPortalCreativeDelay = 1;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean drowningDamage = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean fallDamage = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean fireDamage = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean freezeDamage = true;
    @ConfigEntry.Category("SPAWNING")
    @ConfigEntry.Gui.Tooltip()
    public boolean doPatrolSpawning = true;
    @ConfigEntry.Category("SPAWNING")
    @ConfigEntry.Gui.Tooltip()
    public boolean doTraderSpawning = true;
    @ConfigEntry.Category("SPAWNING")
    @ConfigEntry.Gui.Tooltip()
    public boolean doWardenSpawning = true;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public boolean forgiveDeadPlayers = true;
    @ConfigEntry.Category("MOBS")
    @ConfigEntry.Gui.Tooltip()
    public boolean universalAnger = false;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public int playersSleepingPercentage = 100;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean blockExplosionDropDecay = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean mobExplosionDropDecay = true;
    @ConfigEntry.Category("DROPS")
    @ConfigEntry.Gui.Tooltip()
    public boolean tntExplosionDropDecay = false;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean waterSourceConversion = true;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean lavaSourceConversion = false;
    @ConfigEntry.Category("MISC")
    @ConfigEntry.Gui.Tooltip()
    public boolean globalSoundEvents = true;
    @ConfigEntry.Category("UPDATES")
    @ConfigEntry.Gui.Tooltip()
    public boolean doVinesSpread = true;
    @ConfigEntry.Category("PLAYER")
    @ConfigEntry.Gui.Tooltip()
    public boolean enderPearlsVanishOnDeath = true;
}