import java.math.BigDecimal;

public class NamberConverter {


    public static String inttostr (int number){
        //System.out.println("Input namber for converter to String type");
        //Scanner scan =new Scanner(System.in);
        //int namber=scan.nextInt();

       String[] symbol = new String[] {"0","1","2","3","4","5","6","7","8","9"};
         String str="";
if (number>0) {
    while (number > 0) {
        int r = number % 10;
        number = number / 10;
        str = symbol[r] + str;

    }

        System.out.println("Conver to String " + str);

}
   else { number=Math.abs(number);
            while (number > 0) {
                int r = number % 10;
                number = number / 10;
                str = symbol[r] + str;

        }
    str="-"+str;

    }
   System.out.println(str);
        return (str);
}
    public static int strtoint (String number) {
       // System.out.println("Input namber for converter to int type");
      //  Scanner scan = new Scanner(System.in);
       // String namber = scan.nextLine();

        String symbol = "0123456789";
        int intnum = 0;
        String[] num = number.split("");

        int length = num.length;
        if ("-".equals(num[0])) {
            for (int i = 1; i < num.length; i++) {
                length = length - 1;
                intnum = (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;


            }
            System.out.println(-intnum);

        } else {
            for (int i = 0; i < num.length; i++) {
                intnum = (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;
                length = length - 1;

            }
            System.out.println(intnum);

        }
        return (intnum);
    }
   /* public static void dbltostr ( double number){

      int intpartnamber= (int) Math.nextDown(number);
      String intdbl=  NamberConverter.inttostr(intpartnamber);



        double b=number-(int)number;
        System.out.println("b=" + b);
        System.out.println(number);
        System.out.println(intpartnamber);
        String[] symbol = new String[] {"0","1","2","3","4","5","6","7","8","9"};
        String str="";


           while (b!=0) {
                b = b*10;

                int r=(int) b;
                str = symbol[r] + str;
                b=b-r;

            }
    }*/
    public static double strtodbl (String number){
      String[] num=number.split("\\.")  ;
      int intpart=NamberConverter.strtoint(num[0]);
        int doublpart= NamberConverter.strtoint(num[1]);
        double a =doublpart/Math.pow(10,num[1].length());

      System.out.println(intpart+a);
      return (a);
    }



}