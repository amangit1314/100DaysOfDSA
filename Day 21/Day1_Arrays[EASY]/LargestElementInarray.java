public class LargestElementInArray {
    public static int largest(int[] arr) {
        int n = arr.length;

        int max = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] == max)
                continue;

            if(arr[i] > max) 
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(largestElement(arr));
    }
}ddd