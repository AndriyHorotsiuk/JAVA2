import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List {


    private int sizeArray = 10;
    private int sizeList = 0;
    private int resizeMultiplier = 2;
    private Object[] myArrayList = new Object[sizeArray];


    private Object[] arrcopy(Object[] arrFrom, Object[] arrTo) {
        for (int i = 0; i < arrFrom.length - 1; i++) {
            arrTo[i] = arrFrom[i];
        }
        return arrTo;
    }


    @Override
    public boolean add(Object ell) {
        if (sizeList == sizeArray) {

            if (sizeArray == Integer.MAX_VALUE) {
                return false;
            }

            if (sizeArray > Integer.MAX_VALUE / resizeMultiplier) {
                sizeArray = Integer.MAX_VALUE;
            } else {
                sizeArray = resizeMultiplier * sizeArray;
            }
            Object[] temporaryArray = new Object[sizeArray];
            myArrayList = arrcopy(myArrayList, temporaryArray);
        }

        myArrayList[sizeList] = ell;
        sizeList++;
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
        return sizeList;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= sizeList) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < sizeList; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
        myArrayList[sizeList] = null;
        sizeList--;

        if (sizeArray / sizeList > resizeMultiplier) {
            sizeArray = (int) (sizeArray / resizeMultiplier);
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
        return (sizeList == 0);
    }

    @Override
    public void clear() {
        sizeArray = 10;
        sizeList = 0;
        myArrayList = new Object[sizeArray];

    }


    @Override
    public Object get(int index) {
        return (T) myArrayList[index];
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < sizeList; i++) {
            if (myArrayList[i].equals(o)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = sizeList; i >= 0; i--) {
            if (myArrayList[i].equals(o)) {
                return i;
            }
        }
        return -1;
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
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

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
