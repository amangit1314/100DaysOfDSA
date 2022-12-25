public class PartitioningandSortingArrayswithManyRepeatedEntries {

    public static void main(String[] args) {
        int[] A = {0, 1, 2, 0, 2, 1, 1};
        int pivot = 1;
        partition(A, pivot);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void partition(int[] A, int pivot) {
        int smaller = 0;
        int equal = 0;
        int larger = A.length;
        while (equal < larger) {
            if (A[equal] < pivot) {
                swap(A, smaller++, equal++);
            } else if (A[equal] == pivot) {
                ++equal;
            } else {
                swap(A, equal, --larger);
            }
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}