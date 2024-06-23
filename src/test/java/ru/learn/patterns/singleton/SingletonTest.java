package ru.learn.patterns.singleton;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class SingletonTest extends TestCase {

    public void testSingletonClass() {
        CacheSingleton<Long, String> cache = CacheSingleton.getInstance();

        Map<Long, String> map = new HashMap<>();
        for (long i = 0; i < 10; i++) {
            Long key = i;
            String value = String.valueOf(i);

            cache.putCache(key, value);
            map.put(key, value);
        }

        CacheSingleton<Long, String> cache2 = CacheSingleton.getInstance();

        for (Map.Entry<Long, String> entry : map.entrySet()) {
            Long key = entry.getKey();
            String cachedValue = cache2.getCache(key);

            Assert.assertEquals(map.get(key), cachedValue);
        }
    }

    public void testSingletonEnum() {
        CacheSingletonEnum cache = CacheSingletonEnum.UNIQUE_INSTANCE;

        Map<Long, String> map = new HashMap<>();
        for (long i = 0; i < 10; i++) {
            Long key = i;
            String value = String.valueOf(i);

            cache.putCache(key, value);
            map.put(key, value);
        }

        CacheSingletonEnum cache2 = CacheSingletonEnum.UNIQUE_INSTANCE;

        for (Map.Entry<Long, String> entry : map.entrySet()) {
            Long key = entry.getKey();
            String cachedValue = cache2.getCache(key);

            Assert.assertEquals(map.get(key), cachedValue);
        }
    }
}
