package io.github.schntgaispock.craftableenchantments;

import org.bstats.bukkit.Metrics;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.schntgaispock.craftableenchantments.core.setup.ItemSetup;
import lombok.Getter;

public class CraftableEnchantments extends AbstractAddon {

    private static @Getter CraftableEnchantments instance;

    public CraftableEnchantments() {
        super("SchnTgaiSpock", "CraftableEnchantments", "master", "options.auto-update");
    }

    @Override
    protected void enable() {
        instance = this;

        getLogger().info("#==============================================#");
        getLogger().info("#    CraftableEnchantments by SchnTgaiSpock    #");
        getLogger().info("#==============================================#");

        new Metrics(this, 18022);

        ItemSetup.setup();
    }

    @Override
    protected void disable() {
        instance = null;
    }
    
}