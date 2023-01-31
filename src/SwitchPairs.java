
import java.util.ArrayList;

public class SwitchPairs {

    public static ArrayList<String> switchPairsArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < (arrayList.size() - arrayList.size() % 2); i++) {
            arrayList.add(i, arrayList.get(i + 1));
            arrayList.remove(i + 2);
            i++;
        }
        return arrayList;

    }
}
