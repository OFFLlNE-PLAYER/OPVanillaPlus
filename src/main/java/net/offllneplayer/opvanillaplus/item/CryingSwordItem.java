
package net.offllneplayer.opvanillaplus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import net.offllneplayer.opvanillaplus.init.RegistryIBBI;

/*
import net.offllneplayer.opvanillaplus.method.crying.PROCApplyCryingIIProcedure;
*/

public class CryingSwordItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1420;
		}

		@Override
		public float getSpeed() {
			return 7f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 20;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(RegistryIBBI.CRYING_INGOT.get()));
		}
	};

	public CryingSwordItem() {
		super(TOOL_TIER, new Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 7.5f, -2.58f)).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);

		/*
		PROCApplyCryingIIProcedure.execute(entity);
		*/

		return retval;
	}
}
