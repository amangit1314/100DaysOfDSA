public class ThreeChoicesCoinGame {
    public static void main(String[] args) {
        // int n = 4;
        // System.out.println(countWays(n));
        int x = 3, y = 4, n = 5;
        if (findWinner(x, y, n) == true)
            System.out.println('A');
        else
            System.out.println('B');
    }

    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

    static boolean findWinner(int x, int y, int n)
    {
        // To store results
        boolean[] dp = new boolean[n + 1];
      
        Arrays.fill(dp, false);
     
        // Initial values
        dp[0] = false;
        dp[1] = true;
      
        // Computing other values.
        for (int i = 2; i <= n; i++) {
      
            // If A losses any of i-1 or i-x
            // or i-y game then he will
            // definitely win game i
            if (i - 1 >= 0 && dp[i - 1] == false)
                dp[i] = true;
            else if (i - x >= 0 && dp[i - x] == false)
                dp[i] = true;
            else if (i - y >= 0 && dp[i - y] == false)
                dp[i] = true;
      
            // Else A loses game.
            else
                dp[i] = false;
        }
      
        // If dp[n] is true then A will
        // game otherwise  he losses
        return dp[n];
    }
}