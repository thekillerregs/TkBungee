package thekillerregs.tkbungee;


import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;


import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class TkBungee extends Plugin  {

    @Override
    public void onEnable() {
    getProxy().getPluginManager().registerCommand(this, new FruitCommand());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }




}
