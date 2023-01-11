public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 4, 2, 9};
        int targetSum = 18;

        int[] result = subarraySum(arr, targetSum);
    }

    public static int[] subarraySum(int[] arr, int targetSum) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == targetSum) {
                    return new int[]{i, j};
                }
            }
        }
    }

    public static int longestSubArrWithSumK_BF(int[] arr, int n, int k) {
    int maxLength = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == k)
          maxLength = Math.max(maxLength, (j - i + 1));
      }

    }
    return maxLength;
  }

  public static int longestSubArrWithSumK_Optimal(int[] arr, int n, int k) {
    int start = 0, end = -1, sum = 0, maxLength = 0;
    while (start < n) {
      while ((end + 1 < n) && (sum + arr[end + 1] <= k))
        sum += arr[++end];

      if (sum == k)
        maxLength = Math.max(maxLength, (end - start + 1));

      sum -= arr[start];
      start++;
    }
    return maxLength;
  }
}