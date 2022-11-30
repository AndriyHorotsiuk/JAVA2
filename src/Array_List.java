public class Array_List<T> {
    /* public Array_List (int sizeArrayList){

     }*/
    private int sizeArrayList = 10;

    private Object[] array_List = new Object[sizeArrayList];

    int lengthPaddingArr = 0;

    public Object[] arrcopy(Object[] arrFrom, Object[] arrTo) {
        for (int i = 0; i < arrFrom.length - 1; i++) {
            arrTo[i] = arrFrom[i];
        }
        return arrTo;
    }

    public void add(T ell) {
        if (lengthPaddingArr > (array_List.length - 1)) {
            Object[] temporaryArray = new Object[sizeArrayList];
            temporaryArray = arrcopy(array_List, temporaryArray);
            sizeArrayList = 2 * sizeArrayList;
            Object[] array_List = new Object[sizeArrayList];
            array_List = arrcopy(temporaryArray, array_List);
        }
        array_List[lengthPaddingArr] = ell;
        lengthPaddingArr++;

    }

    public int size() {
        return lengthPaddingArr;


    }

    public int indexOf(T obj) {
        for (int i = 0; i < array_List.length - 1; i++) {
            if (array_List[i].equals(obj)) {
                return i;
            }
        }
        return -1;

    }
}
