package com.truss.item;

import com.truss.Truss;
import com.truss.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup TRUSS_BUILDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Truss.MOD_ID, "truss_builds"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TRUSS_BLOCK))
                    .displayName(Text.translatable("itemgroup.truss.truss_builds"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TRUSS_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Truss.LOGGER.info("Registering ModItemGroups for " + Truss.MOD_ID);
    }
}
