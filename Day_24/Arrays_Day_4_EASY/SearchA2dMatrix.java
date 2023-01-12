public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean isPresent = searchMatrix(matrix, target);
        System.out.println(" Is Present: " + isPresent);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = matrix[mid / n][mid % n];
            if(midElement == target) {
                return true;
            } else if(midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}