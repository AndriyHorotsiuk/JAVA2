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


    private Node getNode(int index) {
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
            last = newNode;
            size++;
            return true;
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
        if (index == size) {
            add(element);
        }
        Node oldNode = getNode(index);
        Node newNode = new Node<>(oldNode.prevNode, element, oldNode);
        oldNode.prevNode = newNode;

        size++;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public Object remove(int index) {
        T removeElement = getNode(index).elementNode;
        if (index == 0) {
            first = first.nextNode;
            first.nextNode.prevNode = first;
        }
        if (index == size - 1) {
            last = last.prevNode;
            last.prevNode.nextNode = null;
        }
        Node beforeNode = getNode(index - 1);
        Node afterNode = getNode(index + 1);

        beforeNode.nextNode = afterNode;
        afterNode.prevNode = beforeNode;
        size--;

        return removeElement;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public void clear() {
        first == null;
        last == null;
        size = 0;

    }

    @Override
    public Object set(int index, Object element) {

        Node nodeOfInsertElement = getNode(index);
       T setElement = (T) nodeOfInsertElement.elementNode;
        nodeOfInsertElement.elementNode = element;
        return setElement;
    }

    @Override
    public boolean contains(Object o) {

        int i = 0;
        while (i < size) {
            if (get(i) == o) {
                return true;
            }
            i++;
        }
        return false;
    }

    public Object getFirst() {
        return first;
    }

    public Object getLast() {
        return last;
    }


    @Override
    public boolean remove(Object o) {


        return true;
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
