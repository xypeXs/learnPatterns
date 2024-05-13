package ru.learn.patterns.observer.api;

import java.util.Collection;
import java.util.LinkedList;

public abstract class AbstractSubject<T> implements Subject<T> {

    private Collection<Observer<T>> observerCollection;


    protected AbstractSubject() {
        observerCollection = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer<T> observer) {
        observerCollection.add(observer);
    }

    @Override
    public void removeObserver(Observer<T> observer) {
        observerCollection.remove(observer);
    }

    @Override
    public void notifyObservers(T data) {
        observerCollection.forEach(observer -> observer.update(data));
    }
}
