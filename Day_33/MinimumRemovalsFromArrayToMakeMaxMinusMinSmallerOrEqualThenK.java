public class MinimumRemovalsFromArrayToMakeMaxMinusMinSmallerOrEqualThenK {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 9, 10, 11, 12, 17, 20 };
        int n = arr.length;
        int k = 4;
        System.out.println(minRemovals(arr, n, k));
    }

    private static int minRemovals(int[] arr, int n, int k) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[i - 1] - arr[j] <= k && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + i - j - 1);
                }
            }
        }
        return dp[n];
    }
}