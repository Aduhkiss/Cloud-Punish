package cc.leafed.cloudpunish;

import cc.leafed.cloudpunish.cmd.PunishCommand;
import cc.leafed.cloudpunish.listener.MainHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CloudPunish extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("punish").setExecutor(new PunishCommand());

        Bukkit.getPluginManager().registerEvents(new MainHandler(), this);

        Bukkit.getLogger().info("Successfully loaded The Cloudy Co Punishment Menu");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
