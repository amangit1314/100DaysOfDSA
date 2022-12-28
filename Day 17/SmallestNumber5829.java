public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 9;
        int[] ans = new int[n];
        int i = 0;
        int j = n - 1;
        int k = 1;
        while (i <= j) {
            if (k % 2 == 0) {
                ans[j] = arr[k - 1];
                j--;
            } else {
                ans[i] = arr[k - 1];
                i++;
            }
            k++;
        }
        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l] + " ");
        }
    }

    public String smallestNumber(int s, int d) {
        if((9*d) < s) 
            return "-1";

        String ans = "";
        for(int i = d-1; i >= 0; i--) {
            if( s > 9){
                ans = '9' + ans;
                s -= 9;
            }
            else {
                if( i == 0)
                    ans = String.valueOf(s) + ans;

                else {
                    ans = String.valueOf(s-1) + ans;
                    i--;
                    while(i > 0) {
                        ans = '0' + ans;
                        i--;
                    }
                    ans = '1' + ans;
                    s = 1;
                    break;
                }
            }
        }
    }
    return ans;
}