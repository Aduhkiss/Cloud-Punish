package cc.leafed.cloudpunish.listener;

import cc.leafed.cloudpunish.common.PunishmentTransaction;
import cc.leafed.cloudpunish.gui.AdminUtilsGui;
import cc.leafed.cloudpunish.gui.FinalizePunishmentGui;
import cc.leafed.cloudpunish.gui.SelectPunishmentTypeGui;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerTakeLecternBookEvent;

import java.util.HashMap;

public class MainHandler implements Listener {

    private HashMap<Player, PunishmentTransaction> _Transactions = new HashMap<>();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if(event.getCurrentItem() == null) return;
        Player player = (Player) (Player) event.getWhoClicked();
        if(event.getView().getTitle().contains("Punishment: ")) {

            // Clear any old transaction data from any previous punishments

            int i = event.getView().getTitle().indexOf(":");

            OfflinePlayer target = Bukkit.getOfflinePlayer(event.getView().getTitle().substring(i + 1));

            event.setCancelled(true);
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eView History")) {
                // view history
                event.getWhoClicked().closeInventory();
                Bukkit.dispatchCommand(event.getWhoClicked(), "history " + target.getName());
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eView Alt Accounts")) {
                // view alt accounts
                event.getWhoClicked().closeInventory();
                Bukkit.dispatchCommand(event.getWhoClicked(), "dupeip " + target.getName());
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eAdd Punishment")) {
                // add punishment
                _Transactions.put((Player) event.getWhoClicked(), new PunishmentTransaction((Player) event.getWhoClicked(), target));
                event.getWhoClicked().openInventory(SelectPunishmentTypeGui.main(target));
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eAdmin Utilities")) {
                // add punishment
                event.getWhoClicked().openInventory(AdminUtilsGui.main(player, target));
            }
            //
        }

        if(event.getView().getTitle().contains("Select Punishment For: ")) {
            int i = event.getView().getTitle().indexOf(":");
            OfflinePlayer target = Bukkit.getOfflinePlayer(event.getView().getTitle().substring(i + 1));
            event.setCancelled(true);
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eMalicious Hacks")) {
                _Transactions.get(player).setReason("Malicious Hacks");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lban");
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlacklisted Modifications")) {
                _Transactions.get(player).setReason("Blacklisted Modifications");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lban");
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eMajor Bug Abuse")) {
                _Transactions.get(player).setReason("Major Bug Abuse");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lban");
            }
            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§eMinor Bug Abuse")) {
                _Transactions.get(player).setReason("Minor Bug Abuse");
                _Transactions.get(player).setTime("1d");
                _Transactions.get(player).setCmd("lban");

            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eAlt Claiming")) {
                _Transactions.get(player).setReason("Alt Claiming");
                _Transactions.get(player).setTime("7d");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eInappropriate Name/Skin")) {
                _Transactions.get(player).setReason("Inappropriate Name or Skin. Please Change and appeal.");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eIRL Trading")) {
                _Transactions.get(player).setReason("IRL Trading");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eMute Evasion")) {
                _Transactions.get(player).setReason("Mute Evasion");
                _Transactions.get(player).setTime("1d");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eNoise Pollution")) {
                _Transactions.get(player).setReason("Noise Pollution");
                _Transactions.get(player).setTime("1h");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eXray / Chest ESP (Or Similar)")) {
                _Transactions.get(player).setReason("Xray / Chest ESP (Or Similar)");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eTP-Trapping, Pushing to Death")) {
                _Transactions.get(player).setReason("TP-Trapping, Pushing to Death");
                _Transactions.get(player).setTime("7d");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eTargeting")) {
                _Transactions.get(player).setReason("Targeting");
                _Transactions.get(player).setTime("3h");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§ePearl Glitching or /F Fly Abuse")) {
                _Transactions.get(player).setReason("Pearl Glitching or /F Fly Abuse");
                _Transactions.get(player).setTime("1h");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eIn-Game Trolling")) {
                _Transactions.get(player).setReason("In-Game Trolling");
                _Transactions.get(player).setTime("1h");
                _Transactions.get(player).setCmd("lban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eAdvertising")) {
                _Transactions.get(player).setReason("Advertising");
                _Transactions.get(player).setTime("30d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eLight Advertising")) {
                _Transactions.get(player).setReason("Light Advertising");
                _Transactions.get(player).setTime("1d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eImpersonation")) {
                _Transactions.get(player).setReason("Impersonation");
                _Transactions.get(player).setTime("7d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eInappropriate Discussion")) {
                _Transactions.get(player).setReason("Inappropriate Discussion");
                _Transactions.get(player).setTime("1d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eDiscussing Punishments or rioting")) {
                _Transactions.get(player).setReason("Discussing Punishments or rioting");
                _Transactions.get(player).setTime("7d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eSpamming/Flooding/Excessive Caps or Encouraging Spam")) {
                _Transactions.get(player).setReason("Spamming/Flooding/Excessive Caps or Encouraging Spam");
                _Transactions.get(player).setTime("1d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eUsing languages other than English in public chat")) {
                _Transactions.get(player).setReason("Using languages other than English in public chat");
                _Transactions.get(player).setTime("1h");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eBegging")) {
                _Transactions.get(player).setReason("Begging");
                _Transactions.get(player).setTime("1h");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eDeath Threats")) {
                _Transactions.get(player).setReason("Death Threats");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eBigotry")) {
                _Transactions.get(player).setReason("Bigotry");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§ePlayer Disrespect")) {
                _Transactions.get(player).setReason("Player Disrespect");
                _Transactions.get(player).setTime("3h");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eHarassment or Bullying")) {
                _Transactions.get(player).setReason("Harassment or Bullying");
                _Transactions.get(player).setTime("7d");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eDDoS / Dox / SWATing Threats")) {
                _Transactions.get(player).setReason("DDoS / Dox / SWATing Threats");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("lmute");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eDeath Threats (IP-Ban)")) {
                _Transactions.get(player).setReason("Death Threats (IP-Ban)");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("lipban");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eCharging back a purchase")) {
                _Transactions.get(player).setReason("Charging back a purchase");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("IPBAN");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eBotting")) {
                _Transactions.get(player).setReason("Botting");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("IPBAN");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eCreating Lag intentionaly / Server Crashing")) {
                _Transactions.get(player).setReason("Creating Lag intentionaly / Server Crashing");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("IPBAN");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eAlt Limit")) {
                _Transactions.get(player).setReason("Alt Limit");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("IPBAN");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eBan Evasion")) {
                _Transactions.get(player).setReason("Ban Evasion");
                _Transactions.get(player).setTime("");
                _Transactions.get(player).setCmd("IPBAN");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eCancel Punishment")) {
                _Transactions.remove(player);
                player.closeInventory();
                player.sendMessage(ChatColor.DARK_AQUA + "** VOID TRANSACTION **");
                return;
            }

            // Now that you have keyed all of the information into the transaction data, send them to the finalize punishment screen
            player.openInventory(FinalizePunishmentGui.main(target, player));
        }

        if(event.getView().getTitle().contains("Finalize Punishment: ")) {
            int i = event.getView().getTitle().indexOf(":");
            OfflinePlayer target = Bukkit.getOfflinePlayer(event.getView().getTitle().substring(i + 1));
            event.setCancelled(true);

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eSilent Punishment")) {
                PunishmentTransaction transaction = _Transactions.get(player);
                Bukkit.dispatchCommand(player, transaction.getCmd() + " " + transaction.getTarget().getName() + " " + transaction.getTime() + " " + transaction.getReason() + " -s");
                player.closeInventory();
                _Transactions.remove((Player) event.getWhoClicked());
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eSuper Silent Punishment")) {
                PunishmentTransaction transaction = _Transactions.get(player);
                Bukkit.dispatchCommand(player, transaction.getCmd() + " " + transaction.getTarget().getName() + " " + transaction.getTime() + " " + transaction.getReason() + " -S");
                player.closeInventory();
                _Transactions.remove((Player) event.getWhoClicked());
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§ePublic Punishment")) {
                PunishmentTransaction transaction = _Transactions.get(player);
                Bukkit.dispatchCommand(player, transaction.getCmd() + " " + transaction.getTarget().getName() + " " + transaction.getTime() + " " + transaction.getReason());
                player.closeInventory();
                _Transactions.remove((Player) event.getWhoClicked());
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eCancel Punishment")) {
                _Transactions.remove(player);
                player.closeInventory();
                player.sendMessage(ChatColor.DARK_AQUA + "** VOID TRANSACTION **");
                return;
            }
        }
        if(event.getView().getTitle().contains("Admin Utils: ")) {
            int i = event.getView().getTitle().indexOf(":");
            OfflinePlayer target = Bukkit.getOfflinePlayer(event.getView().getTitle().substring(i + 1));
            event.setCancelled(true);
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§ePurge History")) {
                player.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "prunehistory " + target.getName());
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eStaff Rollback (1 Week)")) {
                player.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "staffrollback " + target.getName() + " 1w");
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eIP History")) {
                player.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iphist " + target.getName());
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eCheck GEO Location")) {
                player.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "geoip " + target.getName());
            }
        }
    }
}
