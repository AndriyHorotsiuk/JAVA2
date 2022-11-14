public class ShortestWordTest {
    public static void main(String[] args) {
        ShortestWordTest.ShortestWordOfStringTest();

    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }

    public static void ShortestWordOfStringTest() {

        int result1 = ShortestWord.ShortestWordOfString("London is the capital of Great Britain");
        printResultOfTest(result1 == 2, "ShortestWordOfString");

    }
}
