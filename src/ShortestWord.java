import java.util.ArrayList;
import java.util.Collections;

public class ShortestWord {

    static char[] superfluousSymbol = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '"', '(', '0', '-', '_', '+', '=', '{', '}', '[', ']', ' ', '\'', ';', ':', '|', '?', ',', '<', '>'};
    static String[] superfluousSymbol2 = new String[]{"!", "-","@", "#", "$", "%", "^", "&", "*", "(", "0", "_", "+", "=", "{", "}", "[", "]", " ", ";", "\"", ":", "|", "?", ",", "<", ">"};

    public static int indexOf(char a, char[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    System.out.println(i);
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

    public static String deletSuperfluousSymbol(String str) {
        if (indexOf(str, superfluousSymbol2) > 0) {
            return "";
        }
        while (indexOf(str.charAt(str.length() - 1), superfluousSymbol) != -1) {
            str = str.substring(0, str.length() - 1);
        }
        System.out.println(str);
        return str;

    }


    public static int lenghtOfStr(String str) {
        if (str.equals("")) {
            return -1;
        } else {
            String[] letterOrSymbol = str.split("");
            for (int i = 0; i < letterOrSymbol.length; i++) {

                if (indexOf(letterOrSymbol[i], superfluousSymbol2) > 0) {
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
            s = deletSuperfluousSymbol(s);

            if (lenghtOfStr(s) > 0) {
                arrlenghtword.add(lenghtOfStr(s));
            }
        }
        System.out.println(Collections.min(arrlenghtword));
        return Collections.min(arrlenghtword);
    }
}
