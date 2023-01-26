public class CountNumberOfSubarraysWithGivenXorK {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println(countSubarrays(arr, k));
    }

    public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        int xorr = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];

            if(freq.get(xorr ^ b) != null)
                count += freq.get(xorr ^ b);

            if(xorr == b) count++;

            if(freq.get(xorr) != null)
                freq.put(xorr, freq.get(xorr) + 1);

            freq.put(xorr, 1);
        }
        return count;
    }
}