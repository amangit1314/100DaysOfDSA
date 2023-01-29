public class CountNoOfStringsIn2DCharArray {
    public static void main(String[] args) {
        char[][] arr = {
            {'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h'},
            {'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p'}
        };
       
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                ans += solve(i, j, s, ch, size, 0);
            }
        }
        System.out.println(count);
    }

    public static int solve(int i, int j, String s, char[][] ch, int size, int index) {

        int found = 0;

        if(i >= 0 && j >= 0 && i < ch.length && s.charAt(index) == ch[i][j]) {
            char temp = s.charAt(index);
            ch[i][j] = '0';

            if(index == size) {
                found = 1;
            } else {
                found += solve(i - 1, j, s, ch, size, index); 
                found += solve(i + 1, j, s, ch, size, index);
                found += solve(i, j - 1, s, ch, size, index);
                found += solve(i, j + 1, s, ch, size, index);
            }
            ch[i][j] = temp;
        }

        return found;
    }
}