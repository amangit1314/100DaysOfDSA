import java.util.* ;
import java.io.*; 
import java.util.*;

public class MaxSumOfNonAdjacentElements {

	// public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
	// 	// Write your code here.
	// 	int n = nums.size();
	// 	ArrayList<Integer> dp = new ArrayList<>(n);
	// 	// int ans = solve(nums, n - 1);
	// 	int ans = solveMem(nums, n - 1, dp);
	// 	return ans;
	// }

	// public static int solve(ArrayList<Integer> nums, int n) {
	// 	if(n < 0)
	// 		return 0;

	// 	if(n == 0)
	// 		return nums.get(0);

	// 	int include = solve(nums, n - 2) + nums.get(n);
	// 	int exclude = solve(nums, n - 1) + 0;

	// 	return Math.max(include, exclude);
	// }

	// public static int solveMem(ArrayList<Integer> nums, int n, ArrayList<Integer> dp) {
	// 	if(n < 0)
	// 		return 0;

	// 	if(n == 0)
	// 		return nums.get(0);

	// 	if(dp.get(n) != 0)
	// 		return dp.get(n);

	// 	int include = solveMem(nums, n - 2, dp) + nums.get(n);
	// 	int exclude = solveMem(nums, n - 1, dp) + 0;

	// 	int ans = Math.max(include, exclude);
		
	// 	dp.get() = ans;

	// 	return dp.get(n);
	// }
	
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
       int n = nums.size();
       int [] dp = new int[n];
       
	   for(int i = 0; i < n; i++)
           dp[i] = -1;

       dp[0] = nums.get(0);       
       
	   for(int i = 1; i < n; i++){
           int take;
           int nottake;
           if(i - 2 < 0){
               take = nums.get(i);
           }

           else{
        	take = nums.get(i) + dp[i - 2];  
           }

           nottake = dp[i - 1];
           dp[i] = Math.max(take, nottake);
       }

       return dp[dp.length-1];
	}
}