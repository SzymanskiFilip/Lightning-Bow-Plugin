package eu.filipszymanski.lightningbowplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BowCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("lbow.spawnbow")){
                player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "" + ChatColor.RED + "You were given you lightning bow");

                ItemStack lightning_bow = new ItemStack(Material.BOW);
                lightning_bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 100);

                ItemMeta meta = lightning_bow.getItemMeta();
                meta.setDisplayName(ChatColor.GREEN + "LIGHTNING BOW");
                meta.setUnbreakable(true);
                lightning_bow.setItemMeta(meta);

                player.getInventory().addItem(lightning_bow);

            }
        } else{
            System.out.println("###ONLY A PLAYER CAN RUN THIS COMMAND###");
        }

        return true;
    }
}
