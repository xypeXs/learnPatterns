package ru.learn.patterns.iterator;

import lombok.Getter;

import java.util.Iterator;

@Getter
public class ArrayCollectionHolder implements IteratorCreator<Item> {

    private final Item[] itemArray;

    public ArrayCollectionHolder() {
        itemArray = new Item[3];

        for (int i = 0; i < 3; i++)
            itemArray[i] = new Item("Item" + i, "Item" + i + " description");
    }

    @Override
    public Iterator<Item> getIterator() {
        return new ArrayIterator<>(itemArray);
    }
}
