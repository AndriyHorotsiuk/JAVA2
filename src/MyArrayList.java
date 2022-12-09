import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class  MyArrayList<T> implements List {
    /* public Array_List (int sizeArrayList){

     }*/
    static int sizeArrayList = 10;

    private Object[] array_List = new Object[sizeArrayList];

   private int listSize = 0;

    private Object[] arrcopy(Object[] arrFrom, Object[] arrTo) {
        for (int i = 0; i < arrFrom.length - 1; i++) {
            arrTo[i] = arrFrom[i];
        }
        return arrTo;
    }



    @Override
    public boolean add(Object ell) {
        if (listSize == (array_List.length - 1)) {
            Object[] temporaryArray = new Object[sizeArrayList];
            temporaryArray = arrcopy(array_List, temporaryArray);
            sizeArrayList = 2 * sizeArrayList;
            Object[] array_List = new Object[sizeArrayList];
            array_List = arrcopy(temporaryArray, array_List);
        }
        array_List[listSize] = ell;
        listSize++;

        return true;
    }
    @Override
    public int indexOf(Object obj) {

        for (int i = 0; i < array_List.length - 1; i++) {
            if (array_List[i].equals(obj)) {
                return i;
            }
        }
        return -1;

    }



    public int size() {
        return listSize;

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
    public boolean remove(Object o) {
        return false;
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
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
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
