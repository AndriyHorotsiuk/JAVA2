import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List {
    /* public Array_List (int sizeArrayList){

     }*/
    private int sizeArray = 4;
    private int listSize = 0;
    private Object[] myArrayList = new Object[sizeArray];


    private Object[] arrcopy(Object[] arrFrom, Object[] arrTo) {
        for (int i = 0; i < arrFrom.length - 1; i++) {
            arrTo[i] = arrFrom[i];
        }
        return arrTo;
    }


    @Override
    public boolean add(Object ell) {
        if (listSize == sizeArray - 1) {
            try {
                sizeArray = 2 * sizeArray;
            } catch (OutOfMemoryError e) {
                System.out.println("error");
            }

            Object[] temporaryArray = new Object[sizeArray];
            temporaryArray = arrcopy(myArrayList, temporaryArray);
            myArrayList = temporaryArray;

        }
        myArrayList[listSize] = ell;
        listSize++;
        return true;
    }

    @Override
    public int indexOf(Object obj) {

        for (int i = 0; i < myArrayList.length - 1; i++) {
            if (myArrayList[i].equals(obj)) {
                return i;
            }
        }
        return -1;

    }


    public int size() {
        return listSize;

    }

    @Override
    public Object remove(int index) {

        for (int i = index; i < listSize; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
        myArrayList[listSize] = null;
        listSize--;

        if (((myArrayList.length - 1) / listSize) > 2) {
            sizeArray = sizeArray / 2 - sizeArray % 2;
            Object[] temporaryArray = new Object[sizeArray];
            for (int i = 0; i < sizeArray; i++) {
                temporaryArray[i] = myArrayList[i];
            }
            myArrayList = temporaryArray;

        }
        return myArrayList;
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
