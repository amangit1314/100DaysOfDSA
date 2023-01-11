public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        approach1(arr);
        printArray(arr);

        moveZeroes(arr);
        printArray(arr);

        // print execution time
        long start = System.currentTimeMillis();
    }

    public static void approach1(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < n) {
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // print execution time
        long start = System.currentTimeMillis();
    }

    public void moveZeroes(int[] nums) {
        int i = 0, temp;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != 0) {
                // swap nums[j] to nums[i]
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        } 

        // print execution time
        long end = System.currentTimeMillis();  
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // print execution time
    public static void printTime(long start, long end) {
        System.out.println("Execution time: " + (end - start) + " ms");
    }
}