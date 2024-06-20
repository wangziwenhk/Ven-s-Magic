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
	private const val MOD_ID = "vens-magic"
	private const val MOD_NAME = "Vens Magic"

	private val logger = LoggerFactory.getLogger(MOD_ID)

	private val MAGIC_GROUP : ItemGroup = FabricItemGroup.builder()
		.icon{ItemStack(ModItem.MAGIC_DIAMOND)}
		.displayName(Text.translatable("itemGroup.vens-magic.vens-magic"))
		.entries{context,entries->entries.add(ModItem.MAGIC_DIAMOND)}
		.build()

	override fun onInitialize() {
		logger.info("$MOD_NAME Start")
		Registry.register(Registries.ITEM_GROUP, Identifier.of("tutorial", "test_group"), MAGIC_GROUP)
		ModItem.registerItem()
	}
}