package com.github.timepsilon.wota.common.item.tarot;

import com.github.timepsilon.wota.client.screen.TomeOfArkanaMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TomeOfArkanaItem extends Item {
    public TomeOfArkanaItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack item = player.getItemInHand(interactionHand);
        return showBook(level, item);
    }

    private InteractionResultHolder<ItemStack> showBook(Level level, ItemStack item) {
        if (!level.isClientSide) return InteractionResultHolder.fail(item);

        Minecraft.getInstance().setScreen(new TomeOfArkanaMenu(Component.literal("test")));
        return InteractionResultHolder.success(item);
    }
}
