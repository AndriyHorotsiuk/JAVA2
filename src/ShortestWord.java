

public class ShortestWord {


    public static boolean isLetter(char symbol) {
      return ((symbol > 'A') && (symbol < 'Z') || (symbol > 'a') && (symbol < 'z')) ;

    }


    public static String deletNotLetterRight(String str) {

        if (str.length() == 0) {

            return "";
        }

        while ((str.length() > 0) && !isLetter(str.charAt(str.length() - 1))) {
            str = str.substring(0, str.length() - 1);

        }
        return str;

    }

    public static String deletNotLetterLeft(String str) {

        if (str.length() == 0) {

            return "";
        }
        while ((str.length() > 0) && !isLetter(str.charAt(0))) {
            str = str.substring(1);

        }

        return str;

    }


    public static String deletNotLetterWord(String str) {
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
            s = deletNotLetterRight(s);
            s = deletNotLetterLeft(s);
            s = deletNotLetterWord(s);

            if (minLengtWord > s.length() && s.length() != 0) {
                minLengtWord = s.length();
            }

        }
        return minLengtWord;
    }
}