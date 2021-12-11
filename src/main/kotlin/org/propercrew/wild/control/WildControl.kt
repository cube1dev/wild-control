package org.propercrew.wild.control

import org.bukkit.plugin.java.JavaPlugin
import org.propercrew.wild.control.events.PlayerList

class WildControl : JavaPlugin() {

    override fun onEnable() {
        instance = this
        server.pluginManager.apply {
            registerEvents(PlayerList(), this@WildControl)
        }
    }

    companion object {
        lateinit var instance: WildControl
    }
}