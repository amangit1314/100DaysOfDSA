// Problem -> Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
// Source or Practice on GFG (Longest Consecutive Subsequece)
// Video - [x] PepCoding
class LongestConsecutiveSubsequence
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   HashMap<Integer, Boolean> map = new HashMap<>();
	   for(int val: arr) {
	       map.put(val, true);
	   }
	   
	   for(int val: arr) {
	       if(map.containsKey(val - 1)) {
	           map.put(val, false);
	       }
	   }
	   
	   int msp = 0;
	   int ml = 0;
	   
	   for(int val: arr) {
	       if(map.get(val) == true) {
	           int tl = 1;
	           int tsp = val;
	           
	           while(map.containsKey(tsp + tl)) {
	               tl++;
	           }
	           
	           if(tl > ml) {
	               msp = tsp;
	               ml = tl;
	           }
	       }
	   }
	   
	   return ml;
	}

	public static void main(String[] args) {
		int[] arr = {1, 9, 3, 10, 4, 20, 2};
		System.out.println("Length of Longest Consecutive Subsequence is -" + findLongestConseqSubseq(arr, arr.length));
	}
}