import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class NamberConverter {
    public static void inttostr (){
        System.out.println("Input namber for converter to String type");
        Scanner scan =new Scanner(System.in);
        int namber=scan.nextInt();

       String[] symbol = new String[] {"0","1","2","3","4","5","6","7","8","9"};
         String str="";
if (namber>0) {
    while (namber > 0) {
        int r = namber % 10;
        namber = namber / 10;
        str = symbol[r] + str;

    }

        System.out.println("Conver to String " + str);

}
   else { namber=Math.abs(namber);
            while (namber > 0) {
                int r = namber % 10;
                namber = namber / 10;
                str = symbol[r] + str;

        }
    System.out.println("Conver to String " + "-" + str);

    }
}
    public static void strtoint () {
        System.out.println("Input namber for converter to int type");
        Scanner scan = new Scanner(System.in);
        String namber = scan.nextLine();

        String symbol = "0123456789";
        int intnam = 0;
        String[] nam = namber.split("");

        int length = nam.length;
        if ("-".equals(nam[0])) {
            for (int i = 1; i < nam.length; i++) {
                length = length - 1;
                intnam = (int) (symbol.indexOf(nam[i]) * Math.pow(10, length - 1)) + intnam;


            }
            System.out.println(-intnam);

        } else {
            for (int i = 0; i < nam.length; i++) {
                intnam = (int) (symbol.indexOf(nam[i]) * Math.pow(10, length - 1)) + intnam;
                length = length - 1;

            }
            System.out.println(intnam);

        }

    }

}