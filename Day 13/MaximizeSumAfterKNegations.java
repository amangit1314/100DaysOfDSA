import java.util.Arrays;
public class MaximizeSumAfterKNegations {
    private static int maximizeSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && K > 0) {
                A[i] = -A[i];
                K--;
            }
            sum += A[i];
            min = Math.min(min, A[i]);
        }
        if (K % 2 == 0) {
            return sum;
        } else {
            return sum - 2 * min;
        }
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 3};
        int K = 1;
        System.out.println(maximizeSumAfterKNegations(A, K));
    }
}