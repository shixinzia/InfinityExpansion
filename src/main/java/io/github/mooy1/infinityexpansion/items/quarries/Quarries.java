package io.github.mooy1.infinityexpansion.items.quarries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.SlimefunExtension;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.gear.Gear;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class Quarries {

    public static final SlimefunItemStack BASIC_QUARRY = new SlimefunItemStack(
            "BASIC_QUARRY",
            Material.CHISELED_SANDSTONE,
            "&9基础矿机",
            "&7自动挖主世界矿物",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(300)
    );
    public static final SlimefunItemStack ADVANCED_QUARRY = new SlimefunItemStack(
            "ADVANCED_QUARRY",
            Material.CHISELED_RED_SANDSTONE,
            "&c高级矿机",
            "&7自动挖主世界和下界矿物",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(900)
    );
    public static final double DIAMOND_CHANCE = getOscillatorChance("diamond");
    public static final double REDSTONE_CHANCE = getOscillatorChance("redstone");
    public static final double LAPIS_CHANCE = getOscillatorChance("lapis");
    public static final double EMERALD_CHANCE = getOscillatorChance("emerald");
    public static final double QUARTZ_CHANCE = getOscillatorChance("quartz");
    public static final double GOLD_CHANCE = getOscillatorChance("gold");
    public static final double NETHERITE_CHANCE = getOscillatorChance("netherite");
    public static final SlimefunItemStack DIAMOND_OSCILLATOR = Oscillator.create(Material.DIAMOND, DIAMOND_CHANCE);
    public static final SlimefunItemStack REDSTONE_OSCILLATOR = Oscillator.create(Material.REDSTONE, REDSTONE_CHANCE);
    public static final SlimefunItemStack LAPIS_OSCILLATOR = Oscillator.create(Material.LAPIS_LAZULI, LAPIS_CHANCE);
    public static final SlimefunItemStack QUARTZ_OSCILLATOR = Oscillator.create(Material.QUARTZ, QUARTZ_CHANCE);
    public static final SlimefunItemStack EMERALD_OSCILLATOR = Oscillator.create(Material.EMERALD, EMERALD_CHANCE);
    public static final SlimefunItemStack GOLD_OSCILLATOR = Oscillator.create(Material.GOLD_INGOT, GOLD_CHANCE);
    public static final SlimefunItemStack NETHERITE_OSCILLATOR = Oscillator.create(Material.NETHERITE_INGOT, NETHERITE_CHANCE);


    private static double getOscillatorChance(String type) {
        return InfinityExpansion.config().getDouble("quarry-options.oscillators." + type, 0, 1);
    }

    public static void setup(InfinityExpansion plugin) {
        ConfigurationSection section = plugin.getConfig().getConfigurationSection("quarry-options.resources");
        Objects.requireNonNull(section);
        List<Material> outputs = new ArrayList<>();

        boolean coal = section.getBoolean("coal");

        if (coal) {
            outputs.add(Material.COAL);
            outputs.add(Material.COAL);
        }

        if (section.getBoolean("iron")) {
            outputs.add(Material.IRON_INGOT);
        }

        if (section.getBoolean("gold")) {
            outputs.add(Material.GOLD_INGOT);
        }

        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17) && section.getBoolean("copper")) {
            outputs.add(Material.COPPER_INGOT);
            outputs.add(Material.COPPER_INGOT);
        }

        if (section.getBoolean("redstone")) {
            new Oscillator(REDSTONE_OSCILLATOR, REDSTONE_CHANCE).register(plugin);
            outputs.add(Material.REDSTONE);
        }

        if (section.getBoolean("lapis")) {
            new Oscillator(LAPIS_OSCILLATOR, LAPIS_CHANCE).register(plugin);
            outputs.add(Material.LAPIS_LAZULI);
        }

        if (section.getBoolean("gold")) {
            new Oscillator(GOLD_OSCILLATOR, GOLD_CHANCE).register(plugin);

            outputs.add(Material.GOLD_INGOT);
        }

        if (section.getBoolean("emerald")) {
            new Oscillator(EMERALD_OSCILLATOR, EMERALD_CHANCE).register(plugin);
            outputs.add(Material.EMERALD);
        }

        if (section.getBoolean("diamond")) {
            new Oscillator(DIAMOND_OSCILLATOR, DIAMOND_CHANCE).register(plugin);
            outputs.add(Material.DIAMOND);
        }

        new Quarry(Groups.ADVANCED_MACHINES, BASIC_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, SlimefunItems.CARBONADO_EDGED_CAPACITOR, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.IRON_PICKAXE), SlimefunItems.GEO_MINER, new ItemStack(Material.IRON_PICKAXE),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 1, 6, outputs.toArray(new Material[0])).energyPerTick(300).register(plugin);

        if (section.getBoolean("quartz")) {
            new Oscillator(QUARTZ_OSCILLATOR, QUARTZ_CHANCE).register(plugin);

            outputs.add(Material.QUARTZ);
        }

        if (section.getBoolean("netherite")) {
            outputs.add(Material.NETHERITE_INGOT);
        }

        if (section.getBoolean("netherite")) {
            new Oscillator(NETHERITE_OSCILLATOR, NETHERITE_CHANCE).register(plugin);

            outputs.add(Material.NETHERITE_INGOT);
        }

        if (section.getBoolean("netherrack")) {
            outputs.add(Material.NETHERRACK);
            outputs.add(Material.NETHERRACK);
        }

        new Quarry(Groups.ADVANCED_MACHINES, ADVANCED_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, Materials.MACHINE_PLATE,
                new ItemStack(Material.DIAMOND_PICKAXE), BASIC_QUARRY, new ItemStack(Material.DIAMOND_PICKAXE),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 2, 4, outputs.toArray(new Material[0])).energyPerTick(900).register(plugin);

    }

}
