public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadanesAlgo(arr));
    }

    public static int kadanesAlgo(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
}