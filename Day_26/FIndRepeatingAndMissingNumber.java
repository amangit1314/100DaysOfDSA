public class FindRepeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10 };
        int[] ans = findRepeatingAndMissingNumber(arr);
        System.out.println("Repeating Number: " + ans[0]);
        System.out.println("Missing Number: " + ans[1]);
    }

    private static int[] findRepeatingAndMissingNumber(int[] arr) {
        int[] ans = new int[2];
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        for (int i = 1; i <= arr.length; i++) {
            xor ^= i;
        }
        int rightMostSetBit = xor & ~(xor - 1);
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightMostSetBit) != 0) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if ((i & rightMostSetBit) != 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans[0] = x;
                ans[1] = y;
                return ans;
            }
        }
        ans[0] = y;
        ans[1] = x;
        return ans;
    }
}