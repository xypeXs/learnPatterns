package ru.learn.patterns.adapter.example2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration - устаревший интерфейс для итерирования коллекций. Может использоваться в легаси коде.
 * Данный адаптер позволяет более современному коду работать с устаревшей реализацией итераций коллекций
 */
public class EnumerationAdapter implements Iterator<Object> {

    private final Enumeration<Object> enumeration;

    public EnumerationAdapter(Enumeration<Object> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
