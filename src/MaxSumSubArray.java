public class MaxSumSubArray {
    public static int maxSumSubArr(int[] arr) {

        int maxSum = 0;
        int subSum = 0;
        for (int ellementarr: arr) {
            subSum += ellementarr;
            maxSum = Math.max(maxSum, subSum);
            if (subSum < 0) subSum = 0;
        }
        return maxSum;
    }


}




