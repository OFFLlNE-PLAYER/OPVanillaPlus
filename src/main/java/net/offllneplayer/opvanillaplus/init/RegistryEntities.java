package net.offllneplayer.opvanillaplus.init;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.offllneplayer.opvanillaplus.entity.ThrownDynamiteStick;
import net.offllneplayer.opvanillaplus.OPVanillaPlus;

public class RegistryEntities {
    public static final DeferredRegister<EntityType<?>> ENTREGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, OPVanillaPlus.Mod_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<ThrownDynamiteStick>> THROWN_DYNAMITE_STICK = register("thrown_dynamite_stick",
            EntityType.Builder.<ThrownDynamiteStick>of(ThrownDynamiteStick::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10));

    private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return ENTREGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build("registryname"));
    }

    /*--------------------------------------------------------------------------------------------*/
    /*[Register EventBus]*/

    public static void registerentities(IEventBus eventBus) {
        ENTREGISTRY.register(eventBus);
    }

}

