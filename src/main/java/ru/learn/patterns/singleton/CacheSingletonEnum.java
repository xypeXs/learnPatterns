package ru.learn.patterns.singleton;

public enum CacheSingletonEnum {

    UNIQUE_INSTANCE;

    private final Object[] cacheArray = new Object[10];

    public synchronized <K, V> void putCache(K key, V value) {
        cacheArray[key.hashCode()] = value;
    }

    public synchronized <K, V> V getCache(K key) {
        return (V) cacheArray[key.hashCode()];
    }
}
