package test.amara1000.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import test.amara1000.TestAmara1000;
import test.amara1000.item.custom.ChiselItem;

public class ModItems {
    public static final Item LOL = registerItem("lol", new Item(new Item.Settings()));
    public static final Item SWAPPER=registerItem("swapper", new ChiselItem(new Item.Settings().maxDamage(32)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TestAmara1000.MOD_ID, name), item);
    }


    public static void registerModItems(){
        TestAmara1000.LOGGER.info("Registering Mod Items for "+TestAmara1000.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LOL);
        });
    }
}
