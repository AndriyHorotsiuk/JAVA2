

public class Panagram {
    public static boolean isPanagram(String str) {
       str = str.toUpperCase();

        char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (char ell : alphabet) {
            if (str.indexOf(ell) == -1) {
        return false;
            }
        }

        return true;
    }

}
