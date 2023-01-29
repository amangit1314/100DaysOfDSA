import java.util.Arrays;

public class TripletSmallerThanSum {
    public long countTriplets(long arr[], int n, int sum) {
        Arrays.sort(arr);
        
        int count = 0;      
        long s = 0;
        
        for(int k = 0; k < n - 2; k++) {
            int i = k + 1;
            int j = n - 1;
            
            while(i < j) {
                s = arr[k] + arr[i] + arr[j];
                if(s < sum) {
                    count += (j - i);
                    i++;
                }
                
                else j--;
            }
        }
        //* O(n * m) solution

        // long x = 0;
        // int count = 0;
        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         for(int k = j + 1; k < n; k++) {
        //             x = arr[i] + arr[j] + arr[k];    
        //             if(sum <= x) break;
        //             else count++;
        //         }
        //     }
        // } 

        //! O(n ^ 3 Solution)       
       
        return count;
    }
}