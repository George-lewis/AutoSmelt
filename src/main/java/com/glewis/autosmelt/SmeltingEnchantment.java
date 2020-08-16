package com.glewis.autosmelt;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

/**
 * An enchantment that applies to tools and smelts drops
 */
public class SmeltingEnchantment extends Enchantment {

	protected SmeltingEnchantment() {
		super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }

    @Override
    public int getMinLevel() {
        return 1;
    }
    
    @Override
    public int getMaxLevel() {
        return 1;
    }
    
}