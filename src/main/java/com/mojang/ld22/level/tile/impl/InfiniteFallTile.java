package com.mojang.ld22.level.tile.impl;

import com.mojang.ld22.entity.AirWizard;
import com.mojang.ld22.entity.Entity;
import com.mojang.ld22.level.Level;
import com.mojang.ld22.level.tile.Tile;
import com.mojang.ld22.level.tile.TileType;

public class InfiniteFallTile extends Tile {

    public InfiniteFallTile(int id) {
        super(id, TileType.INFINITE_FALL);
    }

    public boolean mayPass(Level level, int x, int y, Entity e) {
        return e instanceof AirWizard;
    }
}
