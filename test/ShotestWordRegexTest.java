public class ShotestWordRegexTest {
    public static void main(String[] args) {
        ShortestWordTest.shortestWordOfStringTest();

    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }

    public static void shortestWordOfStringTest() {

        int result;
        result = ShotestWordRegex.shortestWordOfStringRegex("London is the capital of Great Britain");
        printResultOfTest(result == 3, "ShortestWordOfString");

        result = ShotestWordRegex.shortestWordOfStringRegex("I've already improved my listening   & talking skills - it's good practice!! Compared to my very first private English Course Learning English with the BBC (started in 1988)  ");
        printResultOfTest(result == 2, "ShortestWordOfString");

        result = ShotestWordRegex.shortestWordOfStringRegex("I'v'e Well-received!!  ");

        printResultOfTest(result == 13, "ShortestWordOfString");


        result = ShotestWordRegex.shortestWordOfStringRegex("sad--as tic-tac-toe");

        printResultOfTest(result == 11, "ShortestWordOfString");

    }
}
