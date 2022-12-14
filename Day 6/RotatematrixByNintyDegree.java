public class RotatematrixByNintyDegree {

    public static void rotateMatrix(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while(top < bottom && left < right) {
            int prev = matrix[top + 1][left];
            for(int i = left; i <= right; i++) {
                int curr = matrix[top][i];
                matrix[top][i] = prev;
                prev = curr;
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                int curr = matrix[i][right];
                matrix[i][right] = prev;
                prev = curr;
            }
            right--;
            for(int i = right; i >= left; i--) {
                int curr = matrix[bottom][i];
                matrix[bottom][i] = prev;
                prev = curr;
            }
            bottom--;
            for(int i = bottom; i >= top; i--) {
                int curr = matrix[i][left];
                matrix[i][left] = prev;
                prev = curr;
            }
            left++;
        }
    }

    public static void print(int[][] matrix) {
        // Printing the traversal
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        print(matrix);
        rotateMatrix(matrix);
        print(matrix);
    }
}