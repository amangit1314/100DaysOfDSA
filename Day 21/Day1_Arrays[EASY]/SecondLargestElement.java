public class SecondLargestElement {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int secondMax = 0;

        for(int i = 0; i < n; i++) {
            if(max == arr[i])
                continue;

            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            else if(arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];
        }
        return secondMax;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(secondLargest(arr));
    }
}