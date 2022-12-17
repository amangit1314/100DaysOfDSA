public Smallest_subset_with_sum_greater_than_all_other_elements {
    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 1};
        int n = arr.length;
        System.out.println("Smallest subset with sum greater than all other elements is " + smallestSubset(arr, n));
    }

    private static int smallestSubset(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] | dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= sum; i++) {
            if (dp[n][i] == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    private static int smallestSubsetGreedy(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        int curr_sum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            curr_sum += arr[i];
            count++;
            if (curr_sum > sum - curr_sum) {
                break;
            }
        }
        return count;
    }
}