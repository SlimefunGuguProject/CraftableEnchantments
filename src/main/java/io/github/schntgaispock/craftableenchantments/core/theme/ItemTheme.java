package io.github.schntgaispock.craftableenchantments.core.theme;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

public enum ItemTheme {
    RESOURCE(ChatColor.GOLD),
    TOME(ChatColor.GRAY),
    ENCHANTED(ChatColor.YELLOW);

    private @Getter ChatColor color;
    private @Getter ChatColor loreColor;

    ItemTheme(ChatColor color, ChatColor loreColor) {
        this.color = color;
        this.loreColor = loreColor;
    }

    ItemTheme(String color) {
        this(ChatColor.of(color));
    }

    ItemTheme(ChatColor color) {
        this(color, ChatColor.of("#aaaaaa"));
    }
}