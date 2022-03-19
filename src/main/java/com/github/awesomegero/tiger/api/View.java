package com.github.awesomegero.tiger.api;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class View {
    private static HashMap<String, View> VIEWMAP = new HashMap<>();

    public static void addView(String name, View view) {
        VIEWMAP.put(name, view);
    }

    public static View getView(String name) {
        return VIEWMAP.get(name);
    }

    private HashMap<Integer, ItemComponent> componentMap;

    public View() {
        componentMap = new HashMap<>();
    }

    public void addComponent(int position, ItemComponent component) {
        componentMap.put(position, component);
    }

    public HashMap<Integer, ItemComponent> getComponentMap(Player player) {
        return componentMap;
    }
}
