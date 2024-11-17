package coding;

import java.util.LinkedHashMap;

/**
 * 第二题：LRU缓存
 */
public class LRUCache {
    // 使用LinkedHashMap实现LRU缓存
    private LinkedHashMap map;
    // 缓存容量
    private int capacity;
    LRUCache(int capacity){
        this.capacity = capacity;
        map = new LinkedHashMap(this.capacity,0.75f,true){
            // 重写removeEldestEntry方法，当超过capacity时，删除最老的元素
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
                return size()>capacity;
            }
        };
    }
    public int get(int key){
        return (int)map.getOrDefault(key,-1);
    }
    public void put(int key,int value){
        map.put(key,value);
    }
}
