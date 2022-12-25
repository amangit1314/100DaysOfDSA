public class LongestAlternatingSubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(longestAlternatingSubsequence(arr, n));
    }

    private static int longestAlternatingSubsequence(int[] arr, int n) {
        int[][] dp = new int[n][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        int max = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i][0] = Math.max(dp[i][0], dp[j][1] + 1);
                } else if (arr[i] < arr[j]) {
                    dp[i][1] = Math.max(dp[i][1], dp[j][0] + 1);
                }
            }
            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }
        return max;
    }
}