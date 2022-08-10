package ca.gauntlet.entity;

import lombok.Getter;
import net.runelite.api.NPC;

public class Tornado {
    private static final int TICK_DURATION = 21;

    @Getter
    private int timeUntilDespawn = TICK_DURATION;

    @Getter
    private NPC npc = null;

    public Tornado(NPC npc)
    {
        this.npc = npc;
    }

    public void updateTimeUntilDespawn()
    {
        if (timeUntilDespawn >= 0) {
            --timeUntilDespawn;
        }
    }
}
