package com.ven

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItem: ModInitializer {
    val MAGIC_DIAMOND: Item = Item(Item.Settings())
    fun registerItem(){
        Registry.register(Registries.ITEM, Identifier.of("vens-magic","magic_diamond"), MAGIC_DIAMOND)
    }

    override fun onInitialize() {}
}