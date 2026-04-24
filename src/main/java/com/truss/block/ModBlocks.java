package com.truss.block;

import com.truss.Truss;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TRUSS_BLOCK = registerBlock("truss_block",
            new Block(AbstractBlock.Settings.create().strength(0.1F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Truss.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Truss.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Truss.LOGGER.info("Registering ModBlocks for " + Truss.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
        //    entries.add(ModBlocks.TRUSS_BLOCK);
        //});
    }
}
