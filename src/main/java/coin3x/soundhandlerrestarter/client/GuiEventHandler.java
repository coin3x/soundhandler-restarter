package coin3x.soundhandlerrestarter.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreenOptionsSounds;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiEventHandler {
    @SubscribeEvent
    public void onPostInitGui(GuiScreenEvent.InitGuiEvent.Post event) {
        if (event.gui instanceof GuiScreenOptionsSounds) {
            event.buttonList.add(new GuiButton(888, event.gui.width / 2 - 100, event.gui.height / 6 + 130, "Restart SoundHandler"));
        }
    }
    
    @SubscribeEvent
    public void onPostActionPerformed(GuiScreenEvent.ActionPerformedEvent.Post event) {
        if (event.button.id == 888) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.getSoundHandler().onResourceManagerReload(mc.getResourceManager());
        }
    }
}
