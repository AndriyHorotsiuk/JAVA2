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
            for (String s : strings) System.out.print(s+ " ");
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
        System.out.println(dimChar.toString());
        return dimChar;

    }

    //Method 4
    public static int[][] invertintTwoDim(int[][] arr) {
        int[][] dimInvert = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dimInvert[i][j] = -arr[i][j];
            }
        }
        return dimInvert;
    }

    //Method 5
    public static int maxTwoIntNum(int num1, int num2) {

        return (num1 > num2) ? num1 : num2;
    }

    //Method 6
    public static int maxThreeIntNum(int num1, int num2, int num3) {

        return maxTwoIntNum((maxTwoIntNum(num1, num2)), num3);
    }

    //Method 7
    public static int maxElementOfDimInt(int[] arr) {
        int maxElenent = arr[0];
        for (int i = 1; i < arr.length; i++) {

            maxElenent = maxTwoIntNum(maxElenent, arr[i]);
        }
        return maxElenent;
    }
    //Method 8

    public static String charDimToString(char[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];

        }

        return str;
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

    //Method 11
    public static int indexIntNumOfIntDimByEnd(int a, int[] arr) {

        int indexByEnd = arr.length - indexIntNumOfIntDim(a, arr) - 1;
        return indexByEnd;

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

    public static boolean leapYear(int a) {
        if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0)) {
            return false;
        }
        return true;
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

    //Method 16
    public static void doubleNumThreeAfterPoint(double number) {

        System.out.printf("%.3f", number);
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
    public static boolean repeateValueInArr(byte[] arr) {
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
