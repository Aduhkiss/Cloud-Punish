package cc.leafed.cloudpunish.gui;

import cc.leafed.cloudpunish.util.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MainGui {
    public static Inventory main(Player caller, OfflinePlayer player ) {
        Inventory inv = Bukkit.createInventory(null, (9 * 3), "Punishment: " + player.getName());

        if(caller.hasPermission("cc.admin")) {
            inv.setItem(10, ItemUtil.nameItem(Material.BOOK, "§eView History"));
            inv.setItem(12, ItemUtil.nameItem(Material.IRON_AXE, "§eAdd Punishment"));
            inv.setItem(14, ItemUtil.nameItem(Material.NAME_TAG, "§eView Alt Accounts"));
            inv.setItem(16, ItemUtil.nameItem(Material.END_CRYSTAL, "§eAdmin Utilities"));
        } else {
            inv.setItem(11, ItemUtil.nameItem(Material.BOOK, "§eView History"));
            inv.setItem(13, ItemUtil.nameItem(Material.IRON_AXE, "§eAdd Punishment"));
            inv.setItem(15, ItemUtil.nameItem(Material.NAME_TAG, "§eView Alt Accounts"));
        }

        return inv;
    }
}
