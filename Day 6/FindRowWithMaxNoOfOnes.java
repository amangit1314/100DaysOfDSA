public class FindRowWithMaxNoOfOnes {
    public static int findRowWithMaxNoOfOnes(int[][] matrix) {
        int max = 0, maxRow = 0;
        for(int i = 0; i < matrix.length; i++) {
            int count = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxRow = i;
            }
        }
        return maxRow;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        System.out.println(findRowWithMaxNoOfOnes(matrix));    
    }
}