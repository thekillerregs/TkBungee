package thekillerregs.tkbungee;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.ArrayList;
import java.util.List;

public class FruitCommand extends Command implements TabExecutor {


    public FruitCommand()
    {
        super("fruit");
    }


    @Override
    public void execute(CommandSender sender, String[] args) {

    }

    @Override
    public Iterable<String> onTabComplete(CommandSender sender, String[] args) {


        List<String> results = new ArrayList<>();
        if(args.length==1)
        {
            results.add("Apple");
            results.add("Orange");
            results.add("Grape");
            
        } else if (args.length==2) {
            ProxyServer.getInstance().getPlayers().forEach(p -> {
                results.add(p.getName());
            });
        }


        return results;
    }
}
