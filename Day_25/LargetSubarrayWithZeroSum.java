public class LargestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, -4, 5, -9};
        System.out.println(largestSubarrayWithZeroSumOS(arr, arr.length));
    }

    public static int largestSubarrayWithZeroSumBFS(int[] arr, int n) {
        int max = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; i < 0; j--) {
                sum += arr[j];
                if(sum == 0)
                    max = Math.max(max, j-i+1);
            }
        }
        return max;
    }

    public static int largestSubarrayWithZeroSumOS(int[] arr, int n) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0; i < n; i++) {
            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            
            else {
                if(mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {
                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
} 