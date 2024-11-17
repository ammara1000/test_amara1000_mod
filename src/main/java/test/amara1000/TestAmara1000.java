package test.amara1000;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.amara1000.block.ModBlocks;
import test.amara1000.item.ModItems;

import static test.amara1000.item.ModItems.*;

public class TestAmara1000 implements ModInitializer {
	public static final String MOD_ID = "test_amara1000";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}