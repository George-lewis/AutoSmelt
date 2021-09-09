package com.glewis.autosmelt;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod implements ModInitializer {

	public static final Enchantment SMELTING = Registry.register(
		Registry.ENCHANTMENT,
		new Identifier("autosmelt", "smelting"),
		new SmeltingEnchantment()
	);

	@Override
	public void onInitialize() {
		System.out.println("AutoSmelt initialized");
	}

}
