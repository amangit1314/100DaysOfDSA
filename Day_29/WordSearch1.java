// Word Search -> CodeStudio

public class WordSearch1 {
    public static boolean present(char[][] board, String word, int n, int m) {
        // Write your code here!
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(search(i, j, n, m, board, word, 0))
                        return true;
                }             
            }
        }
        return false;
    }

    public static boolean search(int i, int j, int n, int m, char[][] board, String word, int k) {
        if(k == word.length())
            return true;
        
        if(i < 0 || j < 0 || i == n || j == m || board[i][j] != word.charAt(k)) {
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '#';

        boolean option1 = search(i + 1, j, n, m, board, word, k + 1);
        boolean option2 = search(i, j + 1, n, m, board, word, k + 1);
        boolean option3 = search(i - 1, j, n, m, board, word, k + 1);
        boolean option4 = search(i, j - 1, n, m, board, word, k + 1);

        board[i][j] = ch;
        return option1 || option2 || option3 || option4;
    }
}