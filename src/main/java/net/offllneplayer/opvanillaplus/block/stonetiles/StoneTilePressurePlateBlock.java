
package net.offllneplayer.opvanillaplus.block.stonetiles;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class StoneTilePressurePlateBlock extends PressurePlateBlock {
	public StoneTilePressurePlateBlock() {
		super(BlockSetType.IRON, Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops().forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
