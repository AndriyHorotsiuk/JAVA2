public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();
        NumberConverterTest.strtointTest();
        NumberConverterTest.dbltostrTest();
        NumberConverterTest.strtodblTest();


    }

    public static void inttostrTest() {

        int number1 = 15;
        String result1 = NumberConverter.inttostr(number1);
        int number2 = -15;
        String result2 = NumberConverter.inttostr(number2);
        if (("-15".equals(result2))) {
            System.out.println("inttostrTest is successful");
        } else {
            System.out.println("inttostrTest fail");
        }
    }

    public static void strtointTest() {

        String number1 = "15";
        int result1 = NumberConverter.strtoint(number1);
        String number2 = "-15";
        int result2 = NumberConverter.strtoint(number2);
        if ((15 == result1) && (-15 == result2)) {
            System.out.println("strtointTest  is successful");
        } else {
            System.out.println("strtointTest fail");
        }

    }

    public static void dbltostrTest() {
        double number1 = 15.5;
        String result1 = NumberConverter.dbltostr(number1);
        double number2 = -15.5;
        String result2 = NumberConverter.dbltostr(number2);
        if ("15.5".equals(result1)&&"-15.5".equals(result2)) {
            System.out.println("dbltostrTest  is successful");
        } else {
            System.out.println("dbltostrTest fail");
        }

    }

    public static void strtodblTest() {

        String number1 = "15.5";
        double result1 = NumberConverter.strtodbl(number1);
        String number2 = "-15.5";
        double result2 = NumberConverter.strtodbl(number2);
        if ((15.5 == result1) && (-15.5 == result2)) {
            System.out.println("sstrtodblTest is successful");
        } else {
            System.out.println("strtodblTest fail");
        }

    }
}
