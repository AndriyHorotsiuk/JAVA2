public class TwentyMethodsTest {
    public static void main(String[] args) {
        TwentyMethodsTest.invertintTwoDimTest();
        TwentyMethodsTest.maxTwoIntNumTest();
        TwentyMethodsTest.maxThreeIntNumTest();
        TwentyMethodsTest.maxElementOfDimIntTest();
        TwentyMethodsTest.charDimToStringTest();
        TwentyMethodsTest.charSubSequenceTwoDimTest();
        TwentyMethodsTest.indexIntNumOfIntDimTest();
        TwentyMethodsTest.indexIntNumOfIntDimByEndTest();
        TwentyMethodsTest.factorialIntNumTest();
        TwentyMethodsTest.leapYearTest();
        TwentyMethodsTest.dimStrHaveSomeStrTest();
        TwentyMethodsTest.dimIntMultipleOfSomeNumTest();
        TwentyMethodsTest.arrSortAscendingTest();
        TwentyMethodsTest.arrSortDescendingTest();
        TwentyMethodsTest.arrSortAscOrDesc();
        TwentyMethodsTest.repeateValueInArr();
    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }

    /*public static void intTwoDimToCharTest() {

        char [][] result1 = TwentyMethods.intTwoDimToChar(new int[][] {{1, 2, 3}, {4, 5, 6}});

        printResultOfTest(result1[0][0]==char(1), "intTwoDimToChar №3");

    }*/

    //Test  method 4
    public static void invertintTwoDimTest() {

        int[][] result1 = TwentyMethods.invertintTwoDim(new int[][]{{1, 2}, {4, -5}});

        printResultOfTest((result1[0][0] == -1) &&
                (result1[0][1] == -2) &&
                (result1[1][0] == -4) &&
                (result1[1][1] == 5), "invertintTwoDim #4");

    }

    //Test  method 5
    public static void maxTwoIntNumTest() {

        int result1 = TwentyMethods.maxTwoIntNum(5, 15);
        printResultOfTest(result1 == 15, "maxTwoIntNum #5");

    }

    //Test  method 6
    public static void maxThreeIntNumTest() {

        int result1 = TwentyMethods.maxThreeIntNum(5, 15, 89);
        printResultOfTest(result1 == 89, "maxThreeIntNum #6");

    }

    //Test  method 7
    public static void maxElementOfDimIntTest() {

        int result1 = TwentyMethods.maxElementOfDimInt(new int[]{1, 2, 8, 9, -10});
        printResultOfTest(result1 == 9, "maxElementOfDimInt #7");

    }

    //Test  method 8
    public static void charDimToStringTest() {

        String result1 = TwentyMethods.charDimToString(new char[]{'1', '2', '8', '9'});
        printResultOfTest(result1.equals("1289"), "charDimToString #8");

    }

    //Test  method 9
    public static void charSubSequenceTwoDimTest() {

        boolean result1 = TwentyMethods.charSubSequenceTwoDim(new char[]{'1', '2', '8', '9'}, new char[]{'2', '8'});
        printResultOfTest(result1, "charSubSequenceTwoDim #9");

    }

    //Test  method 10
    public static void indexIntNumOfIntDimTest() {

        int result1 = TwentyMethods.indexIntNumOfIntDim(8, new int[]{1, 2, 8, 9, -10});
        printResultOfTest(result1 == 2, "indexIntNumOfIntDimTest #10");

    }

    //Test  method 11
    public static void indexIntNumOfIntDimByEndTest() {

        int result1 = TwentyMethods.indexIntNumOfIntDimByEnd(2, new int[]{1, 2, 8, 9, -10});
        printResultOfTest(result1 == 3, "indexIntNumOfIntDimByEnd #11");

    }

    //Test  method 12
    public static void factorialIntNumTest() {

        int result1 = TwentyMethods.factorialIntNum(5);
        printResultOfTest(result1 == 120, "factorialIntNum #12");

    }

    //Test  method 13
    public static void leapYearTest() {

        boolean result1 = TwentyMethods.leapYear(1992);
        printResultOfTest(result1, "leapYear #13");

    }

    //Test  method 14
    public static void dimStrHaveSomeStrTest() {

        String[] result1 = TwentyMethods.dimStrHaveSomeStr("564", new String[]{"564789", "789", "15647", "7"});

        printResultOfTest((result1[0].equals("564789")) && (result1[1].equals("15647")), "dimStrHaveSomeStr #14");

    }

    //Test  method 15
    public static void dimIntMultipleOfSomeNumTest() {

        int[] result1 = TwentyMethods.dimIntMultipleOfSomeNum(5, new int[]{15, 8, 10, 7});

        printResultOfTest((result1[0] == 15) && (result1[1] == 10), "dimIntMultipleOfSomeNum #15");

    }

    //Test  method 17
    public static void arrSortAscendingTest() {

        int[] result1 = TwentyMethods.arrSortAscending(new int[]{15, 8, 10, 7});

        printResultOfTest((result1[0] == 7) && (result1[1] == 8) &&
                (result1[2] == 10) && (result1[3] == 15), "arrSortAscending #17");

    }

    //Test  method 18
    public static void arrSortDescendingTest() {

        int[] result1 = TwentyMethods.arrSortDescending(new int[]{15, 8, 10, 7});

        printResultOfTest((result1[0] == 15) &&
                (result1[1] == 10) && (result1[2] == 8) && (result1[3] == 7), "arrSortDescending #18");

    }

    //Test  method 19
    public static void arrSortAscOrDesc() {

        int[] result1 = TwentyMethods.arrSortAscOrDesc(false, new int[]{15, 8, 10, 7});

        printResultOfTest((result1[0] == 15) &&
                (result1[1] == 10) && (result1[2] == 8) && (result1[3] == 7), "arrSortAscOrDesc #19");

    }

    public static void repeateValueInArr() {

        boolean result1 = TwentyMethods.repeateValueInArr(new byte[]{15, 8, 10, 7, 7});

        printResultOfTest(result1, "repeateValueInArr #20");

    }


}
