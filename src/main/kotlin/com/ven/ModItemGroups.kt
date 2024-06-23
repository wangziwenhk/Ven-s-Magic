package com.ven

import com.ven.VensMagic.MOD_ID
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {
    val MAGIC_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(ModItems.MAGIC_DIAMOND) }
        .displayName(Text.translatable("itemGroup.$MOD_ID.$MOD_ID"))
        .entries { _, entries ->
            entries.add(ModItems.MAGIC_DIAMOND)
        }
        .build()
    fun registerItemGroup(){
        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, MOD_ID), MAGIC_GROUP)
    }
}