package br.com.eterniaserver.eterniamarriage.generics;

import br.com.eterniaserver.eterniamarriage.objects.MarryId;
import br.com.eterniaserver.eterniamarriage.objects.PlayerMarry;
import br.com.eterniaserver.eterniamarriage.objects.PlayerMarryPropose;
import br.com.eterniaserver.eterniamarriage.objects.PlayerTeleport;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Vars {

    private Vars() {
        throw new IllegalStateException("Utility class");
    }

    protected static int marryIdList;

    protected static final Map<UUID, Long> userKiss = new HashMap<>();

    protected static final Map<Integer, Boolean> marryOnline = new HashMap<>();
    protected static final Map<Player, PlayerTeleport> teleports = new HashMap<>();
    protected static final Map<String, Integer> proposesId = new HashMap<>();

    protected static final Map<Integer, PlayerMarryPropose> marryProposes = new HashMap<>();
    protected static final Map<Integer, MarryId> marrieds = new HashMap<>();
    protected static final Map<UUID, PlayerMarry> marriedUsers = new HashMap<>();

}
