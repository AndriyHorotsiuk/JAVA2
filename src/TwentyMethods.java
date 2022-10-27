
import java.util.ArrayList;

public class TwentyMethods {
    //Method 1
    public static void printDimChar(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }

    //Method 2
    public static void printTwoDimString(String[][] arr) {
        for (String[] strings : arr) {
            for (int j = 0; j < arr[0].length; j++) System.out.print(strings[j] + " ");
            System.out.println();
        }
    }

    //Method 3
    public static char[][] intTwoDimToChar(int[][] arr) {
        char[][] dimChar = new char[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dimChar[i][j] = ((char) arr[i][j]);
            }
        }
        return dimChar;

    }

    //Method 4
    public static void invertintTwoDim(int[][] arr) {
        int[][] dimInvert = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dimInvert[i][j] = -arr[i][j];
            }
        }

    }

    //Method 5
    public static int maxTwoIntNum(int num1, int num2) {
        return Math.max(num1, num2);
    }

    //Method 6
    public static int maxThreeIntNum(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    //Method 7
    public static int maxElementOfDimInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[0] = Math.max(arr[0], arr[i]);
        }
        return arr[0];
    }
    //Method 8

    public static String charDimToString(char[] arr) {
        return String.copyValueOf(arr);
    }

    //Method 9
    public static boolean charSubsequenceTwoDim(char[] arr, char[] subarr) {
        String strarr = charDimToString(arr);
        String sub = charDimToString(subarr);
        return strarr.contains(sub);
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

    //Method 12
    public static int factorialIntNum(int a) {
        int factorial = a;
        for (int i = 1; i < a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    //Method 13

    public static void leapYear(int a) {
        if (a % 4 == 0) {
            System.out.println("Year is leap");
        } else {
            System.out.println("Year is not leap");
        }

    }

    //Method 14
    public static ArrayList<String> DimStrHaveSomeStr(String str, String[] arr) {
        ArrayList<String> subStr = new ArrayList<>();
        for (String s : arr) {
            if (s.contains(str)) {
                subStr.add(s);
            }

        }
        return subStr;
    }

    //Method 15
    public static ArrayList<Integer> DimIntMultipleOfSomeNum(int a, int[] arr) {
        ArrayList<Integer> multipleOfNum = new ArrayList<>();
        for (int j : arr) {
            if (j % a == 0) {
                multipleOfNum.add(j);
            }

        }
        return multipleOfNum;
    }

    //Method 16
    public static void arrOfDoubleNumThreeAfterPointRound(double[] arr) {
        ArrayList<Double> doubleNumThreeAfterPoint = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(arr[i] * 1000);
            doubleNumThreeAfterPoint.add(arr[i] / 1000);

        }
        System.out.println(doubleNumThreeAfterPoint.toString());
    }

    public static void arrOfDoubleNumThreeAfterPoint(double[] arr) {
        ArrayList<Double> doubleNumThreeAfterPoint = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.floor(arr[i] * 1000);
            doubleNumThreeAfterPoint.add(arr[i] / 1000);

        }
        System.out.println(doubleNumThreeAfterPoint.toString());
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
    //Method 19

    public static int[] arrSortAscOrDesc(boolean AreSortByAsc, int[] arr) {
        if (AreSortByAsc) {
            return arrSortAscending(arr);
        }
        return arrSortDescending(arr);
    }

    //Method 20
    public static boolean RepeateValueInArr(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }

        }
        return false;
    }

}
