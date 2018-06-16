package coin3x.soundhandlerrestarter;

import coin3x.soundhandlerrestarter.client.GuiEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SoundHandlerRestarter.MODID, version = SoundHandlerRestarter.VERSION)
public class SoundHandlerRestarter {
    public static final String MODID = "shrestarter";
    public static final String VERSION = "0.1.2";

    @EventHandler
    public void init(FMLInitializationEvent event) {
	if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(new GuiEventHandler());
	}
    }
}
