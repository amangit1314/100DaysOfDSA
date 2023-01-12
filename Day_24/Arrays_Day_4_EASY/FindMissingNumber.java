public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }
    }

    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
    
        System.out.println(ans);
    }
}