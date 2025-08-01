package net.TrueDragon.BoundByBlood;

import com.mojang.logging.LogUtils;
import net.TrueDragon.BoundByBlood.block.Blocks;
import net.TrueDragon.BoundByBlood.item.Items;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(net.TrueDragon.BoundByBlood.BoundByBlood.MOD_ID)
public class BoundByBlood
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "boundbyblood";

    public static final Logger LOGGER = LogUtils.getLogger();


    public BoundByBlood(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        net.TrueDragon.BoundByBlood.item.CreativeModeTabs.register(modEventBus);

        Items.register(modEventBus);
        Blocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(Items.OLD_BONE);
            event.accept(Items.MORTAR_AND_PESTLE);
            event.accept(Items.BLOOD_CRYSTAL);
            event.accept(Items.BEAST_BLOOD);
            event.accept(Items.EARTH_BEAST_BLOOD);
            event.accept(Items.FIRE_BEAST_BLOOD);
            event.accept(Items.METAL_BEAST_BLOOD);
            event.accept(Items.WATER_BEAST_BLOOD);
            event.accept(Items.WOOD_BEAST_BLOOD);

        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(Blocks.SANGUICITE);

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
