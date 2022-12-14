import java.util.*;

public class CommonElementsInAllRows {
    public static void findCommonElementsInAllRows(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i = 0; i < columns; i++) {
            int j;
            for(j = 1; j < rows; j++) {
                if(matrix[j][i] != matrix[j - 1][i]) {
                    break;
                }
            }
            if(j == rows) {
                System.out.print(matrix[0][i] + " ");
            }
        }
    }

    public static ArrayList<Integer> approach2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < m; i++) {
            map.put(matrix[0][i], 1);
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map.containsKey(matrix[i][j])) {
                    map.put(matrix[i][j], map.get(matrix[i][j]) + 1);
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == n) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };

        findCommonElementsInAllRows(matrix);
        System.out.println();
        System.out.print(approach2(matrix) + " ");
    }
}