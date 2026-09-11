/*
 * Copyright (c) 2026 AxolotlClient contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

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
