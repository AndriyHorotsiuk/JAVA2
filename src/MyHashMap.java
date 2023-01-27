import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map {
    private Node[] firstNodes;
    private int capacity=16;

    firstNodes = new Node[capacity];


    class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
