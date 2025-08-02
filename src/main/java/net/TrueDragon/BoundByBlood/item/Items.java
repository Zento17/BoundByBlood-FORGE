package net.TrueDragon.BoundByBlood.item;

import net.TrueDragon.BoundByBlood.BoundByBlood;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoundByBlood.MOD_ID);

    public static final RegistryObject<Item> OLD_BEAST_BONE = ITEMS.register("old_beast_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_CRYSTAL = ITEMS.register("blood_crystal",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_BEAST_BLOOD = ITEMS.register("water_beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_BEAST_BLOOD = ITEMS.register("fire_beast_blood",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> EARTH_BEAST_BLOOD = ITEMS.register("earth_beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_BEAST_BLOOD = ITEMS.register("wood_beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_BEAST_BLOOD = ITEMS.register("metal_beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAST_BLOOD = ITEMS.register("beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_CRYSTAL_TIER_2 = ITEMS.register("blood_crystal_tier_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEMONIC_BLOOD_CRYSTAL_TIER_2 = ITEMS.register("demonic_blood_crystal_tier_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAST_CORE = ITEMS.register("beast_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEMONIC_BLOOD_CRYSTAL = ITEMS.register("demonic_blood_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAST_BONE = ITEMS.register("beast_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_BEAST_BLOOD = ITEMS.register("refined_beast_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_BEAST_BLOOD_POWDER = ITEMS.register("refined_beast_blood_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAST_BLOOD_POWDER = ITEMS.register("beast_blood_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAST_SOUL = ITEMS.register("beast_soul",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
