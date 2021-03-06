package net.xiaoyu233.mitemod.miteite.item.enchantment;

import net.minecraft.*;
import net.xiaoyu233.mitemod.miteite.item.Materials;

public class EnchantmentDefence extends Enchantment {
    protected EnchantmentDefence(int id, yq rarity, int difficulty) {
        super(id, rarity, difficulty);
    }

    @Override
    public int getNumLevels() {
        return 1;
    }

    @Override
    public String getNameSuffix() {
        return "defence";
    }

    @Override
    public boolean canEnchantItem(Item item) {
        return item instanceof ItemTool && item.getHardestMetalMaterial() == Materials.vibranium;
    }

    @Override
    public boolean isOnCreativeTab(CreativeModeTab var1) {
        return var1 == CreativeModeTab.j;
    }
}
