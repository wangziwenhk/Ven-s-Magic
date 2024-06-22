package com.ven.dataGenerator

import com.ven.VensMagic
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture

class EnglishLangProvider(dataOutput: FabricDataOutput, registryLookup: CompletableFuture<WrapperLookup>) :
    FabricLanguageProvider(dataOutput, "en_us", registryLookup) {

    override fun generateTranslations(
        registryLookup: WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        val modId = VensMagic.MOD_ID
        // 添加物品翻译
        translationBuilder.add("item.$modId.magic_diamond", "Magic Diamond")
        translationBuilder.add("itemGroup.$modId.$modId", "Ven's Magic")
        // 添加更多翻译条目
    }
}