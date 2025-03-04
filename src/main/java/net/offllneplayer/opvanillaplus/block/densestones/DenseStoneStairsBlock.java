
package net.offllneplayer.opvanillaplus.block.densestones;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class DenseStoneStairsBlock extends StairBlock {
	public DenseStoneStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(3.5f, 8.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 8.5f;
	}
}
