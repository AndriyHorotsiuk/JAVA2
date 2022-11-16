

public class ShortestWord {


    public static boolean ifSuperfluousSymbol(char symbol) {
        if (((int) symbol > 64) && ((int) symbol < 91) || ((int) symbol > 96) && ((int) symbol < 123)) {
            return false;
        }
        return true;
    }


    public static String deletSuperfluousSymbolRight(String str) {

        if (str.length() == 0) {

            return "";
        } else {
            while ((str.length() > 0) && ifSuperfluousSymbol(str.charAt(str.length() - 1))) {
                str = str.substring(0, str.length() - 1);
            }

        }
        return str;

    }

    public static String deletSuperfluousSymbolLeft(String str) {

        if (str.length() == 0) {

            return "";
        } else {
            while ((str.length() > 0) && ifSuperfluousSymbol(str.charAt(0))) {
                str = str.substring(1);
            }

        }

        return str;

    }


    public static String deletSuperfluousWord(String str) {
        int numberOfNotSuperfluousWord = 0;
        int numberOfSuperfluousWord = 0;
        String word = str;
        while (word.length() > 0) {
            if (ifSuperfluousSymbol(word.charAt(0))) {
                numberOfSuperfluousWord++;
                if (((int) (word.charAt(0)) == 45) || ((int) (word.charAt(0)) == 39)) {
                    numberOfNotSuperfluousWord++;
                }
            }
            word = word.substring(1);
        }

        if ((numberOfSuperfluousWord == 0) || (numberOfNotSuperfluousWord == 1)) {
            return str;
        } else {
            return "";

        }


    }


    public static int shortestWordOfString(String str) {
        int minLengtWord = str.length();
        String[] arrword = str.split(" ");
        for (String s : arrword) {
            s = deletSuperfluousSymbolRight(s);
            s = deletSuperfluousSymbolLeft(s);
            s = deletSuperfluousWord(s);

            if (minLengtWord > s.length() && s.length() != 0) {
                minLengtWord = s.length();
            }

        }
        return minLengtWord;
    }
}