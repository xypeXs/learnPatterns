package ru.learn.patterns.collections.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<V> implements Iterator<V> {

    private final V[] itemArray;
    private int index = 0;

    public ArrayIterator(V[] itemArray) {
        this.itemArray = itemArray;
    }

    @Override
    public boolean hasNext() {
        return index < itemArray.length && itemArray[index] != null;
    }

    @Override
    public V next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return itemArray[index++];
    }
}
