package xyz.netherald.wildControl

import org.bukkit.plugin.java.JavaPlugin
import xyz.netherald.wildControl.features.NoStealHorses
import xyz.netherald.wildControl.features.WorldInPlayerList

class WildControl : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(NoStealHorses(), this)
        server.pluginManager.registerEvents(WorldInPlayerList(), this)

    }

}