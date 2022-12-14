class MatrixSpiralTraversal {
    public static void spiralTraversal(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int dir = 0;
        while(top <= bottom && left <= right) {
            if(dir == 0) {
                for(int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            } else if(dir == 1) {
                for(int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            } else if(dir == 2) {
                for(int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            } else if(dir == 3) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
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
        spiralTraversal(matrix);
        print(matrix);
    }
}

// Output -> 1 - 2 - 3 - 4 - 8 - 12 - 16 - 15 - 14 - 13 - 9 - 5 - 6 - 7 - 11 - 10