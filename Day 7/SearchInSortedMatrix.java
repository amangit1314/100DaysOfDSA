public class SearchInSortedMatrix {
    public static void search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int i = 0;
        int j = columns - 1;

        while(i < rows && j >= 0) {
            if(matrix[i][j] == target) {
                System.out.println("Found at: " + i + ", " + j);
                return;
            } else if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };

        int target = 7;
    }
}