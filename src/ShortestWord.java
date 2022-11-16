

public class ShortestWord {


    public static boolean isLetter(char symbol) {
      return ((symbol > 'A') && (symbol < 'Z') || (symbol > 'a') && (symbol < 'z')) ;

    }


    public static String deletSuperfluousSymbolRight(String str) {

        if (str.length() == 0) {

            return "";
        }

        while ((str.length() > 0) && !isLetter(str.charAt(str.length() - 1))) {
            str = str.substring(0, str.length() - 1);

        }
        return str;

    }

    public static String deletSuperfluousSymbolLeft(String str) {

        if (str.length() == 0) {

            return "";
        }
        while ((str.length() > 0) && !isLetter(str.charAt(0))) {
            str = str.substring(1);

        }

        return str;

    }


    public static String deletSuperfluousWord(String str) {
        int numberOfNotSuperfluousWord = 0;
        int numberOfSuperfluousWord = 0;
        String word = str;
        while (word.length() > 0) {
            if (!isLetter(word.charAt(0))) {
                numberOfSuperfluousWord++;
                if (( (word.charAt(0)) == 45) || ( (word.charAt(0)) == 39)) {
                    numberOfNotSuperfluousWord++;
                }
            }
            word = word.substring(1);
        }

        if ((numberOfSuperfluousWord == 0) || (numberOfNotSuperfluousWord == 1)) {
            return str;
        }
        return "";


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