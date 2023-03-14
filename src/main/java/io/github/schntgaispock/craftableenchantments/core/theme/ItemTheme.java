package io.github.schntgaispock.craftableenchantments.core.theme;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

public enum ItemTheme {
    RESOURCE(ChatColor.LIGHT_PURPLE),
    TOME(ChatColor.AQUA),
    ENCHANTED(ChatColor.YELLOW);

    private @Getter ChatColor color;
    private @Getter ChatColor loreColor;

    ItemTheme(ChatColor color, String loreColor) {
        this.color = color;
        this.loreColor = ChatColor.of(loreColor);
    }

    ItemTheme(String color) {
        this(ChatColor.of(color), "#aaaaaa");
    }

    ItemTheme(ChatColor color) {
        this(color, "#aaaaaa");
    }
}