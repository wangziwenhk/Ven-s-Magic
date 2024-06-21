package com.ven

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory


object VensMagic : ModInitializer {
    const val MOD_ID = "vens-magic"
    const val MOD_NAME = "Vens Magic"

    private val logger = LoggerFactory.getLogger(MOD_ID)

    val MAGIC_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(ModItems.MAGIC_DIAMOND) }
        .displayName(Text.translatable("itemGroup.$MOD_ID.$MOD_ID"))
        .entries { _, entries ->
            entries.add(ModItems.MAGIC_DIAMOND)
        }
        .build()

    override fun onInitialize() {
        logger.info("$MOD_NAME Start")
        //注册物品组
        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, MOD_ID), MAGIC_GROUP)
        //注册物品
        ModItems.registerItem()
    }
}