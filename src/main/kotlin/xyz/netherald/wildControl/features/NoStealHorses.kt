package xyz.netherald.wildControl.features

import org.bukkit.entity.EntityType
import org.bukkit.entity.Tameable
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.spigotmc.event.entity.EntityMountEvent

class NoStealHorses : Listener {

    @EventHandler
    fun onPlayerRideOnVechine(event: EntityMountEvent) {
        if(event.entityType == EntityType.PLAYER) {
            if(event.mount is Tameable) {
                val tameable: Tameable = event.mount as Tameable
                if(tameable.isTamed) {
                    if (event.entity.uniqueId != tameable.owner?.uniqueId) {
                        event.isCancelled = true
                    }
                }
            }
        }
    }

}