package net.snowshock.goldentreasures.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.snowshock.goldentreasures.items.*;
import net.snowshock.goldentreasures.references.ReferencesModInfo;
import net.snowshock.goldentreasures.references.ReferencesModItems;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.snowshock.goldentreasures.references.ReferencesConfigInfo.*;

@GameRegistry.ObjectHolder(ReferencesModInfo.MOD_ID)
public class InitModItems {

    private static final Logger LOGGER = LogManager.getLogger(ReferencesModInfo.MOD_ID);

    public static final ItemGoldenTreasures golden_bomb = null;
    public static final ItemGoldenTreasures golden_coin = null;
    public static final ItemGoldenTreasures golden_miner = null;
    public static final ItemGoldenTreasures golden_chalice = null;
    public static final ItemGoldenTreasures golden_lantern = null;
    public static final ItemGoldenTreasures golden_staff = null;
    public static final ItemFood golden_food = null;

    public static void preInit() {
        LOGGER.debug("Initializing Items....");

        registerItemIfEnabled(GoldenBomb.ITEM_ENABLED, new ItemGoldenBomb(), ReferencesModItems.GOLDEN_BOMB);
        registerItemIfEnabled(GoldenCoin.ITEM_ENABLED, new ItemGoldenCoin(), ReferencesModItems.GOLDEN_COIN);
        registerItemIfEnabled(GoldenMiner.ITEM_ENABLED, new ItemGoldenMiner(), ReferencesModItems.GOLDEN_MINER);
        registerItemIfEnabled(GoldenChalice.ITEM_ENABLED, new ItemGoldenChalice(), ReferencesModItems.GOLDEN_CHALICE);
        registerItemIfEnabled(GoldenLantern.ITEM_ENABLED, new ItemGoldenLantern(), ReferencesModItems.GOLDEN_LANTERN);
        registerItemIfEnabled(GoldenFood.ITEM_ENABLED, new ItemGoldenFood(), ReferencesModItems.GOLDEN_FOOD);
        registerItemIfEnabled(GoldenStaff.ITEM_ENABLED, new ItemGoldenStaff(), ReferencesModItems.GOLDEN_STAFF);

        LOGGER.log(Level.INFO, "Mod Items Initialized");
    }

    private static void registerItemIfEnabled(boolean itemEnabled, Item item, String name) {
        if (itemEnabled) {
            GameRegistry.registerItem(item, name);
        }
    }
}
