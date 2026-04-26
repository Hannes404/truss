package com.truss.block;

import com.truss.Truss;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TRUSS_BLOCK = registerBlock(
            new Block(AbstractBlock.Settings.create().strength(0.5F)
                    .requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque()));

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, Identifier.of(Truss.MOD_ID, "truss_block"), block);
    }

    private static void registerBlockItem(Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Truss.MOD_ID, "truss_block"),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Truss.LOGGER.info("Registering ModBlocks for " + Truss.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
        //    entries.add(ModBlocks.TRUSS_BLOCK);
        //});
    }
}
