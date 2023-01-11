//package Day_23.Day3_Arrays[EASY];

public class UnionAndIntersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] union = union(arr1, arr2);
        int[] intersection = intersection(arr1, arr2);
        System.out.println("Union of two arrays is: ");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();
        System.out.println("Intersection of two arrays is: ");
        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i] + " ");
        }
    }

    public static int[] union(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] > arr2[j]) {
                union[k] = arr2[j];
                j++;
                k++;
            } else {
                union[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            union[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            union[k] = arr2[j];
            j++;
            k++;
        }
        return union;
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection[k] = arr1[i];
                i++;
                j++;
                k
            }
        }
    }
}