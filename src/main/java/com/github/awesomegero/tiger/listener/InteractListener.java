package com.github.awesomegero.tiger.listener;

import com.github.awesomegero.tiger.api.ItemComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent interactEvent) {
        if (interactEvent.getItem() == null) return;
        if (interactEvent.getItem().getItemMeta() == null) return;
        ItemComponent itemComponent = ItemComponent.getItemComponentByDisplayName(interactEvent.getPlayer(), interactEvent.getItem().getItemMeta().getDisplayName());
        if (itemComponent != null) {
            itemComponent.handleClick(interactEvent);
        }
    }
}
