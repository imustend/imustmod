package net.imustend.imustmod;

import net.fabricmc.api.ModInitializer;

import net.imustend.imustmod.item.ModItemGroups;
import net.imustend.imustmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Imustmod implements ModInitializer {
	public static final String MOD_ID = "imustmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}