package io.github.schntgaispock.craftableenchantments.core.slimefun;

import org.bukkit.Material;

import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.schntgaispock.craftableenchantments.core.theme.ItemTheme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CEGroups {

    public static final SubGroup RESOURCES = new SubGroup("resources",
        new CustomItemStack(Material.MAP, ItemTheme.RESOURCE.toString() + "Resources"));
    public static final SubGroup TOMES = new SubGroup("tomes",
        new CustomItemStack(Material.BOOK, ItemTheme.TOME.toString() + "Tomes"));
    public static final SubGroup ENCHANTED_BOOKS = new SubGroup("enchanted_books",
        new CustomItemStack(Material.ENCHANTED_BOOK, ItemTheme.ENCHANTED.toString() + "Resources"));
    public static final SubGroup MAIN = new SubGroup("main",
        new CustomItemStack(Material.ENCHANTED_BOOK, ItemTheme.ENCHANTED.toString() + "Craftable Enchantments"));

}
