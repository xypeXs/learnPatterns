package ru.learn.patterns.adapter.example2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration - устаревший интерфейс для итерирования коллекций. Может использоваться в легаси коде.
 * Данный адаптер позволяет легаси коду работать с актуальной реализацией итераций коллекций
 */
public class IteratorAdapter implements Enumeration<Object> {

    private final Iterator<Object> iterator;

    public IteratorAdapter(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
