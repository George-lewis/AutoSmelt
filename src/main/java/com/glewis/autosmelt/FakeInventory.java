package com.glewis.autosmelt;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

/**
 * A simple minimally-complete implementation of `Inventory` for use with finding recipes
 */
public class FakeInventory implements Inventory {

    private ItemStack stack;

    public FakeInventory() { }

    public FakeInventory(ItemStack stack) {
        this.stack = stack;
    }

    @Override
    public void clear() { }

    @Override
    public int size() { return stack == null ? 0 : 1; }

    @Override
    public boolean isEmpty() { return false; }

    @Override
    public ItemStack getStack(int slot) { return stack; }

    @Override
    public ItemStack removeStack(int slot, int amount) { return null; }

    @Override
    public ItemStack removeStack(int slot) { return null; }

    @Override
    public void setStack(int slot, ItemStack stack) { this.stack = stack; }

    @Override
    public void markDirty() { }

    @Override
    public boolean canPlayerUse(PlayerEntity player) { return false; }
    
}