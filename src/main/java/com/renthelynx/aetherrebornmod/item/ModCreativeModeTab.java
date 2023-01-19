package com.renthelynx.aetherrebornmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AETHREB_TAB = new CreativeModeTab("aetherreborntab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SKYROOTSTICK.get());
        }
    };
}
