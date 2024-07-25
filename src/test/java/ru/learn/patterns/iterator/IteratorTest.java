package ru.learn.patterns.iterator;

import junit.framework.TestCase;

import java.util.Iterator;

public class IteratorTest extends TestCase {

    public void testMapIterator() {
        IteratorCreator<Item> mapCollectionHolder = new MapCollectionHolder();
        Iterator<Item> itemIterator = mapCollectionHolder.getIterator();
        printInfo(mapCollectionHolder.getClass().toString(), itemIterator);
    }

    public void testArrayIterator() {
        IteratorCreator<Item> arrayCollectionHolder = new ArrayCollectionHolder();
        Iterator<Item> itemIterator = arrayCollectionHolder.getIterator();
        printInfo(arrayCollectionHolder.getClass().toString(), itemIterator);
    }

    private void printInfo(String header, Iterator<Item> itemIterator) {
        System.out.println("------------------------------------------------------");
        System.out.println(header);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next());
        }
        System.out.println("------------------------------------------------------");
    }
}
