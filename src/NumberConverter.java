import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NumberConverter {

    public static String inttostr(int number) {

        String[] symbol = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String str = "";
        if (number == 0) {
            return "0";
        }
        boolean isNegative = number < 0;


        number = Math.abs(number);

        while (number > 0) {
            int r = number % 10;
            number = number / 10;
            str = symbol[r] + str;

        }

        if (isNegative) {
            str = "-" + str;
        }

        return str;
    }

    public static int strtoint(String number) {
        String symbol = "0123456789";
        int intnum = 0;
        int sign = 1;
        String festSymbol = String.valueOf(number.charAt(0));
        if (festSymbol.equals("-")) {
            number = number.substring(1);
            sign = -1;
        }
        String[] num = number.split("");
        for (String s : num) {
            intnum = symbol.indexOf(s) + intnum * 10;
        }
        return (sign * intnum);
    }

    public static String dbltostr(double number) {
        String sing = "";
        double mult = 1;
        int i1;
        double b1;
        int i = 0;
        if (number == 0) {
            return "0.0";
        }

        if (number < 0) {
            sing = "-";
        }
        number = Math.abs(number);

        do {
            i++;
            mult *= 10;
            b1 = number * mult;
            i1 = (int) b1;
        } while (i1 / mult - number != 0);

        String intdbl = NumberConverter.inttostr(i1);

        var natural = intdbl.substring(0, intdbl.length() - i);
        var real = intdbl.substring(intdbl.length() - i);

        return sing + natural + "." + real;
    }

    public static double strtodbl(String number) {
        String[] num = number.split("\\.");
        int intpart = NumberConverter.strtoint(num[0]);
        int doublpart = NumberConverter.strtoint(num[1]);
        double a = doublpart / Math.pow(10, num[1].length());
        return (intpart > 0) ? intpart + a : intpart - a;
    }
}

