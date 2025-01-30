package io.github.schntgaispock.craftableenchantments.core.slimefun;

import org.bukkit.Material;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.schntgaispock.craftableenchantments.core.theme.ItemTheme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CEGroups {

    public static final SubGroup MATERIALS = new SubGroup("materials",
        new CustomItemStack(Material.BOOK, ItemTheme.TOME.getColor() + "材料"));
    public static final SubGroup ENCHANTED_BOOKS = new SubGroup("enchanted_books",
        new CustomItemStack(Material.ENCHANTED_BOOK, ItemTheme.ENCHANTED.getColor() + "附魔书"));
    public static final MultiGroup MAIN = new MultiGroup("main",
        new CustomItemStack(Material.ENCHANTED_BOOK, ItemTheme.ENCHANTED.getColor() + "附魔工艺"),
            MATERIALS, ENCHANTED_BOOKS);

}
