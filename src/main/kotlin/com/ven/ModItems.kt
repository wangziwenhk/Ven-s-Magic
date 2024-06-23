package com.ven

import com.ven.item.mineral.MagicDiamond
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    val MAGIC_DIAMOND: MagicDiamond = MagicDiamond(Item.Settings())
    fun registerItems(){
        Registry.register(Registries.ITEM, Identifier.of(VensMagic.MOD_ID,"magic_diamond"), MAGIC_DIAMOND)
    }
}