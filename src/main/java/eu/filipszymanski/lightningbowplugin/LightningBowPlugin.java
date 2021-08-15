package eu.filipszymanski.lightningbowplugin;

import eu.filipszymanski.lightningbowplugin.events.LightningBowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightningBowPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("###LIGHTNING-BOW SUCCESSFULY ACTIVATED!###");

        getServer().getPluginManager().registerEvents(new LightningBowEvent(), this);
        getCommand("lbow").setExecutor(new BowCommand());
    }

}
