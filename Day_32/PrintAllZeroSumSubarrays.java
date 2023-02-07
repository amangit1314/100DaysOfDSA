import java.util.*;
import java.io.*;

class Pair {
    int max, min;
    public Pair(int a, int b) {
        max = a;
        min = b;
    }
}

public class PrintAllZeroSumSubarrays {


    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = arr.length;

        ArrayList<Pair> out = findSubarrays(arr);

        if(out.size() == 0)
            System.out.println("No subarray exists");
        else    print(out);
    }

    public static ArrayList<Pair> findSubarrays(int[] arr) {
        ArrayList<Pair> out = new ArrayList<Pair>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int prefix = 0;
            for(int j  = i; j < n; j++) {
                prefix += arr[j];
                if(prefix == 0)
                    out.add(new Pair(i, j));
            }
        }
        return out;
    }

    public static void print(ArrayList<Pair> out) {
        for(int i = 0; i < out.size(); i++) {
            Pair p = out.get(i);
            System.out.println("Subarray found from Index " + p.max + " to " + p.min);
        }
    }

}

