package net.imustend.imustmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.imustend.imustmod.Imustmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TYMONIUM = registerItem("tymonium", new Item(new FabricItemSettings()));
    public static final Item RAW_TYMONIUM = registerItem("raw_tymonium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TYMONIUM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Imustmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Imustmod.LOGGER.info("Registering Mod Items for " + Imustmod.MOD_ID);
    }
}
