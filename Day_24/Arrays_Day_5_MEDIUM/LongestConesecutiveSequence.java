public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;
        int longestConsecutiveSequence = longestConsecutiveSequence(arr, n);
        System.out.println(" Longest Consecutive Sequence: " + longestConsecutiveSequence);
    }

    public static int longestConsecutiveSequence(int[] arr, int n) {
        int longestConsecutiveSequence = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == arr[i + 1] - 1) {
                count++;
            } else {
                count = 0;
            }
            if(count > longestConsecutiveSequence) {
                longestConsecutiveSequence = count;
            }
        }
        return longestConsecutiveSequence;
    }
}