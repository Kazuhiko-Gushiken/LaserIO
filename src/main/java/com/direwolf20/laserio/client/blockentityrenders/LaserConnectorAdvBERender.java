package com.direwolf20.laserio.client.blockentityrenders;

import com.direwolf20.laserio.client.blockentityrenders.baseberender.BaseLaserBERender;
import com.direwolf20.laserio.client.renderer.DelayedRenderer;
import com.direwolf20.laserio.common.blockentities.LaserConnectorAdvBE;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class LaserConnectorAdvBERender extends BaseLaserBERender<LaserConnectorAdvBE> {
    public LaserConnectorAdvBERender(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(LaserConnectorAdvBE blockentity, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int combinedLightsIn, int combinedOverlayIn) {
        if (blockentity.getPartnerBlockPos() != null)
            DelayedRenderer.add(blockentity);
        else
            super.render(blockentity, partialTicks, matrixStackIn, bufferIn, combinedLightsIn, combinedOverlayIn);
    }

}
