
public class NumberConverter {


    public static String inttostr(int number) {

        String[] symbol = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String str = "";
        float sign = Math.signum(number);
        number = Math.abs(number);
        if (sign == 0) {
            return str = "0";
        }

        while (number > 0) {
            int r = number % 10;
            number = number / 10;
            str = symbol[r] + str;

        }

        if (sign < 0) {
            str = "-" + str;

        }

        return (str);
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
        int numLenght = num.length;
        for (String s : num) {
            intnum = (int) (symbol.indexOf(s) * Math.pow(10, numLenght - 1)) + intnum;
            numLenght = numLenght - 1;

        }

        return (sign * intnum);

    }

    public static String dbltostr(double number) {
        String dstr = "";
        double mult = 1;
        int i1;
        double b1;
        int i = 0;
        int sign = (int) Math.signum(number);
        if (sign == 0) {
            dstr = "0.0";

        } else {
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
                dstr = "-" + dstr;

            }
        }

        return dstr;
    }

    public static double strtodbl(String number) {
        String[] num = number.split("\\.");
        int intpart = NumberConverter.strtoint(num[0]);
        int doublpart = NumberConverter.strtoint(num[1]);
        double a = doublpart / Math.pow(10, num[1].length());
        double stdb = 0;
        stdb = (intpart > 0) ? intpart + a : intpart - a;
        return (stdb);
    }


}


