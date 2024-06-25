package DP;

public class Fibanocci {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(tabulationWithNoArray(n));

    }

    static int helper(int n){
        int[] dp = new int[n+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return memorization(n, dp);
    }
    static int memorization(int n, int[] dp){
        if (n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = memorization(n-1, dp)+memorization(n-2,dp);

        //tc - o(n)
        //sc - o(n+n)
    }

    static int tabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        //tc - o(n)
        //sc - o(n)
    }

    static int tabulationWithNoArray(int n){
        int prev2 = 0;
        int prev1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev2 + prev1;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }

}
