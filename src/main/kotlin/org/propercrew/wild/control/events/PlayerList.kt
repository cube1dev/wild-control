package org.propercrew.wild.control.events

import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerChangedWorldEvent
import org.bukkit.event.player.PlayerJoinEvent

class PlayerList : Listener {

    @EventHandler
    fun join(event: PlayerJoinEvent) {
        worldIndicator(event.player)
    }

    @EventHandler
    fun changeWorld(event: PlayerChangedWorldEvent) {
        worldIndicator(event.player)
    }

    private fun worldIndicator(player: Player) {
        when (player.world.name) {
            "world_nether" -> {
                player.setPlayerListName("[${ChatColor.RED}${ChatColor.BOLD} N ${ChatColor.RESET}] ${player.name}")
            }

            "world_the_end" -> {
                player.setPlayerListName("[${ChatColor.DARK_PURPLE}${ChatColor.BOLD} E ${ChatColor.RESET}] ${player.name}")
            }

            else -> {
                player.setPlayerListName("[${ChatColor.GREEN}${ChatColor.BOLD} O ${ChatColor.RESET}] ${player.name}")
            }
        }
    }

}