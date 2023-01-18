public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        printSpiralTraversal(matrix); 
    }


    public static void printSpiralTraversal(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        while(top <= bottom && left <= right) {
            // for column
            for(int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            for(int i = bottom; i <= top; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            // for row
            for(int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for(int i = right; i <= left; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;
            
        }
    }
}