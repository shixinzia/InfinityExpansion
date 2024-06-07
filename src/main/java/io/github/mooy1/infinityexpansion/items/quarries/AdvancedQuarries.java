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
import io.github.mooy1.infinityexpansion.items.quarries.Quarries;
import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class AdvancedQuarries {

    public static final SlimefunItemStack VOID_QUARRY = new SlimefunItemStack(
        "VOID_QUARRY",
        Material.CHISELED_NETHER_BRICKS,
        "&8虚空矿机",
        "&7自动挖主世界和下界矿物",
        "",
        MachineLore.speed(6),
        MachineLore.energyPerSecond(3600)
    );
    public static final SlimefunItemStack INFINITY_QUARRY = new SlimefunItemStack(
        "INFINITY_QUARRY",
        Material.CHISELED_POLISHED_BLACKSTONE,
        "&b无尽矿机",
        "&7自动挖主世界和下界矿物",
        "",
        MachineLore.speed(64),
        MachineLore.energyPerSecond(36000)
    );
    public static final double DIAMOND_BLOCK_CHANCE = getOscillatorChance("diamond");
    public static final double REDSTONE_BLOCK_CHANCE = getOscillatorChance("redstone");
    public static final double LAPIS_BLOCK_CHANCE = getOscillatorChance("lapis");
    public static final double EMERALD_BLOCK_CHANCE = getOscillatorChance("emerald");
    public static final double QUARTZ_BLOCK_CHANCE = getOscillatorChance("quartz");
    public static final double GOLD_BLOCK_CHANCE = getOscillatorChance("gold");
    public static final double NETHERITE_BLOCK_CHANCE = getOscillatorChance("netherite");
    public static final SlimefunItemStack DIAMOND_BLOCK_OSCILLATOR = Oscillator.create(Material.DIAMOND_BLOCK, DIAMOND_BLOCK_CHANCE);
    public static final SlimefunItemStack REDSTONE_BLOCK_OSCILLATOR = Oscillator.create(Material.REDSTONE_BLOCK, REDSTONE_BLOCK_CHANCE);
    public static final SlimefunItemStack LAPIS_BLOCK_OSCILLATOR = Oscillator.create(Material.LAPIS_BLOCK, LAPIS_BLOCK_CHANCE);
    public static final SlimefunItemStack QUARTZ_BLOCK_OSCILLATOR = Oscillator.create(Material.QUARTZ_BLOCK, QUARTZ_BLOCK_CHANCE);
    public static final SlimefunItemStack EMERALD_BLOCK_OSCILLATOR = Oscillator.create(Material.EMERALD_BLOCK, EMERALD_BLOCK_CHANCE);
    public static final SlimefunItemStack GOLD_BLOCK_OSCILLATOR = Oscillator.create(Material.GOLD_BLOCK, GOLD_BLOCK_CHANCE);
    public static final SlimefunItemStack NETHERITE_BLOCK_OSCILLATOR = Oscillator.create(Material.NETHERITE_BLOCK, NETHERITE_BLOCK_CHANCE);


    private static double getOscillatorChance(String type) {
        return InfinityExpansion.config().getDouble("quarry-options.oscillators." + type, 0, 1);
    }

    public static void setup(InfinityExpansion plugin) {
        ConfigurationSection section = plugin.getConfig().getConfigurationSection("quarry-options.resources");
        Objects.requireNonNull(section);
        List<Material> outputs = new ArrayList<>();

        boolean coal = section.getBoolean("coal");

        if (coal) {
            outputs.add(Material.COAL_BLOCK);
            outputs.add(Material.COAL_BLOCK);
        }

        if (section.getBoolean("iron")) {
            outputs.add(Material.IRON_BLOCK);
        }

        if (section.getBoolean("gold")) {
            outputs.add(Material.GOLD_BLOCK);
        }

        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17) && section.getBoolean("copper")) {
            outputs.add(Material.COPPER_BLOCK);
        }

        if (section.getBoolean("redstone")) {
            new Oscillator(REDSTONE_BLOCK_OSCILLATOR, REDSTONE_BLOCK_CHANCE).register(plugin);
            outputs.add(Material.REDSTONE_BLOCK);
        }

        if (section.getBoolean("lapis")) {
            new Oscillator(LAPIS_BLOCK_OSCILLATOR, LAPIS_BLOCK_CHANCE).register(plugin);
            outputs.add(Material.LAPIS_BLOCK);
        }

        if (section.getBoolean("gold")) {
            new Oscillator(GOLD_BLOCK_OSCILLATOR, GOLD_BLOCK_CHANCE).register(plugin);

            outputs.add(Material.GOLD_BLOCK);
        }

        if (section.getBoolean("emerald")) {
            new Oscillator(EMERALD_BLOCK_OSCILLATOR, EMERALD_BLOCK_CHANCE).register(plugin);
            outputs.add(Material.EMERALD_BLOCK);
        }

        if (section.getBoolean("diamond")) {
            new Oscillator(DIAMOND_BLOCK_OSCILLATOR, DIAMOND_BLOCK_CHANCE).register(plugin);
            outputs.add(Material.DIAMOND_BLOCK);
        }

        if (section.getBoolean("quartz")) {
            new Oscillator(QUARTZ_BLOCK_OSCILLATOR, QUARTZ_BLOCK_CHANCE).register(plugin);

            outputs.add(Material.QUARTZ_BLOCK);
        }

        if (section.getBoolean("netherite")) {
            outputs.add(Material.NETHERITE_BLOCK);
        }

        if (section.getBoolean("netherite")) {
            new Oscillator(NETHERITE_BLOCK_OSCILLATOR, NETHERITE_BLOCK_CHANCE).register(plugin);

            outputs.add(Material.NETHERITE_BLOCK);
        }

        if (section.getBoolean("netherrack")) {
            outputs.add(Material.NETHERRACK);
        }


        new Quarry(Groups.ADVANCED_MACHINES, VOID_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            Materials.VOID_INGOT, SlimefunExtension.VOID_CAPACITOR, Materials.VOID_INGOT,
            new ItemStack(Material.NETHERITE_PICKAXE), Quarries.ADVANCED_QUARRY, new ItemStack(Material.NETHERITE_PICKAXE),
            Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 6, 2, outputs.toArray(new Material[0]))
            .energyPerTick(3600).register(plugin);


        new Quarry(Groups.INFINITY_CHEAT, INFINITY_QUARRY, InfinityWorkbench.TYPE, new ItemStack[] {
            null, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, null,
            Materials.MACHINE_PLATE, Gear.PICKAXE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Gear.PICKAXE, Materials.MACHINE_PLATE,
            Materials.MACHINE_PLATE, VOID_QUARRY, Materials.INFINITE_CORE, Materials.INFINITE_CORE, VOID_QUARRY, Materials.MACHINE_PLATE,
            Materials.VOID_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, Materials.VOID_INGOT,
            Materials.VOID_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, Materials.VOID_INGOT,
            Materials.VOID_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, Materials.VOID_INGOT
        }, 64, 1, outputs.toArray(new Material[0])).energyPerTick(36000).register(plugin);
    }

}
