
public class MaxSumSubArr {


    public static int maxSumSubArray(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int subSum = 0;
            for (int j = 0; j < arr.length - i; j++) {
                subSum = subSum + arr[i + j];
                if (maxSum < subSum) {
                    maxSum = subSum;
                }
            }

        }
        System.out.println(maxSum);
        return maxSum;
    }
}
