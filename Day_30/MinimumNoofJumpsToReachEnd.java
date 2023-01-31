public class MinimumNoofJumpsToReachEnd {
        
        // Returns minimum number of jumps to reach arr[n-1] from arr[0]
        static int minJumps(int arr[], int n)
        {
            // The number of jumps needed to reach the starting index is 0
            if (n <= 1)
                return 0;
            
            // Return -1 if not possible to jump
            if (arr[0] == 0)
                return -1;
            
            // initialization
            // stores all time the maximal reachable index in the array.
            int maxReach = arr[0];
            
            // stores the number of steps we can still take
            int step = arr[0];
            
            // stores the number of jumps necessary to reach that maximal reachable position.
            int jump = 1;
            
            // Start traversing array
            int i = 1;
            for (i = 1; i < n; i++)
            {
                // Check if we have reached the end of the array
                if (i == n - 1)
                    return jump;
                
                // updating maxReach
                maxReach = Math.max(maxReach, i + arr[i]);
                
                // we use a step to get to the current index
                step--;
                
                // If no further steps left
                if (step == 0)
                {
                    // we must have used a jump
                    jump++;
                    
                    // Check if the current index/position or lesser index
                    // is the maximum reach point from the previous indexes
                    if (i >= maxReach)
                        return -1;
                    
                    // re-initialize the steps to the amount
                    // of steps to reach maxReach from position i.
                    step = maxReach - i;
                }
            }
            
            return -1;
        }
        
        // Driver method to test the above function
        public static void main(String[] args)
        {
            int arr[] = { 1, 3, 6, 1, 0, 9 };
            int size = arr.length;
            System.out.print("Minimum number of jumps to reach end is " + minJumps(arr, size));
        }

        public static void minJumpsDp(int[] arr, int size) {
            int[] jumps = new int[size];
            int[] path = new int[size];
            jumps[0] = 0;
            path[0] = -1;
            for (int i = 1; i < size; i++) {
                jumps[i] = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                        jumps[i] = jumps[j] + 1;
                        path[i] = j;
                        break;
                    }
                }
            }
            System.out.println("Minimum number of jumps to reach end is " + jumps[size - 1]);
            System.out.println("Path is: ");
            int i = size - 1;
            while (i != -1) {
                System.out.print(i + " ");
                i = path[i];
            }
        }
}