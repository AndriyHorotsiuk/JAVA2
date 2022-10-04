public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();


    }

    public static void inttostrTest() {

        int number = 15;
        String result = NumberConverter.inttostr(number);
        if ("15".equals(result)) {
            System.out.println("test is successful");
        } else {
            System.out.println("fail");
        }
    }

    public void strtointTest(String number) {

    }

    public void dbltostrTest(double number) {

    }

    public void strtodblTest(String number) {

    }
}
