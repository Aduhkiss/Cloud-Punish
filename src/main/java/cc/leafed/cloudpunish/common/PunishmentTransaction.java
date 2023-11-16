package cc.leafed.cloudpunish.common;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PunishmentTransaction {

    private Player caller;
    private OfflinePlayer target;
    private String reason;
    private String cmd;
    private String time;

    public PunishmentTransaction(Player caller, OfflinePlayer target) {
        this.caller = caller;
        this.target = target;
    }

    public void setReason(String r) {
        this.reason = r;
    }
    public void setCmd(String c) {
        this.cmd = c;
    }
    public void setTime(String t) {
        this.time = t;
    }

    public Player getCaller() {
        return caller;
    }
    public OfflinePlayer getTarget() {
        return target;
    }
    public String getReason() {
        return reason;
    }
    public String getCmd() {
        return cmd;
    }
    public String getTime() {
        return time;
    }
}
