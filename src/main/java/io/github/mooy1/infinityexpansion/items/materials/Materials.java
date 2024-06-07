package io.github.mooy1.infinityexpansion.items.materials;

import java.util.Arrays;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.machines.VoidHarvester;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

@UtilityClass
public final class Materials {


    public static final SlimefunItemStack INFINITE_CIRCUIT = new SlimefunItemStack(
            "INFINITE_MACHINE_CIRCUIT",
            Material.DIAMOND,
            "&b无尽&6晶格",
            "&7机器组件"
    );
    public static final SlimefunItemStack RANDOM_NETHER_TEMPLATE = new SlimefunItemStack(
        "RANDOM_NETHER_TEMPLATE",
        Material.NETHERITE_INGOT,
        "&b随机模板",
        "&7可以在随机机器中随机转换为某一种下届合金模板"
    );
    public static final SlimefunItemStack INFINITE_CORE = new SlimefunItemStack(
            "INFINITE_MACHINE_CORE",
            Material.DIAMOND_BLOCK,
            "&b无尽&6机械核心",
            "&7机器组件"
    );
    public static final SlimefunItemStack MAGSTEEL_PLATE = new SlimefunItemStack(
            "MAGSTEEL_PLATE",
            Material.NETHERITE_SCRAP,
            "&4磁钢板",
            "&7机器组件"
    );
    public static final SlimefunItemStack MACHINE_PLATE = new SlimefunItemStack(
            "MACHINE_PLATE",
            Material.PAPER,
            "&f机器板块",
            "&7机器组件"
    );
    public static final SlimefunItemStack MACHINE_CIRCUIT = new SlimefunItemStack(
            "MACHINE_CIRCUIT",
            Material.GOLD_INGOT,
            "&6机器电路",
            "&7机器组件"
    );

    public static final SlimefunItemStack MACHINE_CORE = new SlimefunItemStack(
            "MACHINE_CORE",
            Material.IRON_BLOCK,
            "&f机器核心",
            "&7机器组件"
    );
    public static final SlimefunItemStack VOID_BIT = new SlimefunItemStack(
            "VOID_BIT",
            Material.IRON_NUGGET,
            "&8虚空粒",
            "&7&o它非常... 渺小"
    );
    public static final SlimefunItemStack VOID_DUST = new SlimefunItemStack(
            "VOID_DUST",
            Material.GUNPOWDER,
            "&8虚空粉尘",
            "&7&o它有点重量..."
    );
    public static final SlimefunItemStack VOID_INGOT = new SlimefunItemStack(
            "VOID_INGOT",
            Material.NETHERITE_INGOT,
            "&8虚空锭",
            "&7&o虚空的力量掌握在你手中"
    );
    public static final SlimefunItemStack COBBLE_1 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_1",
            Material.ANDESITE,
            "&7一重压缩圆石",
            "&89个圆石压缩而来"
    );
    public static final SlimefunItemStack COBBLE_2 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_2",
            Material.ANDESITE,
            "&7双重压缩圆石",
            "&881个圆石压缩而来"
    );
    public static final SlimefunItemStack COBBLE_3 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_3",
            Material.STONE,
            "&7三重压缩圆石",
            "&8729个圆石压缩而来"
    );
    public static final SlimefunItemStack COBBLE_4 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_4",
            Material.STONE,
            "&7四重压缩圆石",
            "&86561个圆石压缩而来"
    );
    public static final SlimefunItemStack COBBLE_5 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_5",
            Material.POLISHED_ANDESITE,
            "&7五重压缩圆石",
            "&859049个圆石压缩而来"
    );
    public static final SlimefunItemStack MAGSTEEL = new SlimefunItemStack(
            "MAGSTEEL",
            Material.BRICK,
            "&4磁钢"
    );
    public static final SlimefunItemStack MAGNONIUM = new SlimefunItemStack(
            "MAGNONIUM",
            Material.NETHER_BRICK,
            "&5磁金"
    );
    public static final SlimefunItemStack TITANIUM = new SlimefunItemStack(
            "TITANIUM",
            Material.IRON_INGOT,
            "&7钛"
    );
    public static final SlimefunItemStack MYTHRIL = new SlimefunItemStack(
            "MYTHRIL",
            Material.IRON_INGOT,
            "&b秘银"
    );
    public static final SlimefunItemStack ADAMANTITE = new SlimefunItemStack(
            "ADAMANTITE",
            Material.BRICK,
            "&d精金"
    );
    public static final SlimefunItemStack INFINITE_INGOT = new SlimefunItemStack(
            "INFINITE_INGOT",
            Material.IRON_INGOT,
            "&e无&a尽&b锭", // &dI&cn&6f&ei&an&bi&3t&9y &fIngot
            "&7&o宇宙的力量掌握在你手中"
    );
    public static final SlimefunItemStack FORTUNE_SINGULARITY = new SlimefunItemStack(
            "FORTUNE_SINGULARITY",
            Material.NETHER_STAR,
            "&6时运奇点"
    );
    public static final SlimefunItemStack EARTH_SINGULARITY = new SlimefunItemStack(
            "EARTH_SINGULARITY",
            Material.NETHER_STAR,
            "&a地球奇点"
    );
    public static final SlimefunItemStack METAL_SINGULARITY = new SlimefunItemStack(
            "METAL_SINGULARITY",
            Material.NETHER_STAR,
            "&8金属奇点"
    );
    public static final SlimefunItemStack MAGIC_SINGULARITY = new SlimefunItemStack(
            "MAGIC_SINGULARITY",
            Material.NETHER_STAR,
            "&d魔法奇点"
    );
    public static final SlimefunItemStack ENDER_ESSENCE = new SlimefunItemStack(
            "END_ESSENCE",
            Material.BLAZE_POWDER,
            "&5末地精华",
            "&8&o来源于末地深处..."
    );


    public static final SlimefunItemStack COPPER_BLCOK = new SlimefunItemStack(
        "COPPER_BLOCK",
        Material.BRICKS,
        "&6铜块"
    );
    public static final SlimefunItemStack COPPER_SINGULARITY = new SlimefunItemStack(
            "COPPER_SINGULARITY",
            Material.BRICKS,
            "&6铜奇点"
    );
    public static final SlimefunItemStack ZINC_BLOCK = new SlimefunItemStack(
        "ZINC_BLOCK",
        Material.IRON_BLOCK,
        "&7锌块"
    );
    public static final SlimefunItemStack ZINC_SINGULARITY = new SlimefunItemStack(
            "ZINC_SINGULARITY",
            Material.IRON_BLOCK,
            "&7锌奇点"
    );
    public static final SlimefunItemStack TIN_BLOCK = new SlimefunItemStack(
        "TIN_BLOCK",
        Material.IRON_BLOCK,
        "&7锡块"
    );
    public static final SlimefunItemStack TIN_SINGULARITY = new SlimefunItemStack(
            "TIN_SINGULARITY",
            Material.IRON_BLOCK,
            "&7锡奇点"
    );
    public static final SlimefunItemStack ALUMINUM_BLOCK = new SlimefunItemStack(
        "ALUMINUM_BLOCK",
        Material.IRON_BLOCK,
        "&7铝块"
    );
    public static final SlimefunItemStack ALUMINUM_SINGULARITY = new SlimefunItemStack(
            "ALUMINUM_SINGULARITY",
            Material.IRON_BLOCK,
            "&7铝奇点"
    );
    public static final SlimefunItemStack SILVER_BLOCK = new SlimefunItemStack(
        "SILVER_BLOCK",
        Material.IRON_BLOCK,
        "&7银块"
    );
    public static final SlimefunItemStack SILVER_SINGULARITY = new SlimefunItemStack(
            "SILVER_SINGULARITY",
            Material.IRON_BLOCK,
            "&7银奇点"
    );
    public static final SlimefunItemStack MAGNESIUM_BLOCK = new SlimefunItemStack(
        "MAGNESIUM_BLOCK",
        Material.NETHER_BRICKS,
        "&5镁块"
    );
    public static final SlimefunItemStack MAGNESIUM_SINGULARITY = new SlimefunItemStack(
            "MAGNESIUM_SINGULARITY",
            Material.NETHER_BRICKS,
            "&5镁奇点"
    );
    public static final SlimefunItemStack LEAD_BLOCK = new SlimefunItemStack(
        "LEAD_BLOCK",
        Material.IRON_BLOCK,
        "&8铅块"
    );
    public static final SlimefunItemStack LEAD_SINGULARITY = new SlimefunItemStack(
            "LEAD_SINGULARITY",
            Material.IRON_BLOCK,
            "&8铅奇点"
    );
    public static final SlimefunItemStack GOLD_SINGULARITY = new SlimefunItemStack(
            "GOLD_SINGULARITY",
            Material.GOLD_BLOCK,
            "&6金奇点"
    );
    public static final SlimefunItemStack IRON_SINGULARITY = new SlimefunItemStack(
            "IRON_SINGULARITY",
            Material.IRON_BLOCK,
            "&7铁奇点"
    );
    public static final SlimefunItemStack DIAMOND_SINGULARITY = new SlimefunItemStack(
            "DIAMOND_SINGULARITY",
            Material.DIAMOND_BLOCK,
            "&b钻石奇点"
    );
    public static final SlimefunItemStack EMERALD_SINGULARITY = new SlimefunItemStack(
            "EMERALD_SINGULARITY",
            Material.EMERALD_BLOCK,
            "&a绿宝石奇点"
    );
    public static final SlimefunItemStack NETHERITE_SINGULARITY = new SlimefunItemStack(
            "NETHERITE_SINGULARITY",
            Material.NETHERITE_BLOCK,
            "&4下界合金奇点"
    );
    public static final SlimefunItemStack COAL_SINGULARITY = new SlimefunItemStack(
            "COAL_SINGULARITY",
            Material.COAL_BLOCK,
            "&8煤炭奇点"
    );
    public static final SlimefunItemStack REDSTONE_SINGULARITY = new SlimefunItemStack(
            "REDSTONE_SINGULARITY",
            Material.REDSTONE_BLOCK,
            "&c红石奇点"
    );
    public static final SlimefunItemStack LAPIS_SINGULARITY = new SlimefunItemStack(
            "LAPIS_SINGULARITY",
            Material.LAPIS_BLOCK,
            "&9青金石奇点"
    );
    public static final SlimefunItemStack QUARTZ_SINGULARITY = new SlimefunItemStack(
            "QUARTZ_SINGULARITY",
            Material.QUARTZ_BLOCK,
            "&f石英奇点"
    );
    public static final SlimefunItemStack INFINITY_BLOCK = new SlimefunItemStack(
        "INFINITY_BLOCK",
        Material.SMOOTH_QUARTZ,
        "&b无尽块"
    );
    public static final SlimefunItemStack INFINITY_SINGULARITY = new SlimefunItemStack(
            "INFINITY_SINGULARITY",
            Material.SMOOTH_QUARTZ,
            "&b无尽奇点"
    );
    public static final SlimefunItemStack BASIC_STRAINER = new SlimefunItemStack(
            "BASIC_STRAINER",
            Material.FISHING_ROD,
            "&9基础滤网",
            "&7从水流中收集材料",
            "",
            LoreBuilder.speed(1)
    );
    public static final SlimefunItemStack ADVANCED_STRAINER = new SlimefunItemStack(
            "ADVANCED_STRAINER",
            Material.FISHING_ROD,
            "&c高级滤网",
            "&7从水流中收集材料",
            "",
            LoreBuilder.speed(4)
    );
    public static final SlimefunItemStack REINFORCED_STRAINER = new SlimefunItemStack(
            "REINFORCED_STRAINER",
            Material.FISHING_ROD,
            "&f强化合金滤网",
            "&7从水流中收集材料",
            "",
            LoreBuilder.speed(20)
    );

    public static void setup(InfinityExpansion plugin) {
        new EnderEssence(Groups.MAIN_MATERIALS, ENDER_ESSENCE, new NamespacedKey(plugin, "ender_essence")).register(plugin);
        registerEnhanced(COBBLE_1, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE)
        });
        registerEnhanced(COBBLE_2, new ItemStack[] {
                COBBLE_1, COBBLE_1, COBBLE_1,
                COBBLE_1, COBBLE_1, COBBLE_1,
                COBBLE_1, COBBLE_1, COBBLE_1
        });
        registerEnhanced(COBBLE_3, new ItemStack[] {
                COBBLE_2, COBBLE_2, COBBLE_2,
                COBBLE_2, COBBLE_2, COBBLE_2,
                COBBLE_2, COBBLE_2, COBBLE_2
        });
        registerEnhanced(COBBLE_4, new ItemStack[] {
                COBBLE_3, COBBLE_3, COBBLE_3,
                COBBLE_3, COBBLE_3, COBBLE_3,
                COBBLE_3, COBBLE_3, COBBLE_3
        });
        registerEnhanced(COBBLE_5, new ItemStack[] {
                COBBLE_4, COBBLE_4, COBBLE_4,
                COBBLE_4, COBBLE_4, COBBLE_4,
                COBBLE_4, COBBLE_4, COBBLE_4
        });
        registerEnhanced(VOID_DUST, new ItemStack[] {
                VOID_BIT, VOID_BIT, VOID_BIT,
                VOID_BIT, VOID_BIT, VOID_BIT,
                VOID_BIT, VOID_BIT, VOID_BIT
        });
        registerEnhanced(VOID_INGOT, new ItemStack[] {
                VOID_DUST, VOID_DUST, VOID_DUST,
                VOID_DUST, VOID_DUST, VOID_DUST,
                VOID_DUST, VOID_DUST, VOID_DUST
        });
        registerEnhanced(COPPER_BLCOK, new ItemStack[] {
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT
        });
        registerEnhanced(ZINC_BLOCK, new ItemStack[] {
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT,
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT,
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT
        });
        registerEnhanced(TIN_BLOCK, new ItemStack[] {
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT,
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT,
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT
        });
        registerEnhanced(ALUMINUM_BLOCK, new ItemStack[] {
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT,
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT,
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT
        });
        registerEnhanced(SILVER_BLOCK, new ItemStack[] {
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT,
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT,
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT
        });
        registerEnhanced(MAGNESIUM_BLOCK, new ItemStack[] {
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT,
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT,
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT
        });
        registerEnhanced(LEAD_BLOCK, new ItemStack[] {
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT
        });
        registerEnhanced(RANDOM_NETHER_TEMPLATE, new ItemStack[] {
            new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.NETHERITE_INGOT),
            new ItemStack(Material.NETHERITE_INGOT), VOID_INGOT, new ItemStack(Material.NETHERITE_INGOT),
            new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.NETHERITE_INGOT)
        });
        registerSmeltery(INFINITE_INGOT, EARTH_SINGULARITY, MYTHRIL, FORTUNE_SINGULARITY, MAGIC_SINGULARITY, VOID_INGOT, METAL_SINGULARITY);
        registerSmeltery(FORTUNE_SINGULARITY, GOLD_SINGULARITY, DIAMOND_SINGULARITY, EMERALD_SINGULARITY, NETHERITE_SINGULARITY, ADAMANTITE);
        registerSmeltery(MAGIC_SINGULARITY, REDSTONE_SINGULARITY, LAPIS_SINGULARITY, QUARTZ_SINGULARITY, MAGNESIUM_SINGULARITY, MAGNONIUM);
        registerSmeltery(EARTH_SINGULARITY, COBBLE_4, COAL_SINGULARITY, IRON_SINGULARITY, COPPER_SINGULARITY, LEAD_SINGULARITY);
        registerSmeltery(METAL_SINGULARITY, SILVER_SINGULARITY, ALUMINUM_SINGULARITY, TIN_SINGULARITY, ZINC_SINGULARITY, TITANIUM);
        registerSmeltery(MAGSTEEL, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.MAGNESIUM_DUST);
        registerSmeltery(TITANIUM, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(MYTHRIL, SlimefunItems.REINFORCED_ALLOY_INGOT, IRON_SINGULARITY, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(ADAMANTITE, SlimefunItems.REDSTONE_ALLOY, DIAMOND_SINGULARITY, MAGSTEEL);
        registerSmeltery(MAGNONIUM, MAGSTEEL, MAGNESIUM_SINGULARITY, ENDER_ESSENCE);
        register(VOID_BIT, VoidHarvester.TYPE, new ItemStack[0]);
        registerEnhanced(MAGSTEEL_PLATE, new ItemStack[] {
                MAGSTEEL, MAGSTEEL, MAGSTEEL,
                MAGSTEEL, SlimefunItems.HARDENED_METAL_INGOT, MAGSTEEL,
                MAGSTEEL, MAGSTEEL, MAGSTEEL
        });
        registerEnhanced(INFINITY_BLOCK, new ItemStack[] {
            INFINITE_INGOT, INFINITE_INGOT, INFINITE_INGOT,
            INFINITE_INGOT, INFINITE_INGOT, INFINITE_INGOT,
            INFINITE_INGOT, INFINITE_INGOT, INFINITE_INGOT
        });
        registerEnhanced(MACHINE_CIRCUIT, new ItemStack[] {
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.SILICON, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT
        });
        new Strainer(BASIC_STRAINER, new ItemStack[] {
                new ItemStack(Material.STICK), new ItemStack(Material.STRING), new ItemStack(Material.STICK),
                new ItemStack(Material.STRING), new ItemStack(Material.STICK), new ItemStack(Material.STRING),
                new ItemStack(Material.STICK), new ItemStack(Material.STRING), new ItemStack(Material.STICK),
        }, 1).register(plugin);
        new Strainer(ADVANCED_STRAINER, new ItemStack[] {
                Materials.MAGSTEEL, new ItemStack(Material.STRING), Materials.MAGSTEEL,
                new ItemStack(Material.STRING), BASIC_STRAINER, new ItemStack(Material.STRING),
                Materials.MAGSTEEL, new ItemStack(Material.STRING), Materials.MAGSTEEL
        }, 4).register(plugin);
        new Strainer(REINFORCED_STRAINER, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT,
                new ItemStack(Material.STRING), ADVANCED_STRAINER, new ItemStack(Material.STRING),
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT
        }, 20).register(plugin);
        registerEnhanced(MACHINE_CORE, new ItemStack[] {
                TITANIUM, MACHINE_CIRCUIT, TITANIUM,
                MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CIRCUIT,
                TITANIUM, MACHINE_CIRCUIT, TITANIUM
        });
        registerEnhanced(MACHINE_PLATE, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT,
                MAGSTEEL_PLATE, TITANIUM, MAGSTEEL_PLATE,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT
        });
        register(Groups.INFINITY_CHEAT, INFINITE_CIRCUIT, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                INFINITE_INGOT, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITE_INGOT,
                INFINITE_INGOT, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITE_INGOT,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT
        });
        register(Groups.INFINITY_CHEAT, INFINITE_CORE, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_PLATE, MACHINE_CORE, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CORE, MACHINE_PLATE,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT,
                INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                MACHINE_PLATE, MACHINE_CORE, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CORE, MACHINE_PLATE
        });
        new Singularity(COPPER_SINGULARITY, COPPER_BLCOK, 3000).register(plugin);
        new Singularity(ZINC_SINGULARITY, ZINC_BLOCK, 3000).register(plugin);
        new Singularity(TIN_SINGULARITY, TIN_BLOCK, 3000).register(plugin);
        new Singularity(ALUMINUM_SINGULARITY, ALUMINUM_BLOCK, 3000).register(plugin);
        new Singularity(SILVER_SINGULARITY, SILVER_BLOCK, 3000).register(plugin);
        new Singularity(MAGNESIUM_SINGULARITY, MAGNESIUM_BLOCK, 3000).register(plugin);
        new Singularity(LEAD_SINGULARITY, LEAD_BLOCK, 3000).register(plugin);
        new Singularity(GOLD_SINGULARITY, Material.GOLD_BLOCK, 2000).register(plugin);
        new Singularity(IRON_SINGULARITY, Material.IRON_BLOCK, 2000).register(plugin);
        new Singularity(DIAMOND_SINGULARITY, Material.DIAMOND_BLOCK, 500).register(plugin);
        new Singularity(EMERALD_SINGULARITY, Material.EMERALD_BLOCK, 500).register(plugin);
        new Singularity(NETHERITE_SINGULARITY, Material.NETHERITE_BLOCK, 200).register(plugin);
        new Singularity(COAL_SINGULARITY, Material.COAL_BLOCK, 1500).register(plugin);
        new Singularity(REDSTONE_SINGULARITY, Material.REDSTONE_BLOCK, 1500).register(plugin);
        new Singularity(LAPIS_SINGULARITY, Material.LAPIS_BLOCK, 1500).register(plugin);
        new Singularity(QUARTZ_SINGULARITY, Material.QUARTZ_BLOCK, 1500).register(plugin);
        new Singularity(INFINITY_SINGULARITY, INFINITE_INGOT, 80).register(plugin);
    }

    private static void registerEnhanced(SlimefunItemStack item, ItemStack[] recipe) {
        register(item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }

    private static void registerSmeltery(SlimefunItemStack itemStack, ItemStack... recipe) {
        register(itemStack, RecipeType.SMELTERY, Arrays.copyOf(recipe, 9));
    }

    private static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
        register(Groups.MAIN_MATERIALS, itemStack, type, recipe);
    }

    private static void register(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        new SimpleMaterial(category, item, recipeType, recipe).register(InfinityExpansion.instance());
    }

}
