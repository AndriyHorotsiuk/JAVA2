import java.util.ArrayList;
import java.util.Collections;

public class ShortestWord {

    static char[] superfluousSymbolChar = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '"', '(',')', '0', '-', '_', '+', '=', '{', '}', '[', ']', ' ', '\'', ';', ':', '|', '?', ',', '<', '>'};
    static String[] superfluousSymbolString = new String[]{"!","'", "-", "@", "#", "$", "%", "^", "&", "*", "(",")", "0", "_", "+", "=", "{", "}", "[", "]", " ", ";", "\"", ":", "|", "?", ",", "<", ">"};
    static String[] superfluousSymbolWithoutAllowedinMiddleWord = new String[]{"!", "@", "#", "$", "%", "^", "&", "*", "(",")", "0", "_", "+", "=", "{", "}", "[", "]", " ", ";", "\"", ":", "|", "?", ",", "<", ">"};
    public static int indexOf(char a, char[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    return i;

                }
            }
            return -1;
        }
    }

    public static int indexOf(String a, String[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (a.equals(arr[i])) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static String deletSuperfluousSymbolRight(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (indexOf(str, superfluousSymbolString) > 0) {
            return "";
        }
        while (indexOf(str.charAt(str.length() - 1), superfluousSymbolChar) != -1) {
            str = str.substring(0, str.length() - 1);
        }

        return str;

    }
    public static String deletSuperfluousSymbolLeft(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (indexOf(str, superfluousSymbolWithoutAllowedinMiddleWord) > 0) {
            return "";
        }
        while (indexOf(str.charAt(0), superfluousSymbolChar) != -1) {
            str = str.substring(1, str.length());
        }
        return str;

    }


    public static int lenghtOfStr(String str) {
        if (str.equals("")) {
            return -1;
        } else {
            String[] letterOrSymbol = str.split("");
            for (int i = 0; i < letterOrSymbol.length; i++) {

                if (indexOf(letterOrSymbol[i], superfluousSymbolString) > 0) {
                    return -1;
                }
            }
            return str.length();
        }
    }

    public static int ShortestWordOfString(String str) {
        String[] arrword = str.split(" ");
        ArrayList<Integer> arrlenghtword = new ArrayList<>();
        for (String s : arrword) {
            s = deletSuperfluousSymbolLeft(deletSuperfluousSymbolRight(s));
            if (lenghtOfStr(s) > 0) {
                arrlenghtword.add(lenghtOfStr(s));
            }
        }

        return Collections.min(arrlenghtword);
    }
}
