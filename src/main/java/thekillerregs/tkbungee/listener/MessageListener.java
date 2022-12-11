package thekillerregs.tkbungee.listener;

import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import thekillerregs.tkbungee.TkBungee;

public class MessageListener implements Listener {


    private TkBungee tkBungee;

    public MessageListener(TkBungee tkBungee)
    {
        this.tkBungee=tkBungee;

    }


    @EventHandler
    public void onQuit(PlayerDisconnectEvent e)
    {
        if(tkBungee.getRecentMessages().containsKey(e.getPlayer().getUniqueId())) tkBungee.getRecentMessages().remove(e.getPlayer().getUniqueId());
    }


}
