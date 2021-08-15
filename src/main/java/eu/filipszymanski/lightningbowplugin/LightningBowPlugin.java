package eu.filipszymanski.lightningbowplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class LightningBowPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("###LIGHTNING-BOW SUCCESSFULY ACTIVATED!###");
        getCommand("lbow").setExecutor(new BowCommand());
    }


}
