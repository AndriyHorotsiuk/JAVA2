public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();
        NumberConverterTest.strtointTest();
        NumberConverterTest.dbltostrTest();
        NumberConverterTest.strtodblTest();

    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            // System.out.println("method " + methodName + "test is successful");
            System.out.println(String.format("method %s test is successful", methodName));
        } else {
            System.out.println(String.format("method %s test is fail", methodName));
        }
    }

    /*
        public static void comparison(String result1, String result2, String iftrue, String ifrail) {
            if (result2.equals(result1)) {
                System.out.println(iftrue);
            } else {
                System.out.println(ifrail);
            }

        }

        public static void comparison(double result1, double result2, String iftrue, String ifrail) {

            if (result1 == result2) {
                System.out.println(iftrue);
            } else {
                System.out.println(ifrail);
            }

        }
    */
    public static void inttostrTest() {

        String result1 = NumberConverter.inttostr(15);
        String result2 = NumberConverter.inttostr(-15);
        printResultOfTest(result1.equals("15"), "inttostr");
    }

    public static void strtointTest() {

        int result1 = NumberConverter.strtoint("15");
        int result2 = NumberConverter.strtoint("-15");
        printResultOfTest(result1 == 15, "strtoint");
    }

    public static void dbltostrTest() {

        String result1 = NumberConverter.dbltostr(15.5);
        String result2 = NumberConverter.dbltostr(-15.5);
        printResultOfTest(result1.equals("15.5"), "dbltostr");
    }


    public static void strtodblTest() {

        double result1 = NumberConverter.strtodbl("15.5");
        double result2 = NumberConverter.strtodbl("-15.5");
        printResultOfTest(result1 == 15.5, "strtoint");
    }
}
