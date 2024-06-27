package ven.vens_magic.item.mineral

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.particle.ParticleTypes
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class MagicDiamond(settings: Settings): Item(settings){
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        if(world==null)return super.use(null, user, hand)

        val playerPos = user!!.pos
        val particlePos = playerPos.add(user.world.random.nextDouble() - 0.5, 1.0, user.world.random.nextDouble() - 0.5)
        world.addParticle(ParticleTypes.HAPPY_VILLAGER, particlePos.x, particlePos.y, particlePos.z, 0.0, 0.0, 0.0)
        return super.use(world, user, hand)
    }
}