import java.util.ArrayList;
import java.util.Collections;

public class ShortestWord {
    public static int ShortestWordOfString(String str) {
        String[] arrword = str.split(" ");
        ArrayList<Integer> arrlenghtword = new ArrayList<>();
        for (String s : arrword) {
            arrlenghtword.add(s.length());
        }
        return Collections.min(arrlenghtword);
    }
}
