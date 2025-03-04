
package net.offllneplayer.opvanillaplus.block.densestones;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class DenseStoneTrapdoorBlock extends TrapDoorBlock {
	public DenseStoneTrapdoorBlock() {
		super(BlockSetType.STONE, Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(3.5f, 8.5f).requiresCorrectToolForDrops());
	}
}
