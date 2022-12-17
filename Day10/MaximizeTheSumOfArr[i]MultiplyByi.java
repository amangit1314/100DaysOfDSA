public class MaximizeTheSumOfArr[i]MultiplyByi {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Maximum sum is " + maxSum(arr, n));
    }

    private static int maxSum(int[] arr, int n) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * i;
        }
        return sum;
    }
}