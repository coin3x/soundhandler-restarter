package coin3x.soundhandlerrestarter.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenOptionsSounds;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiEventHandler {
    @SubscribeEvent
    public void onPostInitGui(GuiScreenEvent.InitGuiEvent.Post event) {
        GuiScreen gui = event.getGui();

        if (gui instanceof GuiScreenOptionsSounds) {
            event.getButtonList().add(new GuiButton(888, gui.width / 2 + 5, gui.height / 6 + 108, 150, 20, "Restart SoundHandler"));
        }
    }
    
    @SubscribeEvent
    public void onPostActionPerformed(GuiScreenEvent.ActionPerformedEvent.Post event) {
        GuiScreen gui = event.getGui();
        
        if (gui instanceof GuiScreenOptionsSounds && event.getButton().id == 888) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.getSoundHandler().onResourceManagerReload(mc.getResourceManager());
        }
    }
}
