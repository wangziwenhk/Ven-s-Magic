package com.ven

import com.ven.dataGenerator.ChineseLangProvider
import com.ven.dataGenerator.EnglishLangProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.registry.RegistryWrapper
import java.util.concurrent.CompletableFuture

object VensMagicDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack:FabricDataGenerator.Pack = fabricDataGenerator.createPack()
		val registryLookupFuture: CompletableFuture<RegistryWrapper.WrapperLookup> = fabricDataGenerator.registries
		pack.addProvider { dataOutput:FabricDataOutput -> EnglishLangProvider(dataOutput, registryLookupFuture) }
		pack.addProvider { dataOutput:FabricDataOutput -> ChineseLangProvider(dataOutput, registryLookupFuture) }
	}
}