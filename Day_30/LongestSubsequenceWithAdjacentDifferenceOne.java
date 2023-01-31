import java.io.*;
import java.util.*;

public class LongestSubsequenceWithAdjacentDifferenceOne {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0) {
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
        
            System.out.println(longestSubsequence(N, A));
        }
    }

    static int longestSubsequence(int N, int A[]) {
        // code here
        int[] dp = new int[N];
        
        for(int i = 0; i < N; i++)  dp[i] = 1;
        dp[0] = 1;
        
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(Math.abs(A[i] - A[j]) == 1)
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        
        int ma = 0;
        for(int i = 0; i < N; i++) {
            ma = Math.max(ma, dp[i]);
        }
        
        return ma;
    }
}