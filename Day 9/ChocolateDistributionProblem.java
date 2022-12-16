import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class ChocolateDistributionProblem {
    
    public static void distributeChocolates(int[] chocolates) {

        Arrays.sort(chocolates);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < chocolates.length - 1; i++) {
            int diff = chocolates[i + 1] - chocolates[i];

            if(diff < min)
                min = Math.min(min, diff);
        } 

        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] chocolates = {7, 3, 2, 4, 9, 12, 56};
        distributeChocolates(chocolates);
        findMinDifference(chocolates, chocolates.length, 5);
    }

    public static void findMinDifference(int[] chocolates, int n, int m) {
        int i = 0;
        int j = m - 1;

        if (m == 0 || n == 0)
            return;

        Arrays.sort(chocolates);

        int min_diff = Integer.MAX_VALUE;

        while(j < n)
        {
            min_diff = Math.min(min_diff, chocolates[j] - chocolates[i]);
            i+=1;
            j+=1;
        }

        System.out.println(min_diff);
    }
}