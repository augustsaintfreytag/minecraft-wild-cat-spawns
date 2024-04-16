package net.saint.wild_cat_spawns;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.saint.wild_cat_spawns.config.WildCatSpawnsConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.SpawnSettings.SpawnEntry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("wild_cat_spawns");

	public static WildCatSpawnsConfig config;

	@Override
	public void onInitialize() {
		AutoConfig.register(WildCatSpawnsConfig.class, JanksonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(WildCatSpawnsConfig.class).getConfig();
	}
}
