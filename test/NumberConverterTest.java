public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();
        NumberConverterTest.strtointTest();
        NumberConverterTest.dbltostrTest();
        NumberConverterTest.strtodblTest();

    }

    public static void inttostrTest() {

        String result1 = NumberConverter.inttostr(15);
        String result2 = NumberConverter.inttostr(-15);
        if (("-15".equals(result2))) {
            System.out.println("method inttostr test is successful");
        } else {
            System.out.println("method inttostr test is fail");
        }
    }

    public static void strtointTest() {

        int result1 = NumberConverter.strtoint("15");
        int result2 = NumberConverter.strtoint("-15");
        if ((15 == result1) && (-15 == result2)) {
            System.out.println("method strtoint test is successful");
        } else {
            System.out.println("method strtoint test is fail");
        }

    }

    public static void dbltostrTest() {

        String result1 = NumberConverter.dbltostr(15.5);
        String result2 = NumberConverter.dbltostr(-15.5);
        if ("15.5".equals(result1) && "-15.5".equals(result2)) {
            System.out.println("method dbltostr test is successful");
        } else {
            System.out.println("method dbltostr test is fail");
        }

    }

    public static void strtodblTest() {

        double result1 = NumberConverter.strtodbl("15.5");
        double result2 = NumberConverter.strtodbl("-15.5");
        if ((15.5 == result1) && (-15.5 == result2)) {
            System.out.println("method strtodbl test is successful");
        } else {
            System.out.println("method strtodbl test is fail");
        }

    }
}
