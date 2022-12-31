public class CountAllSubsequencesWhichHavingProductLessThanK {
    public static int subarrayCount(int[] arr, int n, int k) {
        int s = 0, e = 0, res = 0;
        int prod = 1;

        for(e = 0; e < n; e++) {
            prod *= arr[e];
            if(prod < k) {
                res += e - s + 1;
            } else {
                while(s <= e && prod >= k) {
                    prod /= arr[s];
                    s++;
                }
                res += e - s + 1;
            }
        }

        return res;
    }

    public static int subarrayCountDp(int[] arr, int n, int k) {
        int[] dp = new int[n];
        int res = 0;

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            if(arr[i] < k) {
                res++;
            }
            for(int j = i - 1; j >= 0; j--) {
                dp[j] = dp[j] * arr[i];
                if(dp[j] < k) {
                    res++;
                }
            }
        }

        return res;
    }
}