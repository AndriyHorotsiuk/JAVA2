
import java.util.ArrayList;

public class SwitchPairs {

    public static ArrayList<String> switchPairsArrayList(ArrayList<String> arrayList) {
        String itemExchange;
        for (int i = 0; i < (arrayList.size() % 2); i++) {
            itemExchange = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 1));
            arrayList.set(i + 1, itemExchange);
            i++;
        }

        return arrayList;

    }
}
