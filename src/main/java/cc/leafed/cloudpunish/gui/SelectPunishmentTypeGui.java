package cc.leafed.cloudpunish.gui;

import cc.leafed.cloudpunish.util.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.Inventory;

public class SelectPunishmentTypeGui {
    public static Inventory main(OfflinePlayer player) {
        Inventory inv = Bukkit.createInventory(null, (9 * 6), "Select Punishment For: " + player.getName());

        /*
        inv.setItem(0, ItemUtil.nameItem(Material.CHEST, "§eBan"));
        inv.setItem(0, ItemUtil.nameItem(Material.OAK_SIGN, "§eMute"));
        inv.setItem(0, ItemUtil.nameItem(Material.ENDER_CHEST, "§eIP-Ban"));
        inv.setItem(0, ItemUtil.nameItem(Material.PAPER, "§eWarning"));
        */

        inv.setItem(0, ItemUtil.nameItem(Material.CHEST, "§eMalicious Hacks"));
        inv.setItem(1, ItemUtil.nameItem(Material.CHEST, "§eBlacklisted Modifications"));
        inv.setItem(2, ItemUtil.nameItem(Material.CHEST, "§eBug Abuse"));
        inv.setItem(3, ItemUtil.nameItem(Material.CHEST, "§eMinor Bug Abuse"));
        inv.setItem(4, ItemUtil.nameItem(Material.CHEST, "§eAlt Claiming"));
        inv.setItem(5, ItemUtil.nameItem(Material.CHEST, "§eInappropriate Name/Skin"));
        inv.setItem(6, ItemUtil.nameItem(Material.CHEST, "§eIRL Trading"));
        inv.setItem(7, ItemUtil.nameItem(Material.CHEST, "§eMute Evasion"));
        inv.setItem(8, ItemUtil.nameItem(Material.CHEST, "§eNoise Pollution"));
        inv.setItem(9, ItemUtil.nameItem(Material.CHEST, "§eXray / Chest ESP (Or Similar)"));
        inv.setItem(10, ItemUtil.nameItem(Material.CHEST, "§eTP-Trapping, Pushing to Death"));
        inv.setItem(11, ItemUtil.nameItem(Material.CHEST, "§eTargeting"));
        inv.setItem(12, ItemUtil.nameItem(Material.CHEST, "§ePearl Glitching or /F Fly Abuse"));
        inv.setItem(13, ItemUtil.nameItem(Material.CHEST, "§eIn-Game Trolling"));
        inv.setItem(14, ItemUtil.nameItem(Material.OAK_SIGN, "§eAdvertising"));
        inv.setItem(15, ItemUtil.nameItem(Material.PAPER, "§eLight Advertising"));
        inv.setItem(16, ItemUtil.nameItem(Material.OAK_SIGN, "§eImpersonation"));
        inv.setItem(17, ItemUtil.nameItem(Material.OAK_SIGN, "§eInappropriate Discussion"));
        inv.setItem(18, ItemUtil.nameItem(Material.OAK_SIGN, "§eDiscussing Punishments or rioting"));
        inv.setItem(19, ItemUtil.nameItem(Material.OAK_SIGN, "§eSpamming/Flooding/Excessive Caps or Encoraging Spam"));
        inv.setItem(20, ItemUtil.nameItem(Material.OAK_SIGN, "§eUsing languages other than english in public chat"));
        inv.setItem(21, ItemUtil.nameItem(Material.OAK_SIGN, "§eBegging"));
        inv.setItem(22, ItemUtil.nameItem(Material.OAK_SIGN, "§eDeath Threats"));
        inv.setItem(23, ItemUtil.nameItem(Material.OAK_SIGN, "§eBigotry"));
        inv.setItem(24, ItemUtil.nameItem(Material.OAK_SIGN, "§ePlayer Disrespect"));
        inv.setItem(25, ItemUtil.nameItem(Material.OAK_SIGN, "§eHarassment or Bullying"));
        inv.setItem(26, ItemUtil.nameItem(Material.ENDER_CHEST, "§eDDoS / Dox / SWATing Threats"));
        inv.setItem(27, ItemUtil.nameItem(Material.ENDER_CHEST, "§eDeath Threats (IP-Ban)"));
        inv.setItem(28, ItemUtil.nameItem(Material.ENDER_CHEST, "§eCharging back a purchase"));
        inv.setItem(29, ItemUtil.nameItem(Material.ENDER_CHEST, "§eBotting"));
        inv.setItem(30, ItemUtil.nameItem(Material.ENDER_CHEST, "§eCreating Lag intentionaly / Server Crashing"));
        inv.setItem(31, ItemUtil.nameItem(Material.ENDER_CHEST, "§eAlt Limit"));
        inv.setItem(32, ItemUtil.nameItem(Material.ENDER_CHEST, "§eBan Evasion"));
//        inv.setItem(33, ItemUtil.nameItem(Material.ENDER_CHEST, "§e"));
//        inv.setItem(34, ItemUtil.nameItem(Material.ENDER_CHEST, "§e"));
//        inv.setItem(35, ItemUtil.nameItem(Material.ENDER_CHEST, "§e"));
//        inv.setItem(36, ItemUtil.nameItem(Material.ENDER_CHEST, "§e"));

        inv.setItem(49, ItemUtil.nameItem(Material.REDSTONE_BLOCK, "§eCancel Punishment"));

        // 49 - back
        // 53 - forward one page
        // 45 - backward one page
        return inv;
    }
}
