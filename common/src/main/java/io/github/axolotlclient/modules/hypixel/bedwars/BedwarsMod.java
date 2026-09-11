package io.github.axolotlclient.modules.hypixel.bedwars;

public class BedwarsMod {

    private static BedwarsMod instance = new BedwarsMod();

    public static BedwarsMod getInstance() {
        return instance;
    }

    public boolean inGame() {
        return false;
    }

    public Object getUpgradesOverlay() {
        return null;
    }

    public Object getResourceOverlay() {
        return null;
    }

    public Object getStatsOverlay() {
        return null;
    }

    public Object getSessionStatsOverlay() {
        return null;
    }
}
