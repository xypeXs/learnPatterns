package ru.learn.patterns.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class MapIterator<K, V> implements Iterator<V> {

    private final Map<K, V> itemMap;
    private final Set<K> viewedKeySet;

    public MapIterator(Map<K, V> itemMap) {
        this.itemMap = itemMap;
        viewedKeySet = new HashSet<>(itemMap.size());
    }

    @Override
    public boolean hasNext() {
        return nextKey() != null;
    }

    @Override
    public V next() {
        if (!hasNext())
            throw new NoSuchElementException();

        K nextKey = nextKey();
        viewedKeySet.add(nextKey);

        return itemMap.get(nextKey);
    }

    private K nextKey() {
        return itemMap.keySet().stream()
                .filter(key -> !viewedKeySet.contains(key))
                .findFirst().orElse(null);
    }
}
