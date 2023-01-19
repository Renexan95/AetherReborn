package com.renthelynx.aetherrebornmod.item;

import com.renthelynx.aetherrebornmod.AetherRebornMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AetherRebornMod.MOD_ID);
    
    // ITEMS DEFINITION
        public static final RegistryObject<Item> SKYROOTSTICK = ITEMS.register("skyrootstick", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETHREB_TAB)));
        //public static final RegistryObject<Item> SKYROOTSTICK = ITEMS.register("skyrootstick", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETHREB_TAB)));

    // END DEFINITION
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    



}
