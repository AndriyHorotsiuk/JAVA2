import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map {
    private int sizeArrOfNode = 16;

    private Node<K,V>[] arrOfNodes = new Node[sizeArrOfNode];
    int sizeMyHashMap = 0;

    class Node<K,V> {
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
                newNode.next = oldNode.next;
                oldNode = newNode;
                sizeMyHashMap++;
                return arrOfNodes;
            }

            oldNode = oldNode.next;
        }
        V valueBeforPut = (V) oldNode.next.value;
        oldNode.next = newNode;
        sizeMyHashMap++;
        return valueBeforPut;
    }

    @Override
    public Object get(Object key) {
        return null;
    }


    @Override
    public int size() {
        return sizeMyHashMap;
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
