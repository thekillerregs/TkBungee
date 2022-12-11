package thekillerregs.tkbungee.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import thekillerregs.tkbungee.TkBungee;

public class ReplyCommand extends Command{

    private TkBungee tkBungee;

    public ReplyCommand(TkBungee tkBungee)
    {
        super("reply");
        this.tkBungee=tkBungee;
    }


    @Override
    public void execute(CommandSender sender, String[] args) {

        if(sender instanceof ProxiedPlayer)
        {
            ProxiedPlayer player = (ProxiedPlayer) sender;

            if(args.length>=1)
            {
                if(tkBungee.getRecentMessages().containsKey(player.getUniqueId())) {

                    ProxiedPlayer target = ProxyServer.getInstance().getPlayer(tkBungee.getRecentMessages().get(player.getUniqueId()));
                    if (target != null) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < args.length; i++) {
                            sb.append(args[i] + " ");
                        }

                        player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Você -> " + target.getName() + ": " + sb + ChatColor.DARK_GRAY + "]");
                        target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + player.getName() + " -> Você: " + sb + ChatColor.DARK_GRAY + "]");


                    } else {
                        player.sendMessage(ChatColor.RED + "O jogador não está online no momento!");
                        tkBungee.getRecentMessages().remove(player.getUniqueId());
                    }

                }
                else {
                    player.sendMessage(ChatColor.RED+"Você não tem mensagens recentes a serem respondidas!");

                }

            }
            else{
                player.sendMessage("§cUso: /reply <mensagem>");

            }



        }


    }


}
