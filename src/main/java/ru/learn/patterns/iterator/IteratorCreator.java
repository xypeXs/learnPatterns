package ru.learn.patterns.iterator;

import java.util.Iterator;

public interface IteratorCreator<T> {
    Iterator<T> getIterator();
}
