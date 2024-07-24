package ru.learn.patterns.collections.iterator;

import java.util.Iterator;

public interface IteratorCreator<T> {
    Iterator<T> getIterator();
}
