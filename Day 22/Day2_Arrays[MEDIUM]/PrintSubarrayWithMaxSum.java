public class PrintSubarrayWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        printSubarrayWithMaxSum(arr);
    }

    public static void printSubarrayWithMaxSum(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
                s = i + 1;
            }
            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }
        System.out.println("Max sum: " + maxSoFar);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    }
}