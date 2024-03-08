package net.imustend.imustmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.imustend.imustmod.Imustmod;
import net.imustend.imustmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TymonGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Imustmod.MOD_ID, "imustmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.imustmod"))
                    .icon(() -> new ItemStack(ModItems.TYMONIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TYMONIUM);
                        entries.add(ModBlocks.TYMONIUM_BLOCK);
                        entries.add(ModItems.RAW_TYMONIUM);
                        entries.add(ModBlocks.RAW_TYMONIUM_BLOCK);

                    }).build());
    public static void registerItemGroups() {
        Imustmod.LOGGER.info("Registering item groups for " + Imustmod.MOD_ID);
    }
}