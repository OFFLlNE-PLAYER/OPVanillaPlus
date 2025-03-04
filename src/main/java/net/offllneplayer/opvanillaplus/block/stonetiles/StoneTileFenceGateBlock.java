
package net.offllneplayer.opvanillaplus.block.stonetiles;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class StoneTileFenceGateBlock extends FenceGateBlock {
	public StoneTileFenceGateBlock() {
		super(WoodType.OAK, Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
