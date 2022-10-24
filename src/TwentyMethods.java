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
    public static int maxTwoDimInt(int num1, int num2) {
        return Math.max(num1, num2);
    }

    //Method 6
    public static int maxThreeInt(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    //Method 7
    public static int maxDimInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[0] = Math.max(arr[0], arr[i]);
        }
        return arr[0];
    }
    //Method 8

    public static String charDimToString(char[] arr) {
        String str = String.copyValueOf(arr);
        return str;
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


}