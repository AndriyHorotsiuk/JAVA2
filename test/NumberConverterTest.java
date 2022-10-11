public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();
        NumberConverterTest.strtointTest();
        NumberConverterTest.dbltostrTest();
        NumberConverterTest.strtodblTest();

    }

    public static void comparison(String result1, String result2,String iftrue, String ifrail) {
        if (result2.equals(result1)){
            System.out.println(iftrue);
        }else {
            System.out.println(ifrail);
        }

    }

    public static void comparison(double result1, double result2,String iftrue, String ifrail) {

        if (result1 == result2){
            System.out.println(iftrue);
        }else {
            System.out.println(ifrail);
        }

    }

    public static void inttostrTest() {

        String result1 = NumberConverter.inttostr(15);
        String result2 = NumberConverter.inttostr(-15);
        comparison("15",result1,"Test1 positive: method inttostr test is successful","Test1 positive: method inttostr test is fail");
        comparison("-15",result2,"Test2 negative: method inttostr test is successful","Test2: method inttostr test is fail");
    }

    public static void strtointTest() {

        int result1 = NumberConverter.strtoint("15");
        int result2 = NumberConverter.strtoint("-15");
        comparison(15,result1,"Test1 positive: method strtoint test is successful","Test1 positive: method strtoint test is fail");
        comparison(-15,result2,"Test2 negative: method strtoint test is successful","Test2 negative: method strtoint test is fail");
    }

    public static void dbltostrTest() {

        String result1 = NumberConverter.dbltostr(15.5);
        String result2 = NumberConverter.dbltostr(-15.5);
        comparison("15.5",result1,"Test1 positive: method dbltostr test is successful","Test1 positive: method dbltostr test is fail");
        comparison("-15.5",result2,"Test2 negative: method dbltostr test is successful","Test2 negative: method dbltostr test is fail");
        }



    public static void strtodblTest() {

        double result1 = NumberConverter.strtodbl("15.5");
        double result2 = NumberConverter.strtodbl("-15.5");
        comparison(15.5,result1,"Test1 positive: method strtodbl test is successful","Test1 positive: method strtodbl test is fail");
        comparison(-15.5,result2,"Test2 negative: method strtodbl test is successful","Test2 negative: method strtodbl test is fail");
    }
}
