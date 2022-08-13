package net.iqrx.gemarmor;

import net.fabricmc.api.ModInitializer;
import net.iqrx.gemarmor.block.ModBlocks;
import net.iqrx.gemarmor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemArmor implements ModInitializer {
	public static final String MOD_ID = "gemarmor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
