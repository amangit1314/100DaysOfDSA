// Given a binary array arr of size N and an integer M.
// Find the maximum number of consecutive 1's produced by flipping at most M 0's.

/**
    Input:
N = 3
arr[] = {1, 0, 1}
M = 1
Output:
3
Explanation:
Maximum subarray is of size 3
which can be made subarray of all 1 after
flipping two zeros to 1.

Example 2:
Input:
N = 11
arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
M = 2
Output:
8
Explanation:
Maximum subarray is of size 8
which can be made subarray of all 1 after
flipping two zeros to 1.


*/


public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int n = arr.length;
        int m = 2;
        System.out.println(findZeroes(arr, n, m));
    } 

    int findZeroes(int arr[], int n, int m) {
        int i = 0, j = 0, zero = 0, len = 0;
        while(i < n) {
            if(arr[i] == 0 ) {
                zero++;
            }
            while(zero > m) {
                if(arr[j] == 0) {
                    zero--;
                }
                j++;
            }
            len = max(len, i - j + 1);
            i++;
        }

        return len;
    }    
}