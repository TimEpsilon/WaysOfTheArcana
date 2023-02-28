package com.github.timepsilon.wota.client.screen;

import com.github.timepsilon.wota.WaysOfTheArcana;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class TomeOfArkanaMenu extends Screen {

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(WaysOfTheArcana.MOD_ID, "textures/gui/tome_of_arkana_background.png");



    public TomeOfArkanaMenu(Component component) {
        super(component);
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        RenderSystem.setShaderTexture(0, BACKGROUND_TEXTURE);
        blit(matrixStack, 0, 0, 0, 0, width, height, width, height);

        super.render(matrixStack, mouseX, mouseY, partialTicks);

    }
}
