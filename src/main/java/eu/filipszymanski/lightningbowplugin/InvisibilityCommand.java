package eu.filipszymanski.lightningbowplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvisibilityCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp()){
                if(player.isInvisible()){
                    player.setInvisible(false);
                } else if(!player.isInvisible()){
                    player.setInvisible(true);
                }
            }
        }

        return false;
    }
}
