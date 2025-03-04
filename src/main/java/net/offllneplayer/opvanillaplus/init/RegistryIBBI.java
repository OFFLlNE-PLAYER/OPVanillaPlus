
package net.offllneplayer.opvanillaplus.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.offllneplayer.opvanillaplus.OPVanillaPlus;
import net.offllneplayer.opvanillaplus.block.*;
import net.offllneplayer.opvanillaplus.block.chiseledore.*;
import net.offllneplayer.opvanillaplus.block.densestones.*;
import net.offllneplayer.opvanillaplus.block.densestones.densestonebricks.*;
import net.offllneplayer.opvanillaplus.block.densestones.densestonetiles.*;
import net.offllneplayer.opvanillaplus.block.furnaces.*;
import net.offllneplayer.opvanillaplus.block.stonetiles.*;
import net.offllneplayer.opvanillaplus.item.*;

import java.util.function.Supplier;

public class RegistryIBBI {

/*--------------------------------------------------------------------------------------------*/
	/*[Declare Registries]*/

	public static final DeferredRegister.Items ITEMSREGISTRY = DeferredRegister.createItems(OPVanillaPlus.Mod_ID);

	public static final DeferredRegister.Blocks BLOCKSREGISTRY = DeferredRegister.createBlocks(OPVanillaPlus.Mod_ID);
	public static final DeferredRegister.Blocks FR_BLOCKSREGISTRY = DeferredRegister.createBlocks(OPVanillaPlus.Mod_ID);
	public static final DeferredRegister.Blocks FR_EPIC_BLOCKSREGISTRY = DeferredRegister.createBlocks(OPVanillaPlus.Mod_ID);

/*--------------------------------------------------------------------------------------------*/
	/*[Declare Blocks]*/

	public static final DeferredBlock<Block> BLOCK_OF_CHARCOAL = registerBlock("block_of_charcoal", BlockofCharcoalBlock::new);

	public static final DeferredBlock<Block> BLOCK_OF_CRYING_INGOTS = registerBlock("block_of_crying_ingots", BlockofCryingIngotsBlock::new);
	public static final DeferredBlock<Block> CRYING_ESSENCE = registerBlock("crying_essence", CryingEssenceBlock::new);

	public static final DeferredBlock<Block> CHISELED_DIAMOND = registerBlock("chiseled_diamond", ChiseledDiamondBlock::new);
	public static final DeferredBlock<Block> CHISELED_GOLD = registerBlock("chiseled_gold", ChiseledGoldBlock::new);
	public static final DeferredBlock<Block> CHISELED_IRON = registerBlock("chiseled_iron", ChiseledIronBlock::new);

	public static final DeferredBlock<Block> DENSE_STONE = registerBlock("dense_stone", DenseStoneBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BUTTON = registerBlock("dense_stone_button", DenseStoneButtonBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_FENCE = registerBlock("dense_stone_fence", DenseStoneFenceBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_FENCE_GATE = registerBlock("dense_stone_fence_gate", DenseStoneFenceGateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_PRESSURE_PLATE = registerBlock("dense_stone_pressure_plate", DenseStonePressurePlateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_SLAB = registerBlock("dense_stone_slab", DenseStoneSlabBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_STAIRS = registerBlock("dense_stone_stairs", DenseStoneStairsBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TRAPDOOR = registerBlock("dense_stone_trapdoor", DenseStoneTrapdoorBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_WALL = registerBlock("dense_stone_wall",  DenseStoneWallBlock::new);

	public static final DeferredBlock<Block> DENSE_STONE_BRICKS = registerBlock("dense_stone_bricks", DenseStoneBricksBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_BUTTON = registerBlock("dense_stone_brick_button", DenseStoneBrickButtonBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_FENCE = registerBlock("dense_stone_brick_fence", DenseStoneBrickFenceBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_FENCE_GATE = registerBlock("dense_stone_brick_fence_gate", DenseStoneBrickFenceGateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_PRESSURE_PLATE = registerBlock("dense_stone_brick_pressure_plate", DenseStoneBrickPressurePlateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_SLAB = registerBlock("dense_stone_brick_slab", DenseStoneBrickSlabBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_STAIRS = registerBlock("dense_stone_brick_stairs", DenseStoneBrickStairsBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_TRAPDOOR = registerBlock("dense_stone_brick_trapdoor", DenseStoneBrickTrapdoorBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_BRICK_WALL = registerBlock("dense_stone_brick_wall", DenseStoneBrickWallBlock::new);

	public static final DeferredBlock<Block> DENSE_STONE_TILES = registerBlock("dense_stone_tiles", DenseStoneTilesBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_BUTTON = registerBlock("dense_stone_tile_button", DenseStoneTileButtonBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_FENCE = registerBlock("dense_stone_tile_fence", DenseStoneTileFenceBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_FENCE_GATE = registerBlock("dense_stone_tile_fence_gate", DenseStoneTileFenceGateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_PRESSURE_PLATE = registerBlock("dense_stone_tile_pressure_plate", DenseStoneTilePressurePlateBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_SLAB = registerBlock("dense_stone_tile_slab", DenseStoneTileSlabBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_STAIRS = registerBlock("dense_stone_tile_stairs", DenseStoneTileStairsBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_TRAPDOOR = registerBlock("dense_stone_tile_trapdoor", DenseStoneTileTrapdoorBlock::new);
	public static final DeferredBlock<Block> DENSE_STONE_TILE_WALL = registerBlock("dense_stone_tile_wall", DenseStoneTileWallBlock::new);

	public static final DeferredBlock<Block> COPPER_FURNACE = registerBlock("copper_furnace", CopperFurnaceBlock::new);
	public static final DeferredBlock<Block> DIAMOND_FURNACE = registerBlock("diamond_furnace", DiamondFurnaceBlock::new);
	public static final DeferredBlock<Block> GOLD_FURNACE = registerBlock("gold_furnace", GoldFurnaceBlock::new);
	public static final DeferredBlock<Block> IRON_FURNACE = registerBlock("iron_furnace", IronFurnaceBlock::new);

	public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles", StoneTilesBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_BUTTON = registerBlock("stone_tile_button", StoneTileButtonBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_FENCE = registerBlock("stone_tile_fence", StoneTileFenceBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_FENCE_GATE = registerBlock("stone_tile_fence_gate", StoneTileFenceGateBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_PRESSURE_PLATE = registerBlock("stone_tile_pressure_plate", StoneTilePressurePlateBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab", StoneTileSlabBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs", StoneTileStairsBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_TRAPDOOR = registerBlock("stone_tile_trapdoor", StoneTileTrapdoorBlock::new);
	public static final DeferredBlock<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall", StoneTileWallBlock::new);

	public static final DeferredBlock<Block> CHISELED_NETHERITE = registerFRBlock("chiseled_netherite", ChiseledNetheriteBlock::new);
	public static final DeferredBlock<Block> NETHERITE_FURNACE = registerFRBlock("netherite_furnace", NetheriteFurnaceBlock::new);


	// public static final DeferredBlock<Block> BLOCK_OF_CRYING_INGOTS = registerFREpicBlock("block_of_crying_ingots", BlockofCryingIngotsBlock::new);

/*--------------------------------------------------------------------------------------------*/
	/*[Register Items]*/

	public static final DeferredItem<Item> CHISEL = ITEMSREGISTRY.register("chisel", ChiselItem::new);

	public static final DeferredItem<Item> CRYING_ESSENCE_BUCKET = ITEMSREGISTRY.register("crying_essence_bucket", CryingEssenceItem::new);
	public static final DeferredItem<Item> CRYING_INGOT = ITEMSREGISTRY.register("crying_ingot", CryingIngotItem::new);
	public static final DeferredItem<Item> CRYING_SMITHING_TEMPLATE = ITEMSREGISTRY.register("crying_smithing_template", CryingSmithingTemplateItem::new);

	public static final DeferredItem<Item> CRYING_SWORD = ITEMSREGISTRY.register("crying_sword", CryingSwordItem::new);
	public static final DeferredItem<Item> CRYING_AXE = ITEMSREGISTRY.register("crying_axe", CryingAxeItem::new);
	public static final DeferredItem<Item> CRYING_PICKAXE = ITEMSREGISTRY.register("crying_pickaxe", CryingPickaxeItem::new);
	public static final DeferredItem<Item> CRYING_SHOVEL = ITEMSREGISTRY.register("crying_shovel", CryingShovelItem::new);
	public static final DeferredItem<Item> CRYING_SICKLE = ITEMSREGISTRY.register("crying_sickle", CryingSickleItem::new);

	public static final DeferredItem<Item> CRYING_HELMET = ITEMSREGISTRY.register("crying_helmet", CryingItem.Helmet::new);
	public static final DeferredItem<Item> CRYING_CHESTPLATE = ITEMSREGISTRY.register("crying_chestplate", CryingItem.Chestplate::new);
	public static final DeferredItem<Item> CRYING_LEGGINGS = ITEMSREGISTRY.register("crying_leggings", CryingItem.Leggings::new);
	public static final DeferredItem<Item> CRYING_BOOTS = ITEMSREGISTRY.register("crying_boots", CryingItem.Boots::new);

	public static final DeferredItem<DynamiteStickItem> DYNAMITE_STICK = ITEMSREGISTRY.register("dynamite_stick", DynamiteStickItem::new);

/*--------------------------------------------------------------------------------------------*/
	/*[Register Blocks]*/

	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKSREGISTRY.register(name, block);
		registerBlockItem(name, toReturn); return toReturn;
	}

	private static <T extends Block> DeferredBlock<T> registerFRBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = FR_BLOCKSREGISTRY.register(name, block);
		registerFRBlockItem(name, toReturn); return toReturn;
	}

	private static <T extends Block> DeferredBlock<T> registerFREpicBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = FR_EPIC_BLOCKSREGISTRY.register(name, block);
		registerFREpicBlockItem(name, toReturn); return toReturn;
	}

/*--------------------------------------------------------------------------------------------*/
	/*[Register BlockItems]*/

	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		ITEMSREGISTRY.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().stacksTo(64)));
	}

	private static <T extends Block> void registerFRBlockItem(String name, DeferredBlock<T> block) {
		ITEMSREGISTRY.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().stacksTo(64).fireResistant()));
	}

	private static <T extends Block> void registerFREpicBlockItem(String name, DeferredBlock<T> block) {
		ITEMSREGISTRY.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC)));
	}

/*--------------------------------------------------------------------------------------------*/
	/*[Register EventBus]*/

	public static void registerItems(IEventBus eventBus) {
		ITEMSREGISTRY.register(eventBus);
	}

	public static void registerBlocks(IEventBus eventBus) {
		BLOCKSREGISTRY.register(eventBus);
	}
	public static void registerFRBlocks(IEventBus eventBus) {
		FR_BLOCKSREGISTRY.register(eventBus);
	}
	public static void registerFREpicBlocks(IEventBus eventBus) {
		FR_EPIC_BLOCKSREGISTRY.register(eventBus);
	}

}
