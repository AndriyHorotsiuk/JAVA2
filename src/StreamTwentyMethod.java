import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTwentyMethod {
    //Method 1
    public static void printDimChar(char[] arr) {
       Stream<Character> charStream = new String(arr).chars().mapToObj(i -> (char) i).forEach(System.out::println);

    }

    //Method 2 Arrays.stream(arr).forEach(ell->(Arrays.stream(ell).forEach(System.out::println)));
    public static void printTwoDimString(String[][] arr) {
        Arrays.stream(arr).forEach(ell -> Arrays.stream(ell).forEach(System.out::println));

    }


    //Method 3
    public static char[][] intTwoDimToChar(int[][] arr) {

        return (char[][]) Arrays.stream(arr).map(ell -> Arrays.stream(ell).map(i -> (char)i).toArray()).toArray()

    }

    //Method 4
    public static int[][] invertintTwoDim(int[][] arr) {

        return (int[][]) Arrays.stream(arr).map(ell -> Arrays.stream(ell).map(i -> -i).toArray()).toArray();
    }


    //Method 7
    public static int maxElementOfDimInt(int[] arr) {

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
        return Arrays.asList(arr).indexOf(a);
    }





    //Method 14
    public static String[] dimStrHaveSomeStr(String str, String[] arr) {

        return Arrays.stream(arr).filter(str::substring).toArray();
    }


    //Method 15
    public static int[] dimIntMultipleOfSomeNum(int a, int[] arr) {

        return Arrays.stream(arr).filter(ell -> ell % a = 0).toArray();

    }


    //Method 17
    public static int[] arrSortAscending(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }

    //Method 18
    public static int[] arrSortDescending(int[] arr) {
        return Arrays.stream(arr).sorted(Comparator.reverseOrder()).toArray();
    }


}
