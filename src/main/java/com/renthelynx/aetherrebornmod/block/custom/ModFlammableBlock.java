package com.renthelynx.aetherrebornmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ModFlammableBlock extends Block {
	private final boolean isFlammable;
	private final int flammability;
	private final int fireSpreadSpeed;

	public ModFlammableBlock(Properties pProperties, boolean isFlammable, int flammability, int fireSpreadSpeed) {
		super(pProperties);

		this.isFlammable = isFlammable;
		this.flammability = flammability;
		this.fireSpreadSpeed = fireSpreadSpeed;
	}

	@Override
	public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		//return super.isFlammable(state, level, pos, direction);
		return isFlammable;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		// return super.getFlammability(state, level, pos, direction);
		return flammability;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		//return super.getFireSpreadSpeed(state, level, pos, direction);
		return fireSpreadSpeed;
	}
}
