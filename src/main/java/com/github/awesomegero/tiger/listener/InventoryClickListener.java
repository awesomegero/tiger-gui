package com.github.awesomegero.tiger.listener;

import com.github.awesomegero.tiger.api.ItemComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent clickEvent) {
        if (clickEvent.getCurrentItem() == null) return;
        if (!(clickEvent.getWhoClicked() instanceof Player)) return;
        ItemComponent itemComponent = ItemComponent.getItemComponentByDisplayName((Player) clickEvent.getWhoClicked(), clickEvent.getCurrentItem().getItemMeta().getDisplayName());
        if (itemComponent != null) itemComponent.handleInventoryClick(clickEvent);
    }
}
