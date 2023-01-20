package com.renthelynx.aetherrebornmod.block.custom;

import com.renthelynx.aetherrebornmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    private final boolean isFlammable;
    private final int flammability;
    private final int fireSpreadSpeed;

    public ModFlammableRotatedPillarBlock(Properties pProperties, boolean isFlammable, int flammability, int fireSpreadSpeed) {
        super(pProperties);

        this.isFlammable = isFlammable;
        this.flammability = flammability;
        this.fireSpreadSpeed = fireSpreadSpeed;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        // return true;
        return isFlammable;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        // return 5;
        return flammability;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        // return 5;
        return fireSpreadSpeed;
    }

//    @Nullable
//    @Override
//    public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player,
//                                           ItemStack stack, ToolAction toolAction) {
//        if(stack.getItem() instanceof AxeItem) {
//            if(state.is(ModBlocks.SKYROOT_LOG.get())) {
//                return ModBlocks.STRIPPED_SKYROOT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
//            }
//            if(state.is(ModBlocks.SKYROOT_WOOD.get())) {
//                return ModBlocks.STRIPPED_SKYROOT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
//            }
//        }
//
//        return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
//    }

    /** replaced the deprecated method with the newer one */
    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.SKYROOT_LOG.get())) {
                return ModBlocks.STRIPPED_SKYROOT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.SKYROOT_WOOD.get())) {
                return ModBlocks.STRIPPED_SKYROOT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
