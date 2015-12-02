package net.snowshock.GoldenTreasures.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.snowshock.GoldenTreasures.items.*;
import net.snowshock.GoldenTreasures.references.ReferencesModInfo;
import net.snowshock.GoldenTreasures.references.ReferencesModItems;

@GameRegistry.ObjectHolder(ReferencesModInfo.MOD_ID)
public class InitModItems {
    public static final ItemGoldenTreasures golden_bomb = new ItemGoldenBomb();
    public static final ItemGoldenTreasures golden_chalice = new ItemGoldenChalice();
    public static final ItemGoldenTreasures golden_coin = new ItemGoldenCoin();
    public static final ItemGoldenTreasures golden_food = new ItemGoldenFood();
    public static final ItemGoldenTreasures golden_lantern = new ItemGoldenLantern();
    //    public static final ItemGoldenTreasures golden_lilypad = new ItemGoldenLilypad();
    public static final ItemGoldenTreasures golden_miner = new ItemGoldenMiner();
    public static final ItemGoldenTreasures golden_staff = new ItemGoldenStaff();
    public static final ItemGoldenTreasures golden_torch = new ItemGoldenTorch();

    public static void init() {
        GameRegistry.registerItem(golden_bomb, ReferencesModItems.GOLDEN_BOMB);
        GameRegistry.registerItem(golden_chalice, ReferencesModItems.GOLDEN_CHALICE);
        GameRegistry.registerItem(golden_coin, ReferencesModItems.GOLDEN_COIN);
        GameRegistry.registerItem(golden_food, ReferencesModItems.GOLDEN_FOOD);
        GameRegistry.registerItem(golden_lantern, ReferencesModItems.GOLDEN_LANTERN);
//        GameRegistry.registerItem(golden_lilypad, ReferencesModItems.GOLDEN_LILYPAD);
        GameRegistry.registerItem(golden_miner, ReferencesModItems.GOLDEN_MINER);
        GameRegistry.registerItem(golden_staff, ReferencesModItems.GOLDEN_STAFF);
        GameRegistry.registerItem(golden_torch, ReferencesModItems.GOLDEN_TORCH);
    }
}