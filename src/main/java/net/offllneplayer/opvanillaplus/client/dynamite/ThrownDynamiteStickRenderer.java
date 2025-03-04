package net.offllneplayer.opvanillaplus.client.dynamite;

import net.offllneplayer.opvanillaplus.client.ModModelLayers;
import net.offllneplayer.opvanillaplus.entity.ThrownDynamiteStick;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.offllneplayer.opvanillaplus.OPVanillaPlus;

public class ThrownDynamiteStickRenderer extends EntityRenderer<ThrownDynamiteStick> {

    public ThrownDynamiteStickRenderer(EntityRendererProvider.Context context) {
        super(context);
        ThrownDynamiteStickModel model = new ThrownDynamiteStickModel(context.bakeLayer(ModModelLayers.THROWN_DYNAMITE_STICK));
    }

    @Override
    public ResourceLocation getTextureLocation(ThrownDynamiteStick entity) {
        return ResourceLocation.fromNamespaceAndPath(OPVanillaPlus.Mod_ID, "textures/entity/thrown_dynamite_stick.png");
    }
}
