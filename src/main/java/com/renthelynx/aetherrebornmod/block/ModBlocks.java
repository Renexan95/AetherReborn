package com.renthelynx.aetherrebornmod.block;

import com.renthelynx.aetherrebornmod.block.custom.ModFlammableBlock;
import com.renthelynx.aetherrebornmod.block.custom.ModFlammableRotatedPillarBlock;
import com.renthelynx.aetherrebornmod.item.ModCreativeModeTab;
import com.renthelynx.aetherrebornmod.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.renthelynx.aetherrebornmod.AetherRebornMod.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    // BLOCK DEFINITION

        /** If you add a constructor into your ModFlammableRotatedPillarBlock <p>
         * you can give all registered Block their own flammable-Attributes</p>*/
        // Skyroot Blocks
        public static final RegistryObject<Block> SKYROOT_LOG = registerBlock("skyroot_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG),
                    true, 5,5), ModCreativeModeTab.AETHREB_TAB);

        public static final RegistryObject<Block> SKYROOT_WOOD = registerBlock("skyroot_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD),
                    true, 5, 5), ModCreativeModeTab.AETHREB_TAB);

        public static final RegistryObject<Block> STRIPPED_SKYROOT_LOG = registerBlock("stripped_skyroot_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG),
                    true, 5, 5),
            ModCreativeModeTab.AETHREB_TAB);

        public static final RegistryObject<Block> STRIPPED_SKYROOT_WOOD = registerBlock("stripped_skyroot_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD),
                    true, 5, 5), ModCreativeModeTab.AETHREB_TAB);

        /** If you create your own FlammableBlock, you can give all the (Wooden) Blocks their own<p>
         * flammable-Attributes, your code looks much cleaner, and you can save a lot of space</p>*/
        public static final RegistryObject<Block> SKYROOT_PLANKS = registerBlock("skyroot_plank",
            () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS),
                    true, 20, 5), ModCreativeModeTab.AETHREB_TAB);

//            {
//                @Override
//                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
//                    return true;
//                }
//
//                @Override
//                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
//                    return 20;
//                }
//
//                @Override
//                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
//                    return 5;
//                }
//            }

        public static final RegistryObject<Block> SKYROOT_STAIRS = registerBlock("skyroot_stairs",
            () -> new StairBlock(() -> ModBlocks.SKYROOT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTab.AETHREB_TAB);
        public static final RegistryObject<Block> SKYROOT_FENCE = registerBlock("skyroot_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTab.AETHREB_TAB);
        //Whisproot Blocks
        //Goldentree Blocks

    // END DEFINITION



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
