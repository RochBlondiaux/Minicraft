package com.mojang.ld22.level.tile;

import com.mojang.ld22.level.tile.impl.*;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TileType {
    GRASS(GrassTile.class),
    ROCK(RockTile.class),
    WATER(WaterTile.class),
    FLOWER(FlowerTile.class),
    TREE(TreeTile.class),
    DIRT(DirtTile.class),
    SAND(SandTile.class),
    CACTUS(CactusTile.class),
    HOLE(HoleTile.class),
    SAPLING(SaplingTile.class),
    FARMLAND(FarmTile.class),
    WHEAT(WheatTile.class),
    LAVA(LavaTile.class),
    STAIRS(StairsTile.class),
    INFINITE_FALL(InfiniteFallTile.class),
    CLOUD(CloudTile.class),
    HARD_ROCK(HardRockTile.class),
    ORE(OreTile.class),
    CLOUD_CACTUS(CloudCactusTile.class),
    STONE(StoneTile.class)
    ;

    private final Class<? extends Tile> tileClass;
}
