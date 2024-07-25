package ru.learn.patterns.iterator;

import lombok.Getter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Getter
public class MapCollectionHolder implements IteratorCreator<Item> {

    private final Map<Integer, Item> itemMap;

    public MapCollectionHolder() {
        itemMap = new HashMap<>(5);

        for (int i = 0; i < 3; i++)
            itemMap.put(i, new Item("Item" + i, "Item" + i + " description"));
    }

    @Override
    public Iterator<Item> getIterator() {
        return new MapIterator<>(itemMap);
    }
}
