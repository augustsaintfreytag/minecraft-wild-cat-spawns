package net.saint.wild_cat_spawns.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "wild_cat_spawns")
public class WildCatSpawnsConfig implements ConfigData {
    @Comment("Enables cat spawns in the wild. Default: true")
    public boolean enableCatSpawns = true;
}