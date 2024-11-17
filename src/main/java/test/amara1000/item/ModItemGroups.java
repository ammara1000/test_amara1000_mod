package test.amara1000.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import test.amara1000.TestAmara1000;
import test.amara1000.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup LOL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestAmara1000.MOD_ID,"lol_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.LOL))
                    .displayName(Text.translatable("itemgroup.test_amara1000.lol_items"))
                    .entries((displayContext, entries) -> {
                       entries.add(ModItems.LOL);
                        entries.add(ModItems.SWAPPER);
                    }).build());
    public static final ItemGroup LOL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestAmara1000.MOD_ID,"lol_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.LOL_BLOCK))
                    .displayName(Text.translatable("itemgroup.test_amara1000.lol_blocks"))
                    .entries((displayContext, entries) -> {
                       entries.add(ModBlocks.LOL_BLOCK);
                    }).build());
    public static final ItemGroup AMARA1000_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestAmara1000.MOD_ID,"amara1000_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.test_amara1000.amara1000_items"))
                    .icon(() -> new ItemStack(Blocks.DIAMOND_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.SHULKER_BOX);
                        entries.add(Items.BEDROCK);
                        entries.add(Items.DRAGON_EGG);
                        entries.add(Items.ENDER_EYE);
                        entries.add(Items.END_PORTAL_FRAME);
                        entries.add(Items.ITEM_FRAME);
                        entries.add(Items.ENDER_PEARL);
                        entries.add(Items.GOLDEN_APPLE);
                        entries.add(Items.NETHERITE_SWORD);
                        entries.add(Items.MACE);
                        entries.add(Items.TRIDENT);
                        entries.add(Items.TOTEM_OF_UNDYING);
                        entries.add(Items.END_CRYSTAL);
                        entries.add(Items.NETHERITE_BOOTS);
                        entries.add(Items.NETHERITE_LEGGINGS);
                        entries.add(Items.NETHERITE_CHESTPLATE);
                        entries.add(Items.NETHERITE_HELMET);
                        entries.add(Items.SHIELD);
                        entries.add(Items.NETHERITE_PICKAXE);
                        entries.add(Items.FLINT_AND_STEEL);
                        entries.add(Items.NAME_TAG);
                        entries.add(Items.FISHING_ROD);
                        entries.add(Items.AXOLOTL_BUCKET);
                        entries.add(Items.LAVA_BUCKET);
                        entries.add(Items.WATER_BUCKET);
                        entries.add(Items.WIND_CHARGE);
                        entries.add(Items.FIREWORK_ROCKET);
                        entries.add(Items.ELYTRA);
                        entries.add(Items.WRITABLE_BOOK);
                        entries.add(Items.BAMBOO_BUTTON);
                        entries.add(Items.BIRCH_BUTTON);
                        entries.add(Items.ACACIA_BUTTON);
                        entries.add(Items.CHERRY_BUTTON);
                        entries.add(Items.CRIMSON_BUTTON);
                        entries.add(Items.JUNGLE_BUTTON);
                        entries.add(Items.DARK_OAK_BUTTON);
                        entries.add(Items.COMMAND_BLOCK);
                        entries.add(Items.STRUCTURE_BLOCK);
                        entries.add(Items.LIGHT);
                        entries.add(Items.DEBUG_STICK);
                        entries.add(Items.BARRIER);
                        entries.add(Items.ENDER_DRAGON_SPAWN_EGG);
                        entries.add(Items.WITHER_SPAWN_EGG);
                        entries.add(Items.BUNDLE);
                    }).build());




    public static void registerItemGroups(){
        TestAmara1000.LOGGER.info("Registering Item Groups for "+TestAmara1000.MOD_ID);
    }
}
