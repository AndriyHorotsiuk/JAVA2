public class PanagramTest {
    public static void main(String[] args) {
        PanagramTest.shortestWordOfStringTest();

    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }

    public static void shortestWordOfStringTest() {

        boolean result;
        result = Panagram.isPanagram(" A quick brown fox jumps over the lazy dog .");
        printResultOfTest(result, "Panagram");


    }
}
