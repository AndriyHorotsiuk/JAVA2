import java.util.Scanner;

public class addsAllDigitsNum {
    public static void addsAllDigitsIntNum() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000:");
        int sumNum = 0;
        int number = scanner.nextInt();
        int number0 = number;
        while (number > 0) {
            sumNum = number % 10 + sumNum;
            number = number / 10;
        }
        System.out.println("The sum of all digits in " + number0 + " is " + sumNum);
    }
}
