package fr.iglee42.crystallizedgenerators;

import com.mojang.logging.LogUtils;
import fr.iglee42.crystallizedgenerators.world.structure.ModStructures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrystallizedGenerators.MODID)
public class CrystallizedGenerators {

    public static final String MODID = "crystallizedgenerators";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrystallizedGenerators() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModStructures.register(bus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

}
