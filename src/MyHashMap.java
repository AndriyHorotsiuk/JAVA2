import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map {
    private int sizeArrOfNode = 16;

    private Node<K, V>[] arrOfNodes = new Node[sizeArrOfNode];
    int sizeMyHashMap = 0;

    class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;

        }
    }


    private int hashCode(Object key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode();
    }

    @Override
    public Object put(Object key, Object value) {
        int index = hashCode(key) % (sizeArrOfNode - 1);
        Node newNode = new Node((K) key, (V) value);
        Node oldNode = arrOfNodes[index];

        if (arrOfNodes[index] == null) {
            arrOfNodes[index] = newNode;
            sizeMyHashMap++;
            return null;
        }


        while (oldNode.next != null) {

            if ((hashCode(oldNode.key) == hashCode(newNode.key)) && (oldNode.key.equals(newNode.key))) {
                V valueBeforPut = (V) oldNode.next.value;
                newNode.next = oldNode.next;
                oldNode = newNode;
                sizeMyHashMap++;
                return valueBeforPut;
            }

            oldNode = oldNode.next;
        }
        V valueBeforPut = (V) oldNode.next.value;
        oldNode.next = newNode;
        sizeMyHashMap++;
        return valueBeforPut;
    }

    @Override
    public int size() {
        return sizeMyHashMap;
    }

    @Override
    public void clear() {
        arrOfNodes = new Node[sizeArrOfNode];
        sizeMyHashMap = 0;
    }

    @Override
    public Object remove(Object key) {
        int index = hashCode(key) % (sizeArrOfNode - 1);
        Node oldNode = arrOfNodes[index];
        while (oldNode.next != null) {

            if ((hashCode(oldNode.key) == hashCode(key)) && (oldNode.key.equals(key))) {
                V valueBeforRemove = (V) oldNode.next.value;
                oldNode.key = oldNode.next.key;
                oldNode.value = oldNode.next.value;
                oldNode.next = oldNode.next.next;
                sizeMyHashMap--;
                return valueBeforRemove;
            }
        }
        return null;
    }


    @Override
    public Object get(Object key) {
        return null;
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
    public void putAll(Map m) {

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
