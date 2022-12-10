package thekillerregs.tkbungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class HiCommand extends Command {

    public HiCommand()
    {
    super("hi");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        sender.sendMessage(ChatColor.BLUE+"OIIIIIII");

    }
}
