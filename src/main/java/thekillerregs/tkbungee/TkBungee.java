package thekillerregs.tkbungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

public final class TkBungee extends Plugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Compilei fellas kkkkkkk");
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new HiCommand());
        ProxyServer.getInstance().getPluginManager().registerListener(this, this);
        ProxyServer.getInstance().getScheduler().schedule(this, () -> {
            System.out.println(ChatColor.BLUE+"OII");

        }, 10, 5, TimeUnit.SECONDS);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPostLogin(PostLoginEvent e)
    {
        e.getPlayer().sendMessage(ChatColor.RED+ "OIIIIIIIIIIIIIIIIIIIIIIIIIII");

    }


}
