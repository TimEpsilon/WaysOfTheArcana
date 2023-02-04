package com.github.timepsilon.wota.common.item.tab;

import com.github.timepsilon.wota.common.item.tarot.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {

    public static final CreativeModeTab ARCANA_TAB = new CreativeModeTab("arcana_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CARD_FOOL.get());
        }
    };

}
