package io.github.schntgaispock.craftableenchantments;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import lombok.Getter;

public class CraftableEnchantments extends AbstractAddon {

    private static @Getter CraftableEnchantments instance;

    public CraftableEnchantments(String githubUserName, String githubRepo, String autoUpdateBranch, String autoUpdateKey) {
        super(githubUserName, githubRepo, autoUpdateBranch, autoUpdateKey);
    }

    @Override
    protected void enable() {
        instance = this;

        getLogger().info("#==============================================#");
        getLogger().info("#    CraftableEnchantments by SchnTgaiSpock    #");
        getLogger().info("#==============================================#");

        // Metrics metrics = new Metrics(this, );
    }

    @Override
    protected void disable() {
        instance = null;
    }
    
    public static NamespacedKey newNamespacedKey(@Nonnull String name) {
        return new NamespacedKey(CraftableEnchantments.getInstance(), name);
    }

    public static int scheduleSyncDelayedTask(Runnable runnable, long delay) {
        return Bukkit.getScheduler().scheduleSyncDelayedTask(getInstance(), runnable, delay);
    }
    
}