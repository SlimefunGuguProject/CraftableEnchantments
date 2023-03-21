package io.github.schntgaispock.craftableenchantments.core.theme;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.md_5.bungee.api.ChatColor;

public class ThemedItemStack extends SlimefunItemStack {

    @ParametersAreNonnullByDefault
    protected ThemedItemStack(String id, Material material, String name, String... lore) {
        super(id, material, name, lore);
    }

    @ParametersAreNonnullByDefault
    protected ThemedItemStack(String id, String texture, String name, String... lore) {
        super(id, texture, name, lore);
    }

    @Override
    public @Nonnull Material getType() {
        Material type = super.getType();
        return (type == null) ? Material.BARRIER : type;
    }

    public @Nonnull String getDisplayName() {
        String name = getDisplayName();
        return (name == null) ? "NO NAME" : name;
    }

    @ParametersAreNonnullByDefault
    public static ThemedItemStack of(ItemTheme theme, String id, Material material, String name, String... lore) {
        if (id == null || material == null) return null;

        final String fName = theme.getColor() + ChatColor.translateAlternateColorCodes('&', name);

        if (lore.length > 0) {
            final String[] fLore = new String[lore.length + 1];
            fLore[0] = "";

            for (int i = 0; i < lore.length; i++) {
                fLore[i + 1] = theme.getLoreColor() + lore[i];
            }

            return new ThemedItemStack(id, material, fName, fLore);
        } else {
            return new ThemedItemStack(id, material, fName);
        }
    }

    public ThemedItemStack enchant(Enchantment... enchantments) {
        for (Enchantment enchantment : enchantments) {
            enchant(enchantment, 1);
        }
        return this;
    }

    public ThemedItemStack enchant(Enchantment enchantment, int level) {
        addUnsafeEnchantment(enchantment, level);
        return this;
    }

    public ThemedItemStack glisten() {
        return enchant(Enchantment.DURABILITY).addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public ThemedItemStack addFlags(ItemFlag... flags) {
        ItemMeta meta = getItemMeta();
        meta.addItemFlags(flags);
        setItemMeta(meta);
        return this;
    }
}
