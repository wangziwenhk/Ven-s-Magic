package ven.vens_magic

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


object VensMagic : ModInitializer {
    const val MOD_ID = "vens-magic"
    const val MOD_NAME = "Ven's Magic"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("$MOD_NAME Start")
        ModItemGroups.registerItemGroup()
        ModItems.registerItems()
    }
}