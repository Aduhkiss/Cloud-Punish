package cc.leafed.cloudpunish.cmd;

import cc.leafed.cloudpunish.gui.MainGui;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PunishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to run this command.");
            return false;
        }
        if(args.length == 0 || args == null) {
            sender.sendMessage(ChatColor.RED + "Usage: /punish <Player>");
            return false;
        }
        OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);
        Player player = (Player) sender;
        player.openInventory(MainGui.main((Player) sender, target));
        return true;
    }
}
