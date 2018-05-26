package coin3x.soundhandlerrestarter;

import coin3x.soundhandlerrestarter.client.GuiEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = SoundHandlerRestarter.MODID, version = SoundHandlerRestarter.VERSION)
public class SoundHandlerRestarter {
    public static final String MODID = "shrestarter";
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLInitializationEvent event) {
	if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(new GuiEventHandler());
	}
    }
}
