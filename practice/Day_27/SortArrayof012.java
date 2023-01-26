public class SortArrayof012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 2, 1};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    } 

    public static void sortByCount(int[] arr) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0)
                zeros++;

            if(arr[i] == 1)
                ones++;
                
            twos++;
        }

        for(int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }

        for(int i = zeros; i < zeros + ones; i++) {
            arr[i] = 1;
        }

        for(int i = zeros + ones; i < zeros + ones + twos; i++) {
            arr[i] = 2;
        }
    } 


public static void sort(int[] arr) {
    int low = 0;
    int mid = 0;
    int high = arr[arr.length - 1];

    for(int i = 0; i < arr.length - 1; i++) {
        if(arr[mid] == 0)
            swap(arr, low++, mid++);
        
        else if(arr[mid] == 1)
            mid++;
        
        else
            swap(arr, mid, high--);
    }
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}