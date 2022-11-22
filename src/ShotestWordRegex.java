
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShotestWordRegex {

    public static int shortestWordOfStringRegex(String str) {

        String regex = "([a-z]+)'([a-z]+)|([a-z]+)-([a-z]+)-([a-z]+)|([a-z]+)-([a-z]+)|([a-z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int minLengtWord = str.length();
        while (matcher.find()) {
            if (minLengtWord > matcher.group().length()) {
                minLengtWord = matcher.group().length();
            }

        }

        return minLengtWord;
    }
}
