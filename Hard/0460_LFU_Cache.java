/*
 * Problem: LFU Cache
 * Problem ID: 460
 * Difficulty: Hard
 * Language: Java
 * Runtime: 63 ms
 * Memory: 143.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-12
 */

class LFUCache {
    HashMap<Integer,Integer> cache=new HashMap<>();
    HashMap<Integer,Integer> keycount=new HashMap<>();
    HashMap<Integer,LinkedHashSet<Integer>> freq=new HashMap<>();
    int size,min;
    public LFUCache(int capacity) {
        size=capacity;
        min=-1;
        cache=new HashMap<>();
        keycount=new HashMap<>();
        freq=new HashMap<>();
        freq.put(1,new LinkedHashSet<>());
    }
    
    public int get(int key) {
        if(!keycount.containsKey(key)) return -1;
        
        int count =keycount.get(key);
        keycount.put(key,count+1);
        freq.get(count).remove(key);;
        

        if(min==count && freq.get(count).size()==0){
            min++;
        }

        if(!freq.containsKey(count+1)){
            freq.put(count+1,new LinkedHashSet<>());
        }

        freq.get(count+1).add(key);
        return cache.get(key);

    }
    
    public void put(int key, int value) {
        if(size==0) return;

        if (cache.containsKey(key)) {
            cache.put(key, value);
            get(key);  // frequency increase karne ke liye
            return;
        }

        if (cache.size() >= size) {
            int minFreq = freq.get(min).iterator().next();

            freq.get(min).remove(minFreq);
            keycount.remove(minFreq);
            cache.remove(minFreq);
        }

        cache.put(key, value);
        keycount.put(key, 1);
        freq.get(1).add(key);
        min = 1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */