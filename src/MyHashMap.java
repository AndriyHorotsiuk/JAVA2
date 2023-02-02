import java.util.*;

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

    private int getiIndexOfKey(Object key) {
        return int index = hashCode(key) % (sizeArrOfNode - 1);
    }

    @Override
    public Object put(Object key, Object value) {
        int index = getiIndexOfKey(key);
        Node newNode = new Node((K) key, (V) value);
        Node oldNode = arrOfNodes[index)];

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

        Node oldNode = arrOfNodes[getiIndexOfKey(key)];
        while (oldNode.next != null) {

            if ((hashCode(oldNode.key) == hashCode(key)) && (oldNode.key.equals(key))) {
                V valueBeforRemove = (V) oldNode.value;
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
        Node getNode = arrOfNodes[getiIndexOfKey(key)];
        while (getNode.next != null) {

            if ((hashCode(getNode.key) == hashCode(key)) && (getNode.key.equals(key))) {

                return getNode.value;
            }
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        if (sizeMyHashMap == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {

        for (Node node : arrOfNodes) {
            while (node.next != null) {
                if (node.value.equals(value)) {
                    return true;
                }
            }

        }
        return false;
    }


    @Override
    public boolean containsKey(Object key) {
        Node node = arrOfNodes[getiIndexOfKey(key)];
        while (node.next != null) {

            if ((hashCode(node.key) == hashCode(key)) && (node.key.equals(key))) {

                return true;
            }
        }


        return false;
    }

    @Override
    public Set keySet() {
        Set setKeys = new HashSet();
        for (Node node : arrOfNodes) {
            while (node.next != null) {
                setKeys.add(node.key);
            }

        }
        return setKeys;
    }

    @Override
    public Collection values() {
        HashSet setValue = new HashSet();
        for (Node node : arrOfNodes) {
            while (node.next != null) {
                setValue.add(node.value);
            }

        }
        return setValue;
    }


    @Override
    public void putAll(Map m) {
        m.keySet().stream(ell->put(ell,m.get(ell)));
    }


    @Override
    public Set<Entry> entrySet() {
        HashSet setMaps = new HashSet();
        for (Node node : arrOfNodes) {
            while (node.next != null) {
                setMaps.add( new HashMap<K,V>().put((K) node.key, (V) node.value));
            }

        }
        return setMaps;



    }
}
