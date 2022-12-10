package thekillerregs.tkbungee;


import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.Favicon;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class TkBungee extends Plugin implements Listener  {

    private Favicon favicon;

    @Override
    public void onEnable() {

        try{
            favicon = Favicon.create(ImageIO.read(new File("favicon.png")));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



    getProxy().getPluginManager().registerListener(this, this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @EventHandler
    public void onProxyPing(ProxyPingEvent e)
    {
        ServerPing ping = e.getResponse();
        ping.setDescription(ChatColor.AQUA+" vose jogaria agui\n vc teria corage");
        ping.setPlayers(new ServerPing.Players(30000, 16789, ping.getPlayers().getSample()));
        ping.setVersion(new ServerPing.Protocol("Usa 1.17.1 nessa bomba taok", 756));
        ping.setFavicon(favicon);

        e.setResponse(ping);
    }


}
