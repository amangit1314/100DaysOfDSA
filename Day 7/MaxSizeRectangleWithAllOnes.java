public class MaxSizeRectangleWithAllOnes {
    public static void findMaxRecatngleWithAllOnes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        int max = 0;
        int max_i = 0;
        int max_j = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if(matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
                if(dp[i][j] > max) {
                    max = dp[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println("Max size: " + max);
        System.out.println("Max size rectangle: ");
        for(int i = max_i; i > max_i - max; i--) {
            for(int j = max_j; j > max_j - max; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };
        findMaxRecatngleWithAllOnes(matrix);
    }
}