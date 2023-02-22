package com.designpattern.prototype;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ProfessionCache {
    private static ConcurrentMap<Integer, Profession> cache = new ConcurrentHashMap<>();

    public static Profession getCloneProfessionObject(int key) {
        Profession p = cache.get(key);
        return (Profession) p.getCloneMethod();
    }

    public static void loadCache() {
        cache.putIfAbsent(1, new Doctor());
        cache.putIfAbsent(2, new Engineer());
        cache.putIfAbsent(3, new Lawyer());

    }

}
