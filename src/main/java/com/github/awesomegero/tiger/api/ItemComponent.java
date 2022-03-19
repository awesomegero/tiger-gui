package com.github.awesomegero.tiger.api;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.function.Predicate;

public class ItemComponent {
    private static final HashMap<String, ItemComponent> COMPONENTMAP = new HashMap<>();

    public static void addComponent(String name, ItemComponent component) {
        COMPONENTMAP.put(name, component);
    }

    public static ItemComponent getItemComponent(String name) {
        return COMPONENTMAP.get(name);
    }

    public static ItemComponent getItemComponentByDisplayName(Player player, String displayName) {
        Predicate<ItemComponent> byDisplayName = component -> component.getItemStack(player).getItemMeta().getDisplayName().equals(displayName);
        ItemComponent itemComponent;
        if (COMPONENTMAP.values().stream().anyMatch(byDisplayName)) itemComponent = COMPONENTMAP.values().stream().filter(byDisplayName).findFirst().get();
        else return null;
        return itemComponent;
    }

    protected String typeName;
    protected String rawItemName;
    protected String itemName;
    protected Material material;

    public ItemComponent(String name) {
        this.typeName = name;
        this.rawItemName = itemName;
    }

    public ItemStack getItemStack(Player player) {
        return null;
    }

    public void handleInventoryClick(InventoryClickEvent clickEvent) {
    }

    public void handleClick(PlayerInteractEvent interactEvent) {
    }

    public void handleDrop(PlayerDropItemEvent dropItemEvent) {

    }
}
