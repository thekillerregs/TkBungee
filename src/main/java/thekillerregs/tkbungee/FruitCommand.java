package thekillerregs.tkbungee;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

            return results.stream().filter(val -> val.toLowerCase().startsWith(args[0].toLowerCase())).collect(Collectors.toList());

        } else if (args.length==2) {
            ProxyServer.getInstance().getPlayers().forEach(p -> {
                results.add(p.getName());
            });
            return results.stream().filter(val -> val.toLowerCase().startsWith(args[1].toLowerCase())).collect(Collectors.toList());
        }


        return results;
    }
}
