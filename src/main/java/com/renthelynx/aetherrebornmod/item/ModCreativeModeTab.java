package com.renthelynx.aetherrebornmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab AETHREB_TAB = new CreativeModeTab("aetherreborntab") {

        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.SKYROOTSTICK.get());
        }
    };
}
