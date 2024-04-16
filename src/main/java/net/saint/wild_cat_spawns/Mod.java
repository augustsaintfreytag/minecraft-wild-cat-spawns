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

		if (config.enableCatSpawns) {
			modifyBiomeSpawns();
		}
	}

	private void modifyBiomeSpawns() {
		// Add spawn for `entity.minecraft.cat` to Minecraft plains biome.
		Identifier spawnIdentifier = new Identifier("wild_cat_spawns", "cat_spawns");
		BiomeModifications.create(spawnIdentifier).add(ModificationPhase.ADDITIONS, BiomeSelectors.foundInOverworld(), context -> {
			SpawnGroup spawnGroup = SpawnGroup.CREATURE;
			SpawnEntry spawnEntry = new SpawnEntry(EntityType.CAT, 5, 1, 1);
			
			context.getSpawnSettings().addSpawn(spawnGroup, spawnEntry);
		});
	}
}
