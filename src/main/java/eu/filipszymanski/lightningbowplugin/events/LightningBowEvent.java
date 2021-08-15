package eu.filipszymanski.lightningbowplugin.events;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class LightningBowEvent implements Listener {

    @EventHandler
    public void onShoot(ProjectileHitEvent e){
        if(e.getEntity() instanceof Arrow){
            if(e.getEntity().getShooter() instanceof Player){
                Player player = (Player) e.getEntity().getShooter();
                if(player.isOp()){
                    Location location = e.getEntity().getLocation();
                    player.sendMessage("PROJECTILE LANDED");
                    location.getWorld().strikeLightning(location);
                    location.getWorld().playSound(location, Sound.BLOCK_SNOW_HIT, 10.0f, 1.0f);
                }
            }

        }
    }

}
