package io.github.schntgaispock.craftableenchantments.core.setup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import io.github.schntgaispock.craftableenchantments.CraftableEnchantments;
import io.github.schntgaispock.craftableenchantments.core.slimefun.CEGroups;
import io.github.schntgaispock.craftableenchantments.core.slimefun.CEStacks;
import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ItemSetup {

    public static ItemStack getEnchantedBook(Enchantment... enchantments) {
        final ItemStack stack = new ItemStack(Material.ENCHANTED_BOOK);
        final EnchantmentStorageMeta meta = (EnchantmentStorageMeta) stack.getItemMeta();
        for (final Enchantment enchantment : enchantments) {
            meta.addStoredEnchant(enchantment, 1, true);
        }
        stack.setItemMeta(meta);
        return stack;
    }

    public static void setup() {

        final CraftableEnchantments ce = CraftableEnchantments.getInstance();

        CEGroups.MAIN.register(ce);

        final ItemStack LAPIS = new ItemStack(Material.LAPIS_LAZULI);
        final ItemStack STRING = new ItemStack(Material.STRING);
        final ItemStack BOOK = new ItemStack(Material.BOOK);
        final ItemStack FEATHER = new ItemStack(Material.FEATHER);
        final ItemStack DIRT = new ItemStack(Material.DIRT);
        final ItemStack FIRE_CHARGE = new ItemStack(Material.FIRE_CHARGE);
        final ItemStack WATER_BUCKET = new ItemStack(Material.WATER_BUCKET);
        final ItemStack BLAZE_POWDER = new ItemStack(Material.BLAZE_POWDER);
        final ItemStack BLAZE_ROD = new ItemStack(Material.BLAZE_ROD);
        final ItemStack SUGAR = new ItemStack(Material.SUGAR);
        final ItemStack REDSTONE = new ItemStack(Material.REDSTONE);
        final ItemStack REDSTONE_BLOCK = new ItemStack(Material.REDSTONE_BLOCK);
        final ItemStack OBSIDIAN = new ItemStack(Material.OBSIDIAN);
        final ItemStack CRYING_OBSIDIAN = new ItemStack(Material.CRYING_OBSIDIAN);
        final ItemStack GOLD_INGOT = new ItemStack(Material.GOLD_INGOT);
        final ItemStack GOLD_BLOCK = new ItemStack(Material.GOLD_BLOCK);
        final ItemStack DIAMOND_BLOCK = new ItemStack(Material.DIAMOND_BLOCK);
        final ItemStack SPONGE = new ItemStack(Material.SPONGE);
        final ItemStack SPIDER_EYE = new ItemStack(Material.SPIDER_EYE);
        final ItemStack GUNPOWDER = new ItemStack(Material.GUNPOWDER);
        final ItemStack RABBIT_FOOT = new ItemStack(Material.RABBIT_FOOT);
        final ItemStack SCUTE = new ItemStack(Material.SCUTE);
        final ItemStack ICE = new ItemStack(Material.ICE);
        final ItemStack INK_SAC = new ItemStack(Material.INK_SAC);
        final ItemStack PRISMARINE_SHARD = new ItemStack(Material.PRISMARINE_SHARD);
        final ItemStack FLINT = new ItemStack(Material.FLINT);
        final ItemStack PISTON = new ItemStack(Material.PISTON);
        final ItemStack COD = new ItemStack(Material.COD);
        final ItemStack SALMON = new ItemStack(Material.SALMON);
        final ItemStack NETHER_STAR = new ItemStack(Material.NETHER_STAR);
        final ItemStack IRON_INGOT = new ItemStack(Material.IRON_INGOT);
        final ItemStack BUCKET = new ItemStack(Material.BUCKET);
        final ItemStack OAK_DOOR = new ItemStack(Material.OAK_DOOR);
        final ItemStack LIGHTNING_ROD = new ItemStack(Material.LIGHTNING_ROD);
        final ItemStack WHITE_WOOL = new ItemStack(Material.WHITE_WOOL);
        final ItemStack ROTTEN_FLESH = new ItemStack(Material.ROTTEN_FLESH);
        final ItemStack BONE = new ItemStack(Material.BONE);
        final ItemStack SOUL_SAND = new ItemStack(Material.SOUL_SAND);
        final ItemStack SOUL_SOIL = new ItemStack(Material.SOUL_SOIL);
        final ItemStack CACTUS = new ItemStack(Material.CACTUS);
        final ItemStack SAND = new ItemStack(Material.SAND);

        new UnplaceableBlock(
            CEGroups.MATERIALS,
            CEStacks.ENCHANTED_BOOK_BINDING,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[] {
                null, LAPIS, null,
                STRING, STRING, STRING,
                null, null, null
            }).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_AIR,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                FEATHER, SlimefunItems.AIR_RUNE, FEATHER,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, SlimefunItems.AIR_RUNE, FEATHER
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_AIR, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_EARTH,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                DIRT, SlimefunItems.EARTH_RUNE, DIRT,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                DIRT, SlimefunItems.EARTH_RUNE, DIRT
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_EARTH, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_FIRE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                FIRE_CHARGE, SlimefunItems.FIRE_RUNE, FIRE_CHARGE,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                FIRE_CHARGE, SlimefunItems.FIRE_RUNE, FIRE_CHARGE
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_FIRE, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_WATER,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                WATER_BUCKET, SlimefunItems.WATER_RUNE, WATER_BUCKET,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                WATER_BUCKET, SlimefunItems.WATER_RUNE, WATER_BUCKET
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_WATER, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_LIGHTNING,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                BLAZE_POWDER, SlimefunItems.LIGHTNING_RUNE, BLAZE_POWDER,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                BLAZE_POWDER, SlimefunItems.LIGHTNING_RUNE, BLAZE_POWDER
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_RESILIENCE, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_SOUL,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SOUL_SOIL, SlimefunItems.SOULBOUND_RUNE, SOUL_SAND,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                SOUL_SAND, SlimefunItems.SOULBOUND_RUNE, SOUL_SOIL
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_SOUL, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_SWIFTNESS,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SUGAR, SlimefunItems.MAGIC_LUMP_3, REDSTONE,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                REDSTONE, SlimefunItems.AIR_RUNE, SUGAR
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_SWIFTNESS, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_FORCE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                BLAZE_POWDER, SlimefunItems.MAGIC_LUMP_3, FIRE_CHARGE,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                FIRE_CHARGE, SlimefunItems.FIRE_RUNE, BLAZE_POWDER
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_FORCE, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_RESILIENCE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT, SlimefunItems.MAGIC_LUMP_3, OBSIDIAN,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                OBSIDIAN, SlimefunItems.EARTH_RUNE, SlimefunItems.STEEL_INGOT
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_RESILIENCE, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_FINESSE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                GOLD_INGOT, SlimefunItems.MAGIC_LUMP_3, FEATHER,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, SlimefunItems.WATER_RUNE, GOLD_INGOT
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_FINESSE, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_SEEKING,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                REDSTONE_BLOCK, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.COBALT_INGOT,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                SlimefunItems.COBALT_INGOT, SlimefunItems.MAGIC_LUMP_3, REDSTONE_BLOCK
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_SEEKING, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_EXORCISM,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.SALT, SlimefunItems.MAGIC_LUMP_3, BLAZE_ROD,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                BLAZE_ROD, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SALT
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_EXORCISM, 2)).register(ce);

        new SlimefunItem(
            CEGroups.MATERIALS,
            CEStacks.MAGIC_TOME_REVERSAL,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.STEEL_PLATE, SlimefunItems.MAGIC_LUMP_3, CRYING_OBSIDIAN,
                SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                CRYING_OBSIDIAN, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.STEEL_PLATE
            },
            new SlimefunItemStack(CEStacks.MAGIC_TOME_REVERSAL, 2)).register(ce);

            new SlimefunItem(
                CEGroups.MATERIALS,
                CEStacks.MAGIC_TOME_SERENDIPITY,
                RecipeType.ANCIENT_ALTAR,
                new ItemStack[] {
                    DIAMOND_BLOCK, SlimefunItems.MAGIC_LUMP_3, GOLD_BLOCK,
                    SlimefunItems.MAGIC_LUMP_1, BOOK, SlimefunItems.MAGIC_LUMP_1,
                    GOLD_BLOCK, SlimefunItems.MAGIC_LUMP_3, DIAMOND_BLOCK
                },
                new SlimefunItemStack(CEStacks.MAGIC_TOME_SERENDIPITY, 2)).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.WATER_WORKER),
            "CE_AQUA_AFFINITY",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1,
                SPONGE, CEStacks.ENCHANTED_BOOK_BINDING, SPONGE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DAMAGE_ARTHROPODS),
            "CE_BANE_OF_ARTHROPODS",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EXORCISM, SlimefunItems.MAGIC_LUMP_1,
                SPIDER_EYE, CEStacks.ENCHANTED_BOOK_BINDING, STRING,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PROTECTION_EXPLOSIONS),
            "CE_BLAST_PROTECTION",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1,
                GUNPOWDER, CEStacks.ENCHANTED_BOOK_BINDING, GUNPOWDER,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EARTH, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.CHANNELING),
            "CE_CHANNELING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_LIGHTNING, SlimefunItems.MAGIC_LUMP_1,
                LIGHTNING_ROD, CEStacks.ENCHANTED_BOOK_BINDING, SCUTE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DEPTH_STRIDER),
            "CE_DEPTH_STRIDER",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1,
                SUGAR, CEStacks.ENCHANTED_BOOK_BINDING, SAND,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DIG_SPEED),
            "CE_EFFICIENCY",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1,
                REDSTONE, CEStacks.ENCHANTED_BOOK_BINDING, REDSTONE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PROTECTION_FALL),
            "CE_FEATHER_FALLING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_REVERSAL, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FEATHER,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.FIRE_ASPECT),
            "CE_FIRE_ASPECT",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FORCE, SlimefunItems.MAGIC_LUMP_1,
                BLAZE_POWDER, CEStacks.ENCHANTED_BOOK_BINDING, BLAZE_POWDER,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FIRE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PROTECTION_FIRE),
            "CE_FIRE_PROTECTION",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1,
                BLAZE_POWDER, CEStacks.ENCHANTED_BOOK_BINDING, BLAZE_POWDER,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FIRE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.ARROW_FIRE),
            "CE_FLAME",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1,
                BLAZE_POWDER, CEStacks.ENCHANTED_BOOK_BINDING, BLAZE_POWDER,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FIRE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.LOOT_BONUS_BLOCKS),
            "CE_FORTUNE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.MAGIC_LUMP_1,
                GOLD_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, GOLD_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EARTH, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.FROST_WALKER),
            "CE_FROST_WALKER",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_REVERSAL, SlimefunItems.MAGIC_LUMP_1,
                ICE, CEStacks.ENCHANTED_BOOK_BINDING, ICE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.IMPALING),
            "CE_IMPALING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EXORCISM, SlimefunItems.MAGIC_LUMP_1,
                INK_SAC, CEStacks.ENCHANTED_BOOK_BINDING, PRISMARINE_SHARD,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.ARROW_INFINITE),
            "CE_INFINITY",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.KNOCKBACK),
            "CE_KNOCKBACK",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FORCE, SlimefunItems.MAGIC_LUMP_1,
                GUNPOWDER, CEStacks.ENCHANTED_BOOK_BINDING, PISTON,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EARTH, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.LOOT_BONUS_MOBS),
            "CE_LOOTING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.MAGIC_LUMP_1,
                GOLD_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, GOLD_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EXORCISM, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.LOYALTY),
            "CE_LOYALTY",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SEEKING, SlimefunItems.MAGIC_LUMP_1,
                REDSTONE, CEStacks.ENCHANTED_BOOK_BINDING, SCUTE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.LUCK),
            "CE_LUCK_OF_THE_SEA",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.MAGIC_LUMP_1,
                GOLD_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, GOLD_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.LURE),
            "CE_LURE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SEEKING, SlimefunItems.MAGIC_LUMP_1,
                COD, CEStacks.ENCHANTED_BOOK_BINDING, SALMON,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.MENDING),
            "CE_MENDING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                NETHER_STAR, CEStacks.ENCHANTED_BOOK_BINDING, NETHER_STAR,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.MULTISHOT),
            "CE_MULTISHOT",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_LIGHTNING, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PIERCING),
            "CE_PIERCING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SEEKING, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.ARROW_DAMAGE),
            "CE_POWER",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FORCE, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PROTECTION_PROJECTILE),
            "CE_PROJECTILE_PROTECTION",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.PROTECTION_ENVIRONMENTAL),
            "CE_PROTECTION",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1,
                IRON_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, IRON_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.ARROW_KNOCKBACK),
            "CE_PUNCH",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FORCE, SlimefunItems.MAGIC_LUMP_1,
                GUNPOWDER, CEStacks.ENCHANTED_BOOK_BINDING, PISTON,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.QUICK_CHARGE),
            "CE_QUICK_CHARGE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1,
                FEATHER, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.OXYGEN), // wtf bukkit
            "CE_RESPIRATION",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1,
                BUCKET, CEStacks.ENCHANTED_BOOK_BINDING, OAK_DOOR,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_AIR, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.RIPTIDE),
            "CE_RIPTIDE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1,
                RABBIT_FOOT, CEStacks.ENCHANTED_BOOK_BINDING, SCUTE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_WATER, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DAMAGE_ALL),
            "CE_SHARPNESS",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EXORCISM, SlimefunItems.MAGIC_LUMP_1,
                FLINT, CEStacks.ENCHANTED_BOOK_BINDING, FLINT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EARTH, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.SILK_TOUCH),
            "CE_SILK_TOUCH",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SERENDIPITY, SlimefunItems.MAGIC_LUMP_1,
                WHITE_WOOL, CEStacks.ENCHANTED_BOOK_BINDING, WHITE_WOOL,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DAMAGE_UNDEAD),
            "CE_SMITE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EXORCISM, SlimefunItems.MAGIC_LUMP_1,
                ROTTEN_FLESH, CEStacks.ENCHANTED_BOOK_BINDING, BONE,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FIRE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.SOUL_SPEED),
            "CE_SOUL_SPEED",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1,
                SUGAR, CEStacks.ENCHANTED_BOOK_BINDING, SOUL_SAND,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SOUL, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.SWEEPING_EDGE),
            "CE_SWEEPING_EDGE",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1,
                IRON_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, IRON_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FORCE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_19))
            new VanillaItem(
                CEGroups.ENCHANTED_BOOKS,
                getEnchantedBook(Enchantment.SWIFT_SNEAK),
                "CE_SWIFT_SNEAK",
                RecipeType.ANCIENT_ALTAR,
                new ItemStack[] {
                    SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SWIFTNESS, SlimefunItems.MAGIC_LUMP_1,
                    SUGAR, CEStacks.ENCHANTED_BOOK_BINDING, new ItemStack(Material.getMaterial("SCULK")),
                    SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_EARTH, SlimefunItems.MAGIC_LUMP_1
                }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.THORNS),
            "CE_THORNS",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1,
                CACTUS, CEStacks.ENCHANTED_BOOK_BINDING, CACTUS,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_REVERSAL, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.DURABILITY),
            "CE_UNBREAKING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_FINESSE, SlimefunItems.MAGIC_LUMP_1,
                SlimefunItems.STEEL_INGOT, CEStacks.ENCHANTED_BOOK_BINDING, SlimefunItems.STEEL_INGOT,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_RESILIENCE, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.BINDING_CURSE),
            "CE_CURSE_OF_BINDING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_REVERSAL, SlimefunItems.MAGIC_LUMP_1,
                SlimefunItems.NECROTIC_SKULL, CEStacks.ENCHANTED_BOOK_BINDING, SlimefunItems.NECROTIC_SKULL,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SOUL, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

        new VanillaItem(
            CEGroups.ENCHANTED_BOOKS,
            getEnchantedBook(Enchantment.VANISHING_CURSE),
            "CE_CURSE_OF_VANISHING",
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_REVERSAL, SlimefunItems.MAGIC_LUMP_1,
                SlimefunItems.NECROTIC_SKULL, CEStacks.ENCHANTED_BOOK_BINDING, SlimefunItems.NECROTIC_SKULL,
                SlimefunItems.MAGIC_LUMP_1, CEStacks.MAGIC_TOME_SEEKING, SlimefunItems.MAGIC_LUMP_1
            }).register(ce);

    }

}
