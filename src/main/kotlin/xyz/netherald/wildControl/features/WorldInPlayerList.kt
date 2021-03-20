package xyz.netherald.wildControl.features

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerChangedWorldEvent
import org.bukkit.event.player.PlayerJoinEvent

class WorldInPlayerList : Listener {

    @EventHandler
    fun join(event: PlayerJoinEvent) {
        when(event.player.world.name) {
            "world" -> {
                event.player.setPlayerListName("${ChatColor.GREEN}${ChatColor.BOLD}O ${ChatColor.RESET}${event.player.name}")
            }
            "world_nether" -> {
                event.player.setPlayerListName("${ChatColor.RED}${ChatColor.BOLD}N ${ChatColor.RESET}${event.player.name}")
            }
            "world_the_end" -> {
                event.player.setPlayerListName("${ChatColor.DARK_PURPLE}${ChatColor.BOLD}E ${ChatColor.RESET}${event.player.name}")
            }
        }
    }

    fun changeWorld(event: PlayerChangedWorldEvent) {
        when(event.player.world.name) {
            "world" -> {
                event.player.setPlayerListName("${ChatColor.GREEN}${ChatColor.BOLD}O ${ChatColor.RESET}${event.player.name}")
            }
            "world_nether" -> {
                event.player.setPlayerListName("${ChatColor.RED}${ChatColor.BOLD}N ${ChatColor.RESET}${event.player.name}")
            }
            "world_the_end" -> {
                event.player.setPlayerListName("${ChatColor.DARK_PURPLE}${ChatColor.BOLD}E ${ChatColor.RESET}${event.player.name}")
            }
        }
    }

}