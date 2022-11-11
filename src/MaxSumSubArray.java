import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumSubArray {
    public static int maxSumSubArr(int[] arr) {
        ArrayList<Integer> sumSubArray = new ArrayList<>();

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 0; j < arr.length - i + 1; j++) {
                int sumSub = Arrays.stream(Arrays.copyOfRange(arr, j, j + i)).sum();
                sumSubArray.add(sumSub);
            }
        }

        return (Collections.max(sumSubArray) > 0) ? Collections.max(sumSubArray): 0;
    }
}
