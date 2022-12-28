public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 4, 6, 8 };
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int l = left; l <= right; l++) {
            arr[l] = temp[l];
        }
    }
}