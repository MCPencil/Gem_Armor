package net.iqrx.gemarmor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iqrx.gemarmor.GemArmor;
import net.iqrx.gemarmor.item.custom.ModAxeItem;
import net.iqrx.gemarmor.item.custom.ModElytraItem;
import net.iqrx.gemarmor.item.custom.ModHoeItem;
import net.iqrx.gemarmor.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GEM_SWORD = registerItem("gem_sword",
            new SwordItem(ModToolMaterials.GEM, 6,  2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEM_AXE = registerItem("gem_axe",
            new ModAxeItem(ModToolMaterials.GEM, 8,  1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item GEM_HOE = registerItem("gem_hoe",
            new ModHoeItem(ModToolMaterials.GEM, 2,  0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item GEM_SHOVEL = registerItem("gem_shovel",
            new ShovelItem(ModToolMaterials.GEM, 3,  0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item GEM_PICKAXE = registerItem("gem_pickaxe",
            new ModPickaxeItem(ModToolMaterials.GEM, 3,  2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));


    public static final Item GEM_HELMET = registerItem("gem_helmet",
            new ArmorItem(ModArmorMaterials.GEM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEM_CHESTPLATE = registerItem("gem_chestplate",
            new ArmorItem(ModArmorMaterials.GEM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEM_LEGGINGS = registerItem("gem_leggings",
            new ArmorItem(ModArmorMaterials.GEM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEM_BOOTS = registerItem("gem_boots",
            new ArmorItem(ModArmorMaterials.GEM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item WINGED_GEM_CHESTPLATE = registerItem("winged_gem_chestplate",
            new ElytraItem(ModArmorMaterials.GEM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEM_BOW = registerItem("gem_bow",
            new BowItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(1000)));

    public static final Item GEM_TRIDENT = registerItem("gem_trident",
            new TridentItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(1000)));



    public static final Item GEM_CRYSTAL = registerItem("gem_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item GEM_ESSENCE = registerItem("gem_essence",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemArmor.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GemArmor.LOGGER.debug("Registering Mod Items for " + GemArmor.MOD_ID);
    }
}
