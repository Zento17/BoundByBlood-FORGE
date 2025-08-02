package net.TrueDragon.BoundByBlood.item;

import net.TrueDragon.BoundByBlood.BoundByBlood;
import net.TrueDragon.BoundByBlood.block.Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoundByBlood.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BOUNDBYBLOOD_ITEMS_TAB = CREATIVE_MODE_TABS.register("boundbyblood_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.BLOOD_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.boundbyblood.boundbyblood_items"))
                    .displayItems((itemsDisplayParameters, output) -> {
                        output.accept(Items.BLOOD_CRYSTAL.get());
                        output.accept(Items.BLOOD_CRYSTAL_TIER_2.get());
                        output.accept(Items.DEMONIC_BLOOD_CRYSTAL.get());
                        output.accept(Items.DEMONIC_BLOOD_CRYSTAL_TIER_2.get());
                        output.accept(Items.REFINED_BEAST_BLOOD_POWDER.get());
                        output.accept(Items.BEAST_BLOOD_POWDER.get());
                        output.accept(Items.BEAST_BLOOD.get());
                        output.accept(Items.REFINED_BEAST_BLOOD.get());
                        output.accept(Items.EARTH_BEAST_BLOOD.get());
                        output.accept(Items.WATER_BEAST_BLOOD.get());
                        output.accept(Items.FIRE_BEAST_BLOOD.get());
                        output.accept(Items.METAL_BEAST_BLOOD.get());
                        output.accept(Items.WOOD_BEAST_BLOOD.get());
                        output.accept(Items.OLD_BEAST_BONE.get());
                        output.accept(Items.BEAST_BONE.get());
                        output.accept(Items.BEAST_CORE.get());
                        output.accept(Items.MORTAR_AND_PESTLE.get());
                        output.accept(Items.BEAST_SOUL.get());



                    }).build());

    public static final RegistryObject<CreativeModeTab> BOUNDBYBLOOD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("boundbyblood_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.SANGUICITE.get()))
                    .withTabsBefore(BOUNDBYBLOOD_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.bounbyblood.sanguicite_blocks"))
                    .displayItems((itemsDisplayParameters, output) -> {
                        output.accept(Blocks.SANGUICITE.get());
                        output.accept(Blocks.DEEPSLATE_GRAVEVEINIUM_ORE.get());
                        output.accept(Blocks.GRAVEVEINIUM_ORE.get());


                    }).build());

            public static void register(IEventBus eventBus){
                CREATIVE_MODE_TABS.register(eventBus);

            }
}
