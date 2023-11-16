package cc.leafed.cloudpunish.gui;

import cc.leafed.cloudpunish.util.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class FinalizePunishmentGui {
    public static Inventory main(OfflinePlayer player, Player caller) {
        Inventory inv = Bukkit.createInventory(null, (9 * 4), "Finalize Punishment: " + player.getName());

        inv.setItem(11, ItemUtil.nameItem(Material.GRAY_WOOL, "§eSilent Punishment")); // silent punishment
        inv.setItem(15, ItemUtil.nameItem(Material.ORANGE_WOOL, "§ePublic Punishment")); // public punishment

        if(caller.hasPermission("cc.mgmt")) {
            inv.setItem(13, ItemUtil.nameItem(Material.RED_WOOL, "§eSuper Silent Punishment")); // super silent punishment
        }

        inv.setItem(31, ItemUtil.nameItem(Material.REDSTONE_BLOCK, "§eCancel Punishment")); // void transaction

        return inv;
    }
}
