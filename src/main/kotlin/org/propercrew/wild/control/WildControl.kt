package org.propercrew.wild.control

import org.bukkit.plugin.java.JavaPlugin
import org.propercrew.wild.control.events.PlayerList

class WildControl : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerList(), this)
    }
}