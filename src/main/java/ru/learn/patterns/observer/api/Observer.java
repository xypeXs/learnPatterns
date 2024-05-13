package ru.learn.patterns.observer.api;

public interface Observer<T> {
    void update(T data);
}
