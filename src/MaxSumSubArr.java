import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumSubArr {
    public static int sumSubArray(int startIndex, int endIndex, int[] arr) {
        int sum = 0;

        for (int i = startIndex; i < endIndex; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    public static int maxSumSubArray(int[] arr) {
        ArrayList arrSumSub = new ArrayList();
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i + 1; j++) {
                sum = sumSubArray(i, j + i, arr);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }

        }

        return maxSum;
    }
}