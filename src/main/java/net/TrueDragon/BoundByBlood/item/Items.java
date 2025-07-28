package net.TrueDragon.BoundByBlood.item;

import net.TrueDragon.BoundByBlood.BoundByBlood;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Items {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoundByBlood.MOD_ID);

    public static final RegistryObject<Item> OLD_BONE = Items.register("old_bone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }

}
