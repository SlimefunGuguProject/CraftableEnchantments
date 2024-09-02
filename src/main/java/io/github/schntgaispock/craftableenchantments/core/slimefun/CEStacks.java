package io.github.schntgaispock.craftableenchantments.core.slimefun;

import org.bukkit.Material;

import io.github.schntgaispock.craftableenchantments.core.theme.ItemTheme;
import io.github.schntgaispock.craftableenchantments.core.theme.ThemedItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;

@UtilityClass
public class CEStacks {

    private static String getTomeName(String type, ChatColor color) {
        return "魔法书 " + ChatColor.GRAY.toString() + ChatColor.BOLD + "[" +
            color + ChatColor.BOLD + type + ChatColor.GRAY.toString() + ChatColor.BOLD + "]";
    }

    public static final SlimefunItemStack ENCHANTED_BOOK_BINDING = ThemedItemStack.of(
        ItemTheme.RESOURCE,
        "CE_ENCHANTMED_BOOK_BINDING",
        Material.STRING,
        "附魔书装帧");

    public static final SlimefunItemStack MAGIC_TOME_AIR = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_AIR",
        Material.BOOK,
        getTomeName("气", ChatColor.AQUA)).glisten();

    public static final SlimefunItemStack MAGIC_TOME_EARTH = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_EARTH",
        Material.BOOK,
        getTomeName("土", ChatColor.of("#804000"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_FIRE = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_FIRE",
        Material.BOOK,
        getTomeName("火", ChatColor.DARK_RED)).glisten();

    public static final SlimefunItemStack MAGIC_TOME_WATER = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_WATER",
        Material.BOOK,
        getTomeName("水", ChatColor.DARK_BLUE)).glisten();

    public static final SlimefunItemStack MAGIC_TOME_LIGHTNING = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_LIGHTNING",
        Material.BOOK,
        getTomeName("雷", ChatColor.YELLOW)).glisten();

    public static final SlimefunItemStack MAGIC_TOME_SOUL = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_SOUL",
        Material.BOOK,
        getTomeName("灵魂", ChatColor.DARK_PURPLE)).glisten();

    public static final SlimefunItemStack MAGIC_TOME_SWIFTNESS = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_SWIFTNESS",
        Material.BOOK,
        getTomeName("迅捷", ChatColor.of("#cff7f4"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_FORCE = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_FORCE",
        Material.BOOK,
        getTomeName("力量", ChatColor.of("#f7f6cf"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_RESILIENCE = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_RESILIENCE",
        Material.BOOK,
        getTomeName("弹性", ChatColor.of("#cff7d3"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_FINESSE = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_FINESSE",
        Material.BOOK,
        getTomeName("灵巧", ChatColor.of("#f1cff7"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_SEEKING = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_SEEKING",
        Material.BOOK,
        getTomeName("搜寻", ChatColor.of("#1bc4b9"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_EXORCISM = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_EXORCISM",
        Material.BOOK,
        getTomeName("驱魔", ChatColor.of("#77120a"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_REVERSAL = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_REVERSAL",
        Material.BOOK,
        getTomeName("颠倒", ChatColor.of("#188223"))).glisten();

    public static final SlimefunItemStack MAGIC_TOME_SERENDIPITY = ThemedItemStack.of(
        ItemTheme.TOME,
        "CE_MAGIC_TOME_SERENDIPITY",
        Material.BOOK,
        getTomeName("幸运", ChatColor.LIGHT_PURPLE)).glisten();

}
