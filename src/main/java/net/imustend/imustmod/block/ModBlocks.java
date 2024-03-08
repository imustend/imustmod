package net.imustend.imustmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.imustend.imustmod.Imustmod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TYMONIUM_BLOCK = registerBlock("tymonium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_TYMONIUM_BLOCK = registerBlock("raw_tymonium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Imustmod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Imustmod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Imustmod.LOGGER.info("Registering ModBlocks for " + Imustmod.MOD_ID);
    }
}
