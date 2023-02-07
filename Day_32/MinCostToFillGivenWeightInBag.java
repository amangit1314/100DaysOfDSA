// Unbound Knapsack

public class MinCostToFillGivenWeightInBag {
    public static void main(String[] args) {
        int cost[] = { 10, 20, 30 };
        int N = cost.length;
        int W = 50;
        System.out.println(minCost(cost, N, W));
    }

    private static int minCost(int[] cost, int n, int w) {
        int dp[] = new int[w + 1];
        dp[0] = 0;
        for (int i = 1; i <= w; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i >= cost[j] && dp[i - cost[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - cost[j]] + 1);
                }
            }
        }
        return dp[w];
    }
}