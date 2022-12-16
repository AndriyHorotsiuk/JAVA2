public class MaxSumSubArrayTest {
    public static void main(String[] args) {
        MaxSumSubArrayTest.maxSumSubArrTest();
    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }

    public static void maxSumSubArrTest() {
        int result1 = MaxSumSubArray.maxSumSubArr(new int[]{-1, 5, 6, -10, 5, 10, 5});
        printResultOfTest(result1 == 21, "maxSumSubArr");
    }
}
