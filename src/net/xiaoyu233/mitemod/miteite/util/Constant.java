package net.xiaoyu233.mitemod.miteite.util;

import net.minecraft.Item;
import net.minecraft.ItemArmor;
import net.xiaoyu233.mitemod.miteite.item.Items;

public class Constant {
    public static int nextItemID = 2024;
    public static int nextBlockID = 160;
    public static int nextAchievementID = 136;
    public static final String MITE_ITE_VERSION = "B0.3.12-1";
    public static final int MITE_ITE_VER_NUM = 318;
    public static ItemArmor[] HELMETS = null;
    public static ItemArmor[] CHESTPLATES = null;
    public static ItemArmor[] LEGGINGS = null;
    public static ItemArmor[] BOOTS = null;
    public static ItemArmor[][] ARMORS = null;

    public static void initItemArray() {
        HELMETS = new ItemArmor[]{Item.X, Item.helmetChainCopper, Item.helmetCopper, Item.helmetRustedIron,
                Item.helmetChainIron, Item.af, Item.helmetChainAncientMetal, Item.helmetAncientMetal,
                Item.helmetChainMithril, Item.helmetMithril, Item.helmetAdamantium, Items.VIBRANIUM_HELMET};
        CHESTPLATES = new ItemArmor[]{Item.Y, Item.plateChainCopper, Item.plateCopper, Item.plateRustedIron,
                Item.plateChainIron, Item.ag, Item.plateChainAncientMetal, Item.plateAncientMetal,
                Item.plateChainMithril, Item.plateMithril, Item.plateAdamantium, Items.VIBRANIUM_CHESTPLATE};
        LEGGINGS = new ItemArmor[]{Item.Z, Item.legsChainCopper, Item.legsCopper, Item.legsRustedIron,
                Item.legsChainIron, Item.ah, Item.legsChainAncientMetal, Item.legsAncientMetal, Item.legsChainMithril,
                Item.legsMithril, Item.legsAdamantium, Items.VIBRANIUM_LEGGINGS};
        BOOTS = new ItemArmor[]{Item.aa, Item.bootsChainCopper, Item.bootsCopper, Item.bootsRustedIron,
                Item.bootsChainIron, Item.ai, Item.bootsChainAncientMetal, Item.bootsAncientMetal,
                Item.bootsChainMithril, Item.bootsMithril, Item.bootsAdamantium, Items.VIBRANIUM_BOOTS};
        ARMORS = new ItemArmor[][]{HELMETS, CHESTPLATES, LEGGINGS, BOOTS};
    }

}
