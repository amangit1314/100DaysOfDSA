  public class SortArrayOfZeroOneTwos {

    public static void sort(int[] arr) {
        int i = 0, j = 0;
        int k = arr.length - 1; 

        while (j <= k) {
            if(arr[j] == 0)
                swap(arr, i++, j++);

            else if(arr[j] == 1)
                j++;

            else
                swap(arr, j, k--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}