package pract3;

import java.util.*;

public class SyncMap<K, V> implements Map<K, V> {

    private Map<K, V> map;

    public SyncMap()
    {
        map = new HashMap<>();
    }


    @Override
    public synchronized boolean isEmpty()
    {
        return map.isEmpty();
    }

    @Override
    public synchronized int size()
    {
        return map.size();
    }
    @Override
    public synchronized boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    @Override
    public synchronized boolean containsValue(Object obj)
    {
        return map.containsValue(obj);
    }

    @Override
    public synchronized V get(Object key)
    {
        return map.get(key);
    }
    @Override
    public synchronized V put(K key, V value)
    {
        return map.put(key, value);
    }
    @Override
    public synchronized V remove(Object key)
    {
        return map.remove(key);
    }
    @Override
    public synchronized void putAll(Map<? extends K,? extends V> m)
    {
        map.putAll(m);
    }
    @Override
    public synchronized void clear()
    {
        map.clear();
    }
    @Override
    public synchronized Set<K> keySet()
    {
        return map.keySet();
    }
    @Override
    public synchronized Collection<V> values()
    {
        return map.values();
    }
    @Override
    public synchronized Set<Map.Entry<K,V>> entrySet()
    {
        return map.entrySet();
    }
    @Override
    public synchronized boolean equals(Object o)
    {
        return map.equals(o);
    }
    @Override
    public synchronized int hashCode()
    {
        return map.hashCode();
    }

}
