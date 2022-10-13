
public class NumberConverter {


    public static String inttostr(int number) {


        String[] symbol = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String str = "";
        float sign = Math.signum(number);
        number = Math.abs(number);
        while (number > 0) {
            int r = number % 10;
            number = number / 10;
            str = symbol[r] + str;

        }

        if (sign < 0) {
            str = str = "-" + str;

        }
        if (sign == 0) {
            str = "0";
        }
        return (str);
    }

    public static int strtoint(String number) {

        String symbol = "0123456789";
        int intnum = 0;
        String[] num = number.split("");

        int length = num.length;
        if ("-".equals(num[0])) {
            for (int i = 1; i < num.length; i++) {
                length = length - 1;
                intnum = -1 * (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;


            }


        } else {
            for (int i = 0; i < num.length; i++) {
                intnum = (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;
                length = length - 1;

            }


        }

        return (intnum);
    }

    public static String dbltostr(double number) {
        String dstr = "";
        double mult = 1;
        int i1;
        double b1;
        int i = 0;
        double sign = Math.signum(number);
        number = Math.abs(number);

        do {
            i++;
            mult *= 10;

            b1 = number * mult;

            i1 = (int) b1;
        } while (i1 / mult - number != 0);

        String intdbl = NumberConverter.inttostr(i1);

        dstr = intdbl.substring(0, intdbl.length() - i) + "." + intdbl.substring(intdbl.length() - i);


        if (sign < 0) {
            dstr = "-" + intdbl.substring(0, intdbl.length() - i) + "." + intdbl.substring(intdbl.length() - i);
        }
        if (sign == 0) {
            dstr = "0";
        }
        return dstr;
    }

    public static double strtodbl(String number) {
        String[] num = number.split("\\.");
        int intpart = NumberConverter.strtoint(num[0]);
        int doublpart = NumberConverter.strtoint(num[1]);
        double a = doublpart / Math.pow(10, num[1].length());
        double stdb = 0;
        if (intpart > 0) {
            stdb = intpart + a;
        } else {
            stdb = intpart - a;
        }

        return (stdb);
    }


}


