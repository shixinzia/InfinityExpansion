package io.github.mooy1.infinityexpansion.items.machines;

import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.SlimefunExtension;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinitylib.machines.MachineBlock;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class Machines {

    public static final SlimefunItemStack COBBLE_PRESS = new SlimefunItemStack(
            "COBBLE_PRESS",
            Material.SMOOTH_STONE,
            "&8圆石压缩机",
            "&7高效压缩圆石",
            "",
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack RESOURCE_SYNTHESIZER = new SlimefunItemStack(
            "RESOURCE_SYNTHESIZER",
            Material.LODESTONE,
            "&6资源合成器",
            "&7通过两种材料合成资源",
            "",
            MachineLore.energy(1_000_000) + "每次使用"
    );
    public static final SlimefunItemStack RANDOM_MACHINE = new SlimefunItemStack(
        "RANDOM_MACHINE",
        Material.LODESTONE,
        "&6随机机器",
        "&7通过特定配方来随机产出物品",
        "",
        MachineLore.speed(1),
        MachineLore.energy(1000)
    );
    public static final SlimefunItemStack BASIC_GROWER = new SlimefunItemStack(
            "BASIC_VIRTUAL_FARM",
            Material.GRASS_BLOCK,
            "&9基础&a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(18)
    );
    public static final SlimefunItemStack ADVANCED_GROWER = new SlimefunItemStack(
            "ADVANCED_VIRTUAL_FARM",
            Material.CRIMSON_NYLIUM,
            "&c高级&a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(5),
            MachineLore.energyPerSecond(90)
    );
    public static final SlimefunItemStack INFINITY_GROWER = new SlimefunItemStack(
            "INFINITY_VIRTUAL_FARM",
            Material.WARPED_NYLIUM,
            "&b无尽&a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(400),
            MachineLore.energyPerSecond(900)
    );
    public static final SlimefunItemStack BASIC_TREE = new SlimefunItemStack(
            "BASIC_TREE_GROWER",
            Material.STRIPPED_OAK_WOOD,
            "&9基础&2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(36)
    );
    public static final SlimefunItemStack ADVANCED_TREE = new SlimefunItemStack(
            "ADVANCED_TREE_GROWER",
            Material.STRIPPED_ACACIA_WOOD,
            "&c高级&2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(5),
            MachineLore.energyPerSecond(180)
    );
    public static final SlimefunItemStack INFINITY_TREE = new SlimefunItemStack(
            "INFINITY_TREE_GROWER",
            Material.STRIPPED_WARPED_HYPHAE,
            "&b无尽&2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(400),
            MachineLore.energyPerSecond(1800)
    );public static final SlimefunItemStack BASIC_FLOWER = new SlimefunItemStack(
        "BASIC_FLOWER_GROWER",
        Material.LIME_STAINED_GLASS,
        "&9基础&2自动养花机",
        "&7自动种植、收获和再种植各种花",
        "",
        MachineLore.speed(1),
        MachineLore.energyPerSecond(36)
    );
    public static final SlimefunItemStack ADVANCED_FLOWER = new SlimefunItemStack(
        "ADVANCED_FLOWER_GROWER",
        Material.LIME_STAINED_GLASS,
        "&c高级&2自动养花机",
        "&7自动种植、收获和再种植各种花",
        "",
        MachineLore.speed(5),
        MachineLore.energyPerSecond(180)
    );
    public static final SlimefunItemStack INFINITY_FLOWER = new SlimefunItemStack(
        "INFINITY_FLOWER_GROWER",
        Material.LIME_STAINED_GLASS,
        "&b无尽&2自动养花机",
        "&7自动种植、收获和再种植各种花",
        "",
        MachineLore.speed(400),
        MachineLore.energyPerSecond(1800)
    );
    private static final int BEDROCK_ENERGY = 10_000;
    public static final SlimefunItemStack POWERED_BEDROCK = new SlimefunItemStack(
            "POWERED_BEDROCK",
            Material.NETHERITE_BLOCK,
            "&4充能基岩",
            "&7通电后变成基岩",
            "&7失去充能后可被破坏",
            "",
            MachineLore.energyPerSecond(BEDROCK_ENERGY)
    );
    private static final int GEO_QUARRY_INTERVAL = 400;
    private static final int GEO_QUARRY_ENERGY = 450;
    private static final int GEO_INFINITY_QUARRY_INTERVAL = 5;
    private static final int GEO_INFINITY_QUARRY_ENERGY = 45000;
    public static final SlimefunItemStack GEO_QUARRY = new SlimefunItemStack(
            "GEO_QUARRY",
            Material.QUARTZ_BRICKS,
            "&f地理资源矿机",
            "&7利用电力缓慢获取地理资源",
            "&7无需地形扫描",
            "&7不受剩余地理资源数量影响",
            "",
            MachineLore.energyPerSecond(GEO_QUARRY_ENERGY)
    );
    public static final SlimefunItemStack GEO_INFINITY_QUARRY = new SlimefunItemStack(
        "GEO_INFINITY_QUARRY",
        Material.QUARTZ_BRICKS,
        "&f无尽地理资源矿机",
        "&7效率80x",
        "&7利用电力快速获取地理资源",
        "&7无需地形扫描",
        "&7不受剩余地理资源数量影响",
        "",
        MachineLore.energyPerSecond(GEO_INFINITY_QUARRY_ENERGY)
    );
    public static final SlimefunItemStack EXTREME_FREEZER = new SlimefunItemStack(
            "EXTREME_FREEZER",
            Material.LIGHT_BLUE_CONCRETE,
            "&b极寒冰柜",
            "&7将冰转化为冷却剂",
            "&7将岩浆块转化为下界冰冷却剂",
            "",
            MachineLore.energyPerSecond(90)
    );
    public static final SlimefunItemStack DUST_EXTRACTOR = new SlimefunItemStack(
            "DUST_EXTRACTOR",
            Material.FURNACE,
            "&8磨粉机",
            "&7将圆石变为矿粉",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_DUST_EXTRACTOR = new SlimefunItemStack(
            "INFINITY_DUST_EXTRACTOR",
            Material.FURNACE,
            "&b无尽&8磨粉机",
            "&7将圆石变为矿粉",
            "",
            MachineLore.speed(16),
            MachineLore.energyPerSecond(7200)
    );
    public static final SlimefunItemStack INGOT_FORMER = new SlimefunItemStack(
            "INGOT_FORMER",
            Material.FURNACE,
            "&8铸锭机",
            "&7将矿粉变为锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_INGOT_FORMER = new SlimefunItemStack(
            "INFINITY_INGOT_FORMER",
            Material.FURNACE,
            "&b无尽&8铸锭机",
            "&7将矿粉变为锭",
            "",
            MachineLore.speed(16),
            MachineLore.energyPerSecond(7200)
    );
    public static final SlimefunItemStack BLOCK_CASTING_MACHINE = new SlimefunItemStack(
        "BLOCK_CASTING_MACHINE",
        Material.FURNACE,
        "&8铸块机",
        MachineLore.speed(8),
        MachineLore.energyPerSecond(512)
    );
    public static final SlimefunItemStack URANIUM_EXTRACTOR = new SlimefunItemStack(
            "URANIUM_EXTRACTOR",
            Material.LIME_CONCRETE,
            "&a铀提取器",
            "&7将圆石变为铀",
            "",
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack DECOMPRESSOR = new SlimefunItemStack(
            "DECOMPRESSOR",
            Material.TARGET,
            "&7分解机",
            "&7将方块还原成基础材料",
            "",
            MachineLore.energyPerSecond(60)
    );
    private static final int GEAR_TRANSFORMER_ENERGY = 12000;
    public static final SlimefunItemStack GEAR_TRANSFORMER = new SlimefunItemStack(
            "GEAR_TRANSFORMER",
            Material.EMERALD_BLOCK,
            "&7装备材质转换器",
            "&7改变原版工具或装备的材质",
            "",
            MachineLore.energy(GEAR_TRANSFORMER_ENERGY) + "每次使用"
    );
    public static final SlimefunItemStack BASIC_COBBLE = new SlimefunItemStack(
            "BASIC_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&9基础&8圆石生成器",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(24)
    );
    public static final SlimefunItemStack ADVANCED_COBBLE = new SlimefunItemStack(
            "ADVANCED_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c高级&8圆石生成器",
            "",
            MachineLore.speed(4),
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_COBBLE = new SlimefunItemStack(
            "INFINITY_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c无尽&8圆石生成器",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(800)
    );
    public static final SlimefunItemStack BASIC_OBSIDIAN = new SlimefunItemStack(
            "BASIC_OBSIDIAN_GEN",
            Material.SMOOTH_STONE,
            "&8黑曜石生成器",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack SINGULARITY_CONSTRUCTOR = new SlimefunItemStack(
            "SINGULARITY_CONSTRUCTOR",
            Material.QUARTZ_BRICKS,
            "&f奇点构造机",
            "&7凝聚大量资源",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_CONSTRUCTOR = new SlimefunItemStack(
            "INFINITY_CONSTRUCTOR",
            Material.CHISELED_QUARTZ_BLOCK,
            "&b无尽&f奇点构造机",
            "&7快速凝聚大量资源",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(1200)
    );
    public static final SlimefunItemStack STONEWORKS_FACTORY = new SlimefunItemStack(
            "STONEWORKS_FACTORY",
            Material.BLAST_FURNACE,
            "&8石材厂",
            "&7生成圆石并将其加工成各种材料",
            "",
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack VOID_HARVESTER = new SlimefunItemStack(
            "VOID_HARVESTER",
            Material.OBSIDIAN,
            "&8虚空收集者",
            "&7从虚无中缓慢收集&8虚空粒",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack ADVANCED_VOID_HARVESTER = new SlimefunItemStack(
        "ADVANCED_VOID_HARVESTER",
        Material.OBSIDIAN,
        "&c高级&8虚空收集者",
        "&7从虚无中缓慢收集&8虚空粒",
        "",
        MachineLore.speed(32),
        MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITE_VOID_HARVESTER = new SlimefunItemStack(
            "INFINITE_VOID_HARVESTER",
            Material.CRYING_OBSIDIAN,
            "&b无尽&8虚空收集者",
            "&7从虚无中收集&8虚空粉尘",
            "",
            MachineLore.speed(147456),
            MachineLore.energyPerSecond(12000)
    );
    public static final SlimefunItemStack CONCRETE_MOLDING_MACHINE = new SlimefunItemStack(
        "CONCRETE_MOLDING_MACHINE",
        Material.FURNACE,
        "&8混凝土浇筑机",
        "&7全自动浇筑混凝土",
        "",
        MachineLore.speed(8),
        MachineLore.energyPerSecond(80)
    );

    public static void setup(InfinityExpansion plugin) {
        new VoidHarvester(Groups.ADVANCED_MACHINES, VOID_HARVESTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.TITANIUM, Materials.TITANIUM, Materials.TITANIUM,
                Materials.MACHINE_PLATE, SlimefunItems.GEO_MINER, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 1).energyPerTick(120).register(plugin);
        new VoidHarvester(Groups.ADVANCED_MACHINES, ADVANCED_VOID_HARVESTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            Materials.TITANIUM, Materials.TITANIUM, Materials.TITANIUM,
            Materials.MACHINE_PLATE, VOID_HARVESTER, Materials.MACHINE_PLATE,
            Materials.VOID_INGOT, Materials.MACHINE_CORE, Materials.VOID_INGOT
        }, 32).energyPerTick(480).register(plugin);
        new InfinityVoidHarvester(Groups.INFINITY_CHEAT, INFINITE_VOID_HARVESTER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, ADVANCED_VOID_HARVESTER, ADVANCED_VOID_HARVESTER, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE
        }, 1024).energyPerTick(6000).register(plugin);
        new StoneworksFactory(Groups.ADVANCED_MACHINES, STONEWORKS_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                SlimefunItems.ELECTRIC_FURNACE_3, Materials.MACHINE_CIRCUIT, SlimefunItems.ELECTRIC_ORE_GRINDER,
                Materials.MAGSTEEL_PLATE, SlimefunItems.ELECTRIC_PRESS, Materials.MAGSTEEL_PLATE
        }).energyPerTick(240).register(plugin);

        new SingularityConstructor(Groups.ADVANCED_MACHINES, SINGULARITY_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, Materials.MAGSTEEL, Materials.MAGSTEEL,
                Materials.MACHINE_PLATE, SlimefunItems.CARBON_PRESS_3, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).speed(1).energyPerTick(120).register(plugin);
        new SingularityConstructor(Groups.INFINITY_CHEAT, INFINITY_CONSTRUCTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                null, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, null,
                null, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT
        }).speed(64).energyPerTick(1200).register(plugin);

        new ResourceSynthesizer(Groups.ADVANCED_MACHINES, RESOURCE_SYNTHESIZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.ADAMANTITE, Materials.ADAMANTITE, Materials.ADAMANTITE,
                Materials.MACHINE_PLATE, SlimefunItems.REINFORCED_FURNACE, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.MACHINE_CORE, Materials.MACHINE_PLATE
        }).recipes(new SlimefunItemStack[] {
                Materials.IRON_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 32),
                Materials.IRON_SINGULARITY, Materials.REDSTONE_SINGULARITY, new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 32),
                Materials.DIAMOND_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.CARBONADO, 16),
                Materials.GOLD_SINGULARITY, Materials.EMERALD_SINGULARITY, new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 16),
                Materials.COPPER_SINGULARITY, Materials.ZINC_SINGULARITY, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 64),
                Materials.IRON_SINGULARITY, Materials.QUARTZ_SINGULARITY, new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64)
        }).energyPerTick(1_000_000).register(plugin);

        new PoweredBedrock(Groups.INFINITY_CHEAT, POWERED_BEDROCK, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5
        }, BEDROCK_ENERGY).register(plugin);
        new MaterialGenerator(Groups.BASIC_MACHINES, BASIC_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_PICKAXE), Materials.MAGSTEEL,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_2, new ItemStack(Material.LAVA_BUCKET),
                Materials.MAGSTEEL, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL
        }).material(Material.COBBLESTONE).speed(1).energyPerTick(24).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, ADVANCED_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_3, new ItemStack(Material.LAVA_BUCKET),
                Materials.MACHINE_CIRCUIT, BASIC_COBBLE, Materials.MACHINE_CIRCUIT
        }).material(Material.COBBLESTONE).speed(4).energyPerTick(75).register(plugin);
        new MaterialGenerator(Groups.INFINITY_CHEAT, INFINITY_COBBLE, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT
        }).material(Material.COBBLESTONE).speed(64).energyPerTick(800).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, BASIC_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FLUID_PUMP, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.FLUID_PUMP,
                new ItemStack(Material.DISPENSER), Materials.VOID_INGOT, new ItemStack(Material.DISPENSER),
                Materials.MACHINE_CIRCUIT, ADVANCED_COBBLE, Materials.MACHINE_CIRCUIT
        }).material(Material.OBSIDIAN).speed(1).energyPerTick(240).register(plugin);

        EnumMap<Material, ItemStack[]> crops = new EnumMap<>(Material.class);
        crops.put(Material.WHEAT_SEEDS, new ItemStack[] {new ItemStack(Material.WHEAT, 5), new ItemStack(Material.WHEAT_SEEDS, 2)});
        crops.put(Material.CARROT, new ItemStack[] { new ItemStack(Material.CARROT, 6) });
        crops.put(Material.POTATO, new ItemStack[] { new ItemStack(Material.POTATO, 6) });
        crops.put(Material.BEETROOT_SEEDS, new ItemStack[] { new ItemStack(Material.BEETROOT, 4) });
        crops.put(Material.PUMPKIN_SEEDS, new ItemStack[] { new ItemStack(Material.PUMPKIN, 2) });
        crops.put(Material.MELON_SEEDS, new ItemStack[] { new ItemStack(Material.MELON, 2) });
        crops.put(Material.SUGAR_CANE, new ItemStack[] { new ItemStack(Material.SUGAR_CANE, 8) });
        crops.put(Material.COCOA_BEANS, new ItemStack[] { new ItemStack(Material.COCOA_BEANS, 4) });
        crops.put(Material.CACTUS, new ItemStack[] { new ItemStack(Material.CACTUS, 4) });
        crops.put(Material.BAMBOO, new ItemStack[] { new ItemStack(Material.BAMBOO, 8) });
        crops.put(Material.CHORUS_FLOWER, new ItemStack[] { new ItemStack(Material.CHORUS_FRUIT, 8) });
        crops.put(Material.NETHER_WART, new ItemStack[] { new ItemStack(Material.NETHER_WART, 8) });
        crops.put(Material.SWEET_BERRIES, new ItemStack[] { new ItemStack(Material.SWEET_BERRIES,8)});

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_HOE), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.GRASS_BLOCK), Materials.MACHINE_CIRCUIT
        }).recipes(crops).ticksPerOutput(120).energyPerTick(18).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.ENDER_ESSENCE, BASIC_GROWER, Materials.ENDER_ESSENCE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).recipes(crops).ticksPerOutput(30).energyPerTick(90).register(plugin);

        EnumMap<Material, ItemStack[]> cropspro = new EnumMap<>(Material.class);
        cropspro.put(Material.WHEAT_SEEDS, new ItemStack[] { new ItemStack(Material.WHEAT, 64), new ItemStack(Material.WHEAT,32), new ItemStack(Material.WHEAT_SEEDS,64)});
        cropspro.put(Material.CARROT, new ItemStack[] { new ItemStack(Material.CARROT, 64), new ItemStack(Material.CARROT, 32)});
        cropspro.put(Material.POTATO, new ItemStack[] { new ItemStack(Material.POTATO, 64), new ItemStack(Material.POTATO,32) });
        cropspro.put(Material.BEETROOT_SEEDS, new ItemStack[] { new ItemStack(Material.BEETROOT, 64), new ItemStack(Material.BEETROOT,32) });
        cropspro.put(Material.PUMPKIN_SEEDS, new ItemStack[] { new ItemStack(Material.PUMPKIN,48) });
        cropspro.put(Material.MELON_SEEDS, new ItemStack[] { new ItemStack(Material.MELON,48) });
        cropspro.put(Material.SUGAR_CANE, new ItemStack[] { new ItemStack(Material.SUGAR_CANE, 64), new ItemStack(Material.SUGAR_CANE,32) });
        cropspro.put(Material.COCOA_BEANS, new ItemStack[] { new ItemStack(Material.COCOA_BEANS, 64), new ItemStack(Material.COCOA_BEANS,32) });
        cropspro.put(Material.CACTUS, new ItemStack[] { new ItemStack(Material.CACTUS, 64), new ItemStack(Material.CACTUS,32) });
        cropspro.put(Material.BAMBOO, new ItemStack[] { new ItemStack(Material.BAMBOO, 64), new ItemStack(Material.BAMBOO,64), new ItemStack(Material.BAMBOO,64) });
        cropspro.put(Material.CHORUS_FLOWER, new ItemStack[] { new ItemStack(Material.CHORUS_FRUIT, 64), new ItemStack(Material.CHORUS_FRUIT,32) });
        cropspro.put(Material.NETHER_WART, new ItemStack[] { new ItemStack(Material.NETHER_WART, 64), new ItemStack(Material.NETHER_WART,32) });
        cropspro.put(Material.SWEET_BERRIES, new ItemStack[] { new ItemStack(Material.SWEET_BERRIES,64), new ItemStack(Material.SWEET_BERRIES,32)});


        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_GROWER, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, ADVANCED_GROWER, ADVANCED_GROWER, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }).recipes(cropspro).ticksPerOutput(2).energyPerTick(900).register(plugin);

        EnumMap<Material, ItemStack[]> flowers = new EnumMap<>(Material.class);

        flowers.put(Material.GRASS, new ItemStack[] {
            new ItemStack(Material.GRASS, 4)});
        flowers.put(Material.FERN, new ItemStack[] {
            new ItemStack(Material.FERN, 4)});
        flowers.put(Material.DEAD_BUSH, new ItemStack[] {
            new ItemStack(Material.DEAD_BUSH, 4)});
        flowers.put(Material.DANDELION, new ItemStack[] {
            new ItemStack(Material.DANDELION, 4)});
        flowers.put(Material.POPPY, new ItemStack[] {
            new ItemStack(Material.POPPY, 4)});
        flowers.put(Material.BLUE_ORCHID, new ItemStack[] {
            new ItemStack(Material.BLUE_ORCHID, 4)});
        flowers.put(Material.ALLIUM, new ItemStack[] {
            new ItemStack(Material.ALLIUM, 4)});
        flowers.put(Material.AZURE_BLUET, new ItemStack[] {
            new ItemStack(Material.AZURE_BLUET, 4)});
        flowers.put(Material.RED_TULIP, new ItemStack[] {
            new ItemStack(Material.RED_TULIP, 4)});
        flowers.put(Material.ORANGE_TULIP, new ItemStack[] {
            new ItemStack(Material.ORANGE_TULIP, 4)});
        flowers.put(Material.WHITE_TULIP, new ItemStack[] {
            new ItemStack(Material.WHITE_TULIP, 4)});
        flowers.put(Material.PINK_TULIP, new ItemStack[] {
            new ItemStack(Material.PINK_TULIP, 4)});
        flowers.put(Material.OXEYE_DAISY, new ItemStack[] {
            new ItemStack(Material.OXEYE_DAISY, 4)});
        flowers.put(Material.CORNFLOWER, new ItemStack[] {
            new ItemStack(Material.CORNFLOWER, 4)});
        flowers.put(Material.LILY_OF_THE_VALLEY, new ItemStack[] {
            new ItemStack(Material.LILY_OF_THE_VALLEY, 4)});
        flowers.put(Material.WITHER_ROSE, new ItemStack[] {
            new ItemStack(Material.WITHER_ROSE, 4)});
        flowers.put(Material.PINK_PETALS, new ItemStack[] {
            new ItemStack(Material.PINK_PETALS, 4)});
        flowers.put(Material.SPORE_BLOSSOM, new ItemStack[] {
            new ItemStack(Material.SPORE_BLOSSOM, 4)});
        flowers.put(Material.WEEPING_VINES, new ItemStack[] {
            new ItemStack(Material.WEEPING_VINES, 4)});
        flowers.put(Material.TWISTING_VINES, new ItemStack[] {
            new ItemStack(Material.TWISTING_VINES, 4)});
        flowers.put(Material.VINE, new ItemStack[] {
            new ItemStack(Material.VINE, 4)});
        flowers.put(Material.TALL_GRASS, new ItemStack[] {
            new ItemStack(Material.TALL_GRASS, 4)});
        flowers.put(Material.LARGE_FERN, new ItemStack[] {
            new ItemStack(Material.LARGE_FERN, 4)});
        flowers.put(Material.SUNFLOWER, new ItemStack[] {
            new ItemStack(Material.SUNFLOWER, 4)});
        flowers.put(Material.LILAC, new ItemStack[] {
            new ItemStack(Material.LILAC, 4)});
        flowers.put(Material.ROSE_BUSH, new ItemStack[] {
            new ItemStack(Material.ROSE_BUSH, 4)});
        flowers.put(Material.PEONY, new ItemStack[] {
            new ItemStack(Material.PEONY, 4)});
        flowers.put(Material.CHORUS_FLOWER, new ItemStack[] {
            new ItemStack(Material.CHORUS_FLOWER, 4)});
        flowers.put(Material.GLOW_LICHEN, new ItemStack[] {
            new ItemStack(Material.GLOW_LICHEN, 4)});
        flowers.put(Material.LILY_PAD, new ItemStack[] {
            new ItemStack(Material.GRASS, 4)});

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_FLOWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
            Materials.MAGSTEEL, new ItemStack(Material.POPPY), Materials.MAGSTEEL,
            Materials.MACHINE_CIRCUIT, new ItemStack(Material.GRASS_BLOCK), Materials.MACHINE_CIRCUIT
        }).recipes(flowers).ticksPerOutput(120).energyPerTick(18).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_FLOWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
            Materials.ENDER_ESSENCE, BASIC_FLOWER, Materials.ENDER_ESSENCE,
            Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).recipes(flowers).ticksPerOutput(30).energyPerTick(90).register(plugin);

        EnumMap<Material, ItemStack[]> flowerspro = new EnumMap<>(Material.class);

        flowerspro.put(Material.GRASS, new ItemStack[] {
            new ItemStack(Material.GRASS, 64)});
        flowerspro.put(Material.FERN, new ItemStack[] {
            new ItemStack(Material.FERN, 64)});
        flowerspro.put(Material.DEAD_BUSH, new ItemStack[] {
            new ItemStack(Material.DEAD_BUSH, 64)});
        flowerspro.put(Material.DANDELION, new ItemStack[] {
            new ItemStack(Material.DANDELION, 64)});
        flowerspro.put(Material.POPPY, new ItemStack[] {
            new ItemStack(Material.POPPY, 64)});
        flowerspro.put(Material.BLUE_ORCHID, new ItemStack[] {
            new ItemStack(Material.BLUE_ORCHID, 64)});
        flowerspro.put(Material.ALLIUM, new ItemStack[] {
            new ItemStack(Material.ALLIUM, 64)});
        flowerspro.put(Material.AZURE_BLUET, new ItemStack[] {
            new ItemStack(Material.AZURE_BLUET, 64)});
        flowerspro.put(Material.RED_TULIP, new ItemStack[] {
            new ItemStack(Material.RED_TULIP, 64)});
        flowerspro.put(Material.ORANGE_TULIP, new ItemStack[] {
            new ItemStack(Material.ORANGE_TULIP, 64)});
        flowerspro.put(Material.WHITE_TULIP, new ItemStack[] {
            new ItemStack(Material.WHITE_TULIP, 64)});
        flowerspro.put(Material.PINK_TULIP, new ItemStack[] {
            new ItemStack(Material.PINK_TULIP, 64)});
        flowerspro.put(Material.OXEYE_DAISY, new ItemStack[] {
            new ItemStack(Material.OXEYE_DAISY, 64)});
        flowerspro.put(Material.CORNFLOWER, new ItemStack[] {
            new ItemStack(Material.CORNFLOWER, 64)});
        flowerspro.put(Material.LILY_OF_THE_VALLEY, new ItemStack[] {
            new ItemStack(Material.LILY_OF_THE_VALLEY, 64)});
        flowerspro.put(Material.WITHER_ROSE, new ItemStack[] {
            new ItemStack(Material.WITHER_ROSE, 64)});
        flowerspro.put(Material.PINK_PETALS, new ItemStack[] {
            new ItemStack(Material.PINK_PETALS, 64)});
        flowerspro.put(Material.SPORE_BLOSSOM, new ItemStack[] {
            new ItemStack(Material.SPORE_BLOSSOM, 64)});
        flowerspro.put(Material.WEEPING_VINES, new ItemStack[] {
            new ItemStack(Material.WEEPING_VINES, 64)});
        flowerspro.put(Material.TWISTING_VINES, new ItemStack[] {
            new ItemStack(Material.TWISTING_VINES, 64)});
        flowerspro.put(Material.VINE, new ItemStack[] {
            new ItemStack(Material.VINE, 64)});
        flowerspro.put(Material.TALL_GRASS, new ItemStack[] {
            new ItemStack(Material.TALL_GRASS, 64)});
        flowerspro.put(Material.LARGE_FERN, new ItemStack[] {
            new ItemStack(Material.LARGE_FERN, 64)});
        flowerspro.put(Material.SUNFLOWER, new ItemStack[] {
            new ItemStack(Material.SUNFLOWER, 64)});
        flowerspro.put(Material.LILAC, new ItemStack[] {
            new ItemStack(Material.LILAC, 64)});
        flowerspro.put(Material.ROSE_BUSH, new ItemStack[] {
            new ItemStack(Material.ROSE_BUSH, 64)});
        flowerspro.put(Material.PEONY, new ItemStack[] {
            new ItemStack(Material.PEONY, 64)});
        flowerspro.put(Material.CHORUS_FLOWER, new ItemStack[] {
            new ItemStack(Material.CHORUS_FLOWER, 64)});
        flowerspro.put(Material.GLOW_LICHEN, new ItemStack[] {
            new ItemStack(Material.GLOW_LICHEN, 64)});
        flowerspro.put(Material.LILY_PAD, new ItemStack[] {
            new ItemStack(Material.GRASS, 64)});

        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_FLOWER, InfinityWorkbench.TYPE, new ItemStack[] {
            new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
            new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
            new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
            new ItemStack(Material.GLASS), new ItemStack(Material.POPPY), new ItemStack(Material.POPPY), new ItemStack(Material.POPPY), new ItemStack(Material.POPPY), new ItemStack(Material.GLASS),
            Materials.MACHINE_PLATE, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, ADVANCED_FLOWER, ADVANCED_FLOWER, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, Materials.MACHINE_PLATE,
            Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }).recipes(flowerspro).ticksPerOutput(2).energyPerTick(900).register(plugin);


        EnumMap<Material, ItemStack[]> trees = new EnumMap<>(Material.class);

        trees.put(Material.OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.OAK_LEAVES, 8), new ItemStack(Material.OAK_LOG, 6), new ItemStack(Material.STICK), new ItemStack(Material.APPLE)
        });
        trees.put(Material.SPRUCE_SAPLING, new ItemStack[] {
                new ItemStack(Material.SPRUCE_LEAVES, 8), new ItemStack(Material.SPRUCE_LOG, 6), new ItemStack(Material.STICK, 2)
        });
        trees.put(Material.DARK_OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.DARK_OAK_LEAVES, 8), new ItemStack(Material.DARK_OAK_LOG, 6), new ItemStack(Material.APPLE)
        });
        trees.put(Material.BIRCH_SAPLING, new ItemStack[] {
                new ItemStack(Material.BIRCH_LEAVES, 8), new ItemStack(Material.BIRCH_LOG, 6)
        });
        trees.put(Material.ACACIA_SAPLING, new ItemStack[] {
                new ItemStack(Material.ACACIA_LEAVES, 8), new ItemStack(Material.ACACIA_LOG, 6)
        });
        trees.put(Material.JUNGLE_SAPLING, new ItemStack[] {
                new ItemStack(Material.JUNGLE_LEAVES, 8), new ItemStack(Material.JUNGLE_LOG, 6), new ItemStack(Material.COCOA_BEANS)
        });
        trees.put(Material.WARPED_FUNGUS, new ItemStack[] {
                new ItemStack(Material.WARPED_HYPHAE, 8), new ItemStack(Material.WARPED_STEM, 6), new ItemStack(Material.SHROOMLIGHT)
        });
        trees.put(Material.CRIMSON_FUNGUS, new ItemStack[] {
                new ItemStack(Material.CRIMSON_HYPHAE, 8), new ItemStack(Material.CRIMSON_STEM, 6), new ItemStack(Material.WEEPING_VINES)
        });
        trees.put(Material.CHERRY_SAPLING, new ItemStack[] {
            new ItemStack(Material.CHERRY_LEAVES,8), new ItemStack(Material.CHERRY_LEAVES,6), new ItemStack(Material.CHERRY_LOG,6)
        });
        trees.put(Material.MANGROVE_PROPAGULE, new ItemStack[] {
            new ItemStack(Material.MANGROVE_LEAVES,8), new ItemStack(Material.MANGROVE_LEAVES,2), new ItemStack(Material.MANGROVE_LOG,6), new ItemStack(Material.MANGROVE_ROOTS,4), new ItemStack(Material.MUDDY_MANGROVE_ROOTS,2)
        });

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.PODZOL), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, BASIC_GROWER, Materials.MACHINE_CIRCUIT
        }).recipes(trees).ticksPerOutput(120).energyPerTick(36).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.ENDER_ESSENCE, BASIC_TREE, Materials.ENDER_ESSENCE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).recipes(trees).ticksPerOutput(60).energyPerTick(180).register(plugin);

        EnumMap<Material, ItemStack[]> treespro = new EnumMap<>(Material.class);

        treespro.put(Material.OAK_SAPLING, new ItemStack[] {
            new ItemStack(Material.OAK_LEAVES, 64), new ItemStack(Material.OAK_LEAVES, 16), new ItemStack(Material.OAK_LOG, 60), new ItemStack(Material.STICK), new ItemStack(Material.APPLE,10)
        });
        treespro.put(Material.AZALEA, new ItemStack[] {
            new ItemStack(Material.AZALEA_LEAVES, 64), new ItemStack(Material.AZALEA_LEAVES, 16), new ItemStack(Material.OAK_LOG, 60)
        });
        treespro.put(Material.FLOWERING_AZALEA, new ItemStack[] {
            new ItemStack(Material.FLOWERING_AZALEA_LEAVES, 64), new ItemStack(Material.FLOWERING_AZALEA_LEAVES, 16), new ItemStack(Material.OAK_LOG, 60)
        });
        treespro.put(Material.SPRUCE_SAPLING, new ItemStack[] {
            new ItemStack(Material.SPRUCE_LEAVES, 64), new ItemStack(Material.SPRUCE_LEAVES, 16), new ItemStack(Material.SPRUCE_LOG, 60), new ItemStack(Material.STICK, 20)
        });
        treespro.put(Material.DARK_OAK_SAPLING, new ItemStack[] {
            new ItemStack(Material.DARK_OAK_LEAVES, 64), new ItemStack(Material.DARK_OAK_LEAVES, 16), new ItemStack(Material.DARK_OAK_LOG, 60), new ItemStack(Material.APPLE,10)
        });
        treespro.put(Material.BIRCH_SAPLING, new ItemStack[] {
            new ItemStack(Material.BIRCH_LEAVES, 64), new ItemStack(Material.BIRCH_LEAVES, 16), new ItemStack(Material.BIRCH_LOG, 60)
        });
        treespro.put(Material.ACACIA_SAPLING, new ItemStack[] {
            new ItemStack(Material.ACACIA_LEAVES, 64), new ItemStack(Material.ACACIA_LEAVES, 16), new ItemStack(Material.ACACIA_LOG, 60)
        });
        treespro.put(Material.JUNGLE_SAPLING, new ItemStack[] {
            new ItemStack(Material.JUNGLE_LEAVES, 64), new ItemStack(Material.JUNGLE_LEAVES, 16), new ItemStack(Material.JUNGLE_LOG, 60), new ItemStack(Material.COCOA_BEANS,10)
        });
        treespro.put(Material.WARPED_FUNGUS, new ItemStack[] {
            new ItemStack(Material.WARPED_HYPHAE, 64), new ItemStack(Material.WARPED_HYPHAE, 16), new ItemStack(Material.WARPED_STEM, 60), new ItemStack(Material.SHROOMLIGHT,10)
        });
        treespro.put(Material.CRIMSON_FUNGUS, new ItemStack[] {
            new ItemStack(Material.CRIMSON_HYPHAE, 64), new ItemStack(Material.CRIMSON_HYPHAE, 16), new ItemStack(Material.CRIMSON_STEM, 60), new ItemStack(Material.WEEPING_VINES,10)
        });
        treespro.put(Material.CHERRY_SAPLING, new ItemStack[] {
            new ItemStack(Material.CHERRY_LEAVES,64), new ItemStack(Material.CHERRY_LEAVES,16), new ItemStack(Material.CHERRY_LOG,60)
        });
        treespro.put(Material.MANGROVE_PROPAGULE, new ItemStack[] {
            new ItemStack(Material.MANGROVE_LEAVES,64), new ItemStack(Material.MANGROVE_LEAVES,16), new ItemStack(Material.MANGROVE_LOG,60), new ItemStack(Material.MANGROVE_ROOTS,40), new ItemStack(Material.MUDDY_MANGROVE_ROOTS,20)
        });

        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_TREE, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), ADVANCED_TREE, null, null, ADVANCED_TREE, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }).recipes(treespro).ticksPerOutput(2).energyPerTick(1800).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, EXTREME_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2,
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.FLUID_PUMP, new ItemStack(Material.WATER_BUCKET),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).addRecipe(SlimefunItems.NETHER_ICE_COOLANT_CELL, new ItemStack(Material.MAGMA_BLOCK, 2))
                .ticksPerOutput(1)
                .addRecipe(SlimefunItems.REACTOR_COOLANT_CELL, new ItemStack(Material.ICE, 2))
                .energyPerTick(90).register(plugin);

        RandomizedItemStack twoDust = new RandomizedItemStack(
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 2),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 2),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 2),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 2)
        );
        new MachineBlock(Groups.ADVANCED_MACHINES, DUST_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).ticksPerOutput(1).addRecipe(twoDust, new ItemStack(Material.COBBLESTONE, 4))
                .addRecipe(twoDust, new ItemStack(Material.ANDESITE, 4))
                .addRecipe(twoDust, new ItemStack(Material.STONE, 4))
                .addRecipe(twoDust, new ItemStack(Material.DIORITE, 4))
                .addRecipe(twoDust, new ItemStack(Material.GRANITE, 4))
                .energyPerTick(240).register(plugin);

        RandomizedItemStack sixtyFourDust = new RandomizedItemStack(
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 64),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64)
        );
        new MachineBlock(Groups.INFINITY_CHEAT, INFINITY_DUST_EXTRACTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }).addRecipe(sixtyFourDust, new ItemStack(Material.COBBLESTONE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.ANDESITE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.STONE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.DIORITE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.GRANITE, 64))
                .ticksPerOutput(1).energyPerTick(7200).register(plugin);

        RandomizedItemStack randomTemplate = new RandomizedItemStack(
            new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE,1),
            new ItemStack(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE,1),
            new ItemStack(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE,1)
        );
        new MachineBlock(Groups.ADVANCED_MACHINES, RANDOM_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, RESOURCE_SYNTHESIZER, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.RANDOM_NETHER_TEMPLATE, Materials.VOID_INGOT
        }).addRecipe(randomTemplate, new SlimefunItemStack(Materials.RANDOM_NETHER_TEMPLATE,8))
            .ticksPerOutput(10).energyPerTick(1000).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, COBBLE_PRESS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE,
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE
        }).addRecipe(new SlimefunItemStack(Materials.COBBLE_1, 8), new ItemStack(Material.COBBLESTONE, 64))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_2, 8), new SlimefunItemStack(Materials.COBBLE_1, 64))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_3, 8), new SlimefunItemStack(Materials.COBBLE_2, 64))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_4, 8), new SlimefunItemStack(Materials.COBBLE_3, 64))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_5, 8), new SlimefunItemStack(Materials.COBBLE_4, 64))
                .ticksPerOutput(1).energyPerTick(120).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, INGOT_FORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 8), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 8), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 8), new SlimefunItemStack(SlimefunItems.TIN_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 8), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 8), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 8), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 4), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 8))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 8), new SlimefunItemStack(SlimefunItems.IRON_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 8), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 8))
                .ticksPerOutput(1).energyPerTick(240).register(plugin);


        new MachineBlock(Groups.ADVANCED_MACHINES, BLOCK_CASTING_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            Materials.MACHINE_CIRCUIT, new ItemStack(Material.CRAFTING_TABLE), Materials.MACHINE_CIRCUIT,
            new ItemStack(Material.CRAFTING_TABLE), INGOT_FORMER, new ItemStack(Material.CRAFTING_TABLE),
            Materials.MACHINE_CIRCUIT, new ItemStack(Material.CRAFTING_TABLE), Materials.MACHINE_CIRCUIT,
        }).addRecipe( new SlimefunItemStack(Materials.COPPER_BLCOK,8), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.ZINC_BLOCK, 8), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.TIN_BLOCK, 8), new SlimefunItemStack(SlimefunItems.TIN_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.ALUMINUM_BLOCK, 8), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.LEAD_BLOCK, 8), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.SILVER_BLOCK, 8), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64))
            .addRecipe(new ItemStack(Material.GOLD_BLOCK, 8), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64))
            .addRecipe(new ItemStack(Material.IRON_BLOCK, 8), new SlimefunItemStack(SlimefunItems.IRON_DUST, 64))
            .addRecipe(new SlimefunItemStack(Materials.MAGNESIUM_BLOCK, 8), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64))
            .ticksPerOutput(1).energyPerTick(512).register(plugin);

        new MachineBlock(Groups.INFINITY_CHEAT, INFINITY_INGOT_FORMER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), new SlimefunItemStack(SlimefunItems.TIN_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 64), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 64), new SlimefunItemStack(SlimefunItems.IRON_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64))
                .ticksPerOutput(1).energyPerTick(7200).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, URANIUM_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ENHANCED_AUTO_CRAFTER,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.COBBLESTONE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.ANDESITE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.STONE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.DIORITE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.GRANITE, 4))
                .ticksPerOutput(1).energyPerTick(240).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, DECOMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.STICKY_PISTON), SlimefunItems.ELECTRIC_PRESS_2, new ItemStack(Material.STICKY_PISTON),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(new ItemStack(Material.EMERALD, 9), new ItemStack(Material.EMERALD_BLOCK))
                .addRecipe(new ItemStack(Material.DIAMOND, 9), new ItemStack(Material.DIAMOND_BLOCK))
                .addRecipe(new ItemStack(Material.GOLD_INGOT, 9), new ItemStack(Material.GOLD_BLOCK))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 9), new ItemStack(Material.IRON_BLOCK))
                .addRecipe(new ItemStack(Material.NETHERITE_INGOT, 9), new ItemStack(Material.NETHERITE_BLOCK))
                .addRecipe(new ItemStack(Material.REDSTONE, 9), new ItemStack(Material.REDSTONE_BLOCK))
                .addRecipe(new ItemStack(Material.QUARTZ, 4), new ItemStack(Material.QUARTZ_BLOCK))
                .addRecipe(new ItemStack(Material.LAPIS_LAZULI, 9), new ItemStack(Material.LAPIS_BLOCK))
                .addRecipe(new ItemStack(Material.COAL, 9), new ItemStack(Material.COAL_BLOCK))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_4, 8), Materials.COBBLE_5)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_3, 8), Materials.COBBLE_4)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_2, 8), Materials.COBBLE_3)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_1, 8), Materials.COBBLE_2)
                .addRecipe(new ItemStack(Material.COBBLESTONE, 8), Materials.COBBLE_1)
                .ticksPerOutput(1).energyPerTick(60).register(plugin);

        new GearTransformer(Groups.ADVANCED_MACHINES, GEAR_TRANSFORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.SMITHING_TABLE), Materials.MACHINE_CIRCUIT,
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE
        }, GEAR_TRANSFORMER_ENERGY).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
                Materials.VOID_INGOT, SlimefunExtension.ADVANCED_GEO_MINER, Materials.VOID_INGOT,
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
        }).ticksPerOutput(GEO_QUARRY_INTERVAL).energyPerTick(GEO_QUARRY_ENERGY).register(plugin);

        new GeoQuarry(Groups.INFINITY_CHEAT, GEO_INFINITY_QUARRY, InfinityWorkbench.TYPE, new ItemStack[] {
            Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.INFINITE_INGOT, GEO_QUARRY, GEO_QUARRY, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.INFINITE_INGOT, GEO_QUARRY, GEO_QUARRY, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.INFINITE_INGOT, GEO_QUARRY, GEO_QUARRY, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
            Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }).ticksPerOutput(GEO_INFINITY_QUARRY_INTERVAL).energyPerTick(GEO_INFINITY_QUARRY_ENERGY).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, CONCRETE_MOLDING_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            Materials.VOID_INGOT, Materials.VOID_DUST, Materials.VOID_INGOT,
            Materials.VOID_INGOT, SlimefunItems.FLUID_PUMP, Materials.VOID_INGOT,
            SlimefunItems.AUTO_DRIER, SlimefunItems.BIG_CAPACITOR, SlimefunItems.AUTO_DRIER
        }).addRecipe(new ItemStack(Material.WHITE_CONCRETE, 8), new ItemStack(Material.WHITE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.ORANGE_CONCRETE, 8), new ItemStack(Material.ORANGE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.MAGENTA_CONCRETE, 8), new ItemStack(Material.MAGENTA_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIGHT_BLUE_CONCRETE, 8), new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.YELLOW_CONCRETE, 8), new ItemStack(Material.YELLOW_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIME_CONCRETE, 8), new ItemStack(Material.LIME_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.PINK_CONCRETE, 8), new ItemStack(Material.PINK_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.GRAY_CONCRETE, 8), new ItemStack(Material.GRAY_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIGHT_GRAY_CONCRETE, 8), new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.CYAN_CONCRETE, 8), new ItemStack(Material.CYAN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.PURPLE_CONCRETE, 8), new ItemStack(Material.PURPLE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BLUE_CONCRETE, 8), new ItemStack(Material.BLUE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BROWN_CONCRETE, 8), new ItemStack(Material.BROWN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.GREEN_CONCRETE, 8), new ItemStack(Material.GREEN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.RED_CONCRETE, 8), new ItemStack(Material.RED_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BLACK_CONCRETE, 8), new ItemStack(Material.BLACK_CONCRETE_POWDER, 8))
            .ticksPerOutput(1).energyPerTick(80).register(plugin);
    }

    private static final class RandomizedItemStack extends ItemStack {

        private final ItemStack[] items;

        public RandomizedItemStack(ItemStack... outputs) {
            super(outputs[0]);
            this.items = outputs;
        }

        @Nonnull
        @Override
        public ItemStack clone() {
            return this.items[ThreadLocalRandom.current().nextInt(this.items.length)].clone();
        }

    }

}
