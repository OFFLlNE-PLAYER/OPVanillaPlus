
package net.offllneplayer.opvanillaplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BucketItem;

import net.offllneplayer.opvanillaplus.init.RegistryFluids;

public class CryingEssenceItem extends BucketItem {
	public CryingEssenceItem() {
		super(RegistryFluids.CRYING_ESSENCE.get(), new Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
