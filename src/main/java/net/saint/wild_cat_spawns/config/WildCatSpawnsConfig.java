package net.saint.wild_cat_spawns.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "wild_cat_spawns")
public class WildCatSpawnsConfig implements ConfigData {
    @Comment("Enables cat spawns in the wild. Default: true")
    public boolean enableCatSpawns = true;

	@Comment("The weight of cat spawns. Default: 4")
	public int catSpawnWeight = 4;

	@Comment("The minimum number of cats that can spawn. Default: 1")
	public int catSpawnMinGroupSize = 1;

	@Comment("The maximum number of cats that can spawn. Default: 1")
	public int catSpawnMaxGroupSize = 1;
}