public class CheckForSortedArray {
    public static boolean isSortedBruteForce(int[] arr) {
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                if (arr[j] < arr[i])
                    return false;
    } // O(n^2)

    public static boolean isSortedOptimized(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < arr[i-1])
                return false;
    } // O(n)

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isSortedBruteForce(arr));
    }
}