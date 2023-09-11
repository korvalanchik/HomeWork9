package HW9;

import javax.management.openmbean.InvalidKeyException;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.Arrays;

public class MyHashMap<K, V> {
    private static final int MAP_CAPACITY = 8;
    private final Entry<K, V>[] entries = new Entry[MAP_CAPACITY];
    private int size;

     public void put(K key, V value) {
        int index = bucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value, null);
        if(entries[index] == null) {
            entries[index] = entry;
        } else {
            if(entries[index].getKey().equals(key)) {
                throw new KeyAlreadyExistsException();
            }
            while (entries[index].next != null) {
                if(entries[index].next.getKey().equals(key)) {
                    throw new KeyAlreadyExistsException();
                }
                entries[index] = entries[index].next;
            }
            entries[index].next = entry;
        }
        size++;
    }

    public V get(K key) {
        int index = bucketIndex(key);
        if(entries[index] != null) {
            if (entries[index].getKey().equals(key)) {
                return entries[index].value;
            } else {
                while (entries[index].next != null) {
                    entries[index] = entries[index].next;
                    if (entries[index].getKey().equals(key)) {
                        return entries[index].value;
                    }
                }
            }
        }
        return null;
//        throw new InvalidKeyException();
    }

    public void remove(K key) {
        int index = bucketIndex(key);
        if(entries[index].getKey().equals(key)) {
            if(entries[index].next != null) {
                entries[index] = entries[index].next;
            } else {
                entries[index] = null;
            }
            size--;
            return;
        } else {
            while (entries[index].next != null) {
                if(entries[index].next.getKey().equals(key)) {
                    entries[index] = entries[index].next.next;
                    size--;
                    return;
                } else {
                    entries[index] = entries[index].next;
                }
            }
        }
        throw new InvalidKeyException();
    }

    public void clear(){
        Arrays.fill(entries, null);
        size = 0;
    }

    private int bucketIndex(K key) {
        return Math.abs(key.hashCode()) % entries.length;
    }

    public int size() {
        return size;
    }

    public static class Entry<K, V> {
        private final K key;
        private final V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

    }
}
