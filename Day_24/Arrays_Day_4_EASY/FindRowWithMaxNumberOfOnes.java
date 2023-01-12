public class FindRowWithMaxNumberOfOnes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0}, {1, 1, 1, 0}, {1, 0, 1, 0}};
        int m = matrix.length;
        int n = matrix[0].length;
        int maxOnes = 0;
        int maxOnesRow = 0;
        for(int i = 0; i < m; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1) {
                    count++;
                }
            }
            if(count > maxOnes) {
                maxOnes = count;
                maxOnesRow = i;
            }
        }
    }
}