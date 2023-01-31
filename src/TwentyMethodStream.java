import java.util.Arrays;

/*public class TwentyMethodStream {
    //Method 1
    public static void printDimChar(char[] arr) {
       Arrays.stream(arr).forEach(ell -> System.out.print(ell + " "));

    }

    //Method 2
    public static void printTwoDimString(String[][] arr) {
        Arrays.stream(arr).flatMap( i -> Arrays.stream(i) ).forEach(ell -> System.out.print(ell + " "));


    }
    //Method 3
public static char[][] intTwoDimToChar(int[][] arr) {
        return Arrays.stream(arr).flatMap( i -> Arrays.stream(i) ).map(ell -> (char)ell ).toArray();
    }

    //Method 4
public static int[][] invertintTwoDim(int[][] arr) {

        return Arrays.stream(arr).flatMap( i -> Arrays.stream(i) ).map(ell -> -ell ).toArray();;
    }

  //Method 7
   /*public static int maxElementOfDimInt(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    //Method 9
    public static boolean charSubSequenceTwoDim(char[] arr, char[] subarr) {
        int arrSize = 0;
        for (char ellemetArr : arr) {

            if (subarr[0] == ellemetArr) {
                arrSize++;
            }

        }
        if (arrSize == 0) {
            return false;
        }

        int[] indexOfArr0 = new int[arrSize];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (subarr[0] == arr[i]) {
                indexOfArr0[j++] = i;

            }
        }

        for (int i : indexOfArr0) {
            int interactions = 0;
            for (char c : subarr) {
                while (arr[i] == c) {
                    i++;
                    interactions++;
                }
                if (interactions == subarr.length) {
                    return true;
                }
            }

        }

        return false;

    }

    //Method 10
    public static int indexIntNumOfIntDim(int a, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    //Method 14
    public static String[] dimStrHaveSomeStr(String str, String[] arr) {
        int arrSize = 0;

        for (String ellemetArr : arr) {

            if (ellemetArr.contains(str)) {
                arrSize++;

            }
        }
        String[] arrHaveSomeStr = new String[arrSize];
        int j = 0;
        for (String s : arr) {

            if (s.contains(str)) {
                arrHaveSomeStr[j++] = s;

            }
        }

        return arrHaveSomeStr;
    }


    //Method 15
    public static int[] dimIntMultipleOfSomeNum(int a, int[] arr) {
        int arrSize = 0;

        for (int ellemetArr : arr) {

            if (ellemetArr % a == 0) {
                arrSize++;

            }
        }
        int[] arrMultipleOfSomeNum = new int[arrSize];

        int j = 0;
        for (int ellemetArr : arr) {

            if (ellemetArr % a == 0) {
                arrMultipleOfSomeNum[j++] = ellemetArr;
            }
        }

        return arrMultipleOfSomeNum;
    }


    //Method 17
    public static int[] arrSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int exchange = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = exchange;
                }
            }
        }
        return arr;
    }

    //Method 18
    public static int[] arrSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int exchange = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = exchange;
                }
            }
        }
        return arr;
    }

}*/
