import java.util.*;
public class FindMinMaxAmountToBuyNCandies {

    public static Pair minMax(int[] candies, int n, int k) {
        Arrays.sort(candies);
        int max = 0, min = 0;
        int s = 0, e = candies.length - 1;
        while(i <= j) {
            min += candies[s];
            s++;
            e = e-k;
        }

        Collections.reverse(Arrays.asList(candies));
        s = 0, end = n - 1;
        while(s <= e) {
            max = += candies[s];
            s++;
            e = e-k;
        }

        return {max, min};
    } 

    public static void main(String[] args) {
        int[] candies = { 3, 2, 1, 4 };
        int n = 4;
        int k = 2;
        Pair res = minMax(candies, n, k);
        System.out.println(res.max + " " + res.min);
    }
}