package br.com.eterniaserver.eterniamarriage.generic;

import br.com.eterniaserver.eterniamarriage.EterniaMarriage;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerTeleport {

    private final Player player;
    private final Location firstLocation;
    private final Location wantLocation;
    private final String message;
    private int cooldown;

    public PlayerTeleport(Player player, Location wantLocation, String message) {
        this.player = player;
        this.firstLocation = player.getLocation();
        this.wantLocation = wantLocation;
        this.message = message;
        this.cooldown = EterniaMarriage.serverConfig.getInt("server.cooldown");
    }

    public boolean hasMoved() {
        if (firstLocation.getWorld() != player.getLocation().getWorld()) return true;
        return firstLocation.distanceSquared(player.getLocation()) != 0;
    }

    public int getCountdown() {
        return cooldown;
    }

    public void decreaseCountdown() {
        cooldown -= 1;
    }

    public Location getWantLocation() {
        return wantLocation;
    }

    public String getMessage() {
        return message;
    }

}
