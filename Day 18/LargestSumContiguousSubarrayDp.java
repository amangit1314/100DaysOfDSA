public class LargestSumContiguousSubarrayDp {
    public static int solutionDP(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            dp[i] = arr[i];
            res = Math.max(res, dp[i]);
            for(int j = i - 1; j >= 0; j--) {
                dp[j] = dp[j] + arr[i];
                res = Math.max(res, dp[j]);
            }
        }

        return res;
    } 
}