import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List {
    private int size = 0;
    private Node<T> first = null;
    private Node<T> last = null;

    private static class Node<T> {
        T elementNode;
        Node<T> nextNode;
        Node<T> prevNode;

        Node(Node<T> prev, T element, Node<T> next) {
            this.elementNode = element;
            this.nextNode = next;
            this.prevNode = prev;
        }
    }


    private Node  getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.nextNode;
        }
        return result;
    }


    @Override
    public boolean add(Object o) {
        Node newNode = new Node<T>(last, (T) o, null);
        if (first == null) {
            first = newNode;
        }
        last.nextNode = newNode;
        last = newNode;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        return getNode(index).elementNode;
    }


    @Override
    public void add(int index, Object element) {
        Node nodeOfInsertElement = new Node<>(null, element, null);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(element);
        }
        Node nodeOldElement = first;
        for (int i = 0; i < index; i++) {
            nodeOldElement = nodeOldElement.nextNode;
        }
        nodeOfInsertElement.nextNode = nodeOldElement;
        nodeOfInsertElement.prevNode = nodeOldElement.prevNode;
        nodeOldElement.prevNode = nodeOfInsertElement;


        size++;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }


    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
