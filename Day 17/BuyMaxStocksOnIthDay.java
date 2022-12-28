public class BuyMaxStocksOnIthDay {
    public static void main(String[] args) {
        int[] price = { 7, 10, 4, 5, 8, 11, 9 };
        int[] n = { 100, 180, 260, 310, 40, 535, 695 };
        int[] s = new int[price.length];
        s[0] = 1;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1])
                s[i] = s[i - 1] + 1;
            else
                s[i] = 1;
        }
        int[] ans = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            ans[i] = s[i] * n[i];
        }
        int max = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > max)
                max = ans[i];
        }
        System.out.println(max);
    }
}