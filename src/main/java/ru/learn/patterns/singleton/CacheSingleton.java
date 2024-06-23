package ru.learn.patterns.singleton;

public class CacheSingleton<K, V> {

    private volatile static CacheSingleton instance;

    private final V[] cacheArray;

    private CacheSingleton() {
        cacheArray = (V[]) new Object[10];
    }

    public static CacheSingleton getInstance() {
        if (instance == null) {
            synchronized (CacheSingleton.class) {
                if (instance == null) {
                    instance = new CacheSingleton();
                }
            }
        }
        return instance;
    }

    public synchronized void putCache(K key, V value) {
        cacheArray[key.hashCode()] = value;
    }

    public synchronized V getCache(K key) {
        return cacheArray[key.hashCode()];
    }
}
