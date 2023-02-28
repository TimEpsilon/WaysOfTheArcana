package com.github.timepsilon.wota.common.item.tarot;

import com.github.timepsilon.wota.WaysOfTheArcana;
import com.github.timepsilon.wota.common.item.tab.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WaysOfTheArcana.MOD_ID);

    public static final RegistryObject<Item> TOME_OF_ARKANA = ITEMS.register("tome_of_arkana",
            () -> new TomeOfArkanaItem(new Item.Properties().tab(CreativeTab.ARCANA_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CARD_FOOL = ITEMS.register("card_fool",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_MAGICIAN = ITEMS.register("card_magician",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_PRIESTESS = ITEMS.register("card_priestess",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_EMPRESS = ITEMS.register("card_empress",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_EMPEROR = ITEMS.register("card_emperor",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_HIEROPHANT = ITEMS.register("card_hierophant",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_LOVERS = ITEMS.register("card_lovers",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_CHARIOT = ITEMS.register("card_chariot",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_STRENGTH = ITEMS.register("card_strength",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_HERMIT = ITEMS.register("card_hermit",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_FORTUNE = ITEMS.register("card_fortune",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_JUSTICE = ITEMS.register("card_justice",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_HANGED = ITEMS.register("card_hanged",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_DEATH = ITEMS.register("card_death",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_TEMPERANCE = ITEMS.register("card_temperance",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_DEVIL = ITEMS.register("card_devil",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_TOWER = ITEMS.register("card_tower",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_STAR = ITEMS.register("card_star",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_MOON = ITEMS.register("card_moon",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_SUN = ITEMS.register("card_sun",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_JUDGEMENT = ITEMS.register("card_judgement",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));
    public static final RegistryObject<Item> CARD_WORLD = ITEMS.register("card_world",
            () -> new Item(new Item.Properties().tab(CreativeTab.ARCANA_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
