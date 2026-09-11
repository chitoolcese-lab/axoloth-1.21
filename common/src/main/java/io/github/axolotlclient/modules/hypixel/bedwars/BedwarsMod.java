package io.github.axolotlclient.modules.hypixel.bedwars;

import io.github.axolotlclient.AxolotlClientConfig.api.options.OptionCategory;
import io.github.axolotlclient.modules.AbstractModule;

public class BedwarsMod extends AbstractModule {

    private static BedwarsMod instance;

    public static BedwarsMod getInstance() {
        return instance;
    }

    public BedwarsMod() {
        instance = this;
    }

    @Override
    public void init() {
        // Módulo desactivado
    }

    @Override
    public OptionCategory getCategory() {
        return OptionCategory.create("bedwars");
    }

    // Métodos vacíos para que no rompa la compilación
    public boolean inGame() {
        return false;
    }

    public Object getUpgradesOverlay() { return null; }
    public Object getResourceOverlay() { return null; }
    public Object getStatsOverlay() { return null; }
    public Object getSessionStatsOverlay() { return null; }
}
