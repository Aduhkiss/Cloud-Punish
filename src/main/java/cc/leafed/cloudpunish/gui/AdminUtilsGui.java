package cc.leafed.cloudpunish.gui;

import cc.leafed.cloudpunish.util.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AdminUtilsGui {
    public static Inventory main(Player caller, OfflinePlayer player) {
        Inventory inv = Bukkit.createInventory(null, (9 * 3), "Admin Utils: " + player.getName());

        inv.setItem(10, ItemUtil.nameItem(Material.TNT, "§ePurge History"));
        inv.setItem(12, ItemUtil.nameItem(Material.GOLDEN_AXE, "§eStaff Rollback (1 Week)"));
        inv.setItem(14, ItemUtil.nameItem(Material.WRITABLE_BOOK, "§eIP History"));
        inv.setItem(16, ItemUtil.nameItem(Material.NETHER_STAR, "§eCheck GEO Location"));

        return inv;
    }
}
