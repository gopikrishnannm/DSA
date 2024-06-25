package DP;



public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tabulation(n));
    }

    static int recursion(int index, int n){
        if(index <= 3){
            return index;
        }
        return recursion(index-1,n) + recursion(index-2,n);
    }

    static int memorizationHelper(int n){
        int[] dp = new int[n+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        return memorization(n, n, dp);
    }

    static int memorization(int index, int n, int[] dp){
        if(index <= 3){
            return index;
        }

        if (dp[index]!=-1){
            return dp[index];
        }

        return dp[index] = memorization(index-1,n,dp) + memorization(index-2,n,dp);
    }

    static int tabulation(int n){
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];

    }

    static int optimized(int n){
        int prev = 2;
        int prev2 = 1;

        if(n<=3){
            return n;
        }

        int total = 0;

        for(int i=2;i<n;i++){
            total = prev+prev2;
            prev2 = prev;
            prev = total;
        }

        return total;
    }
}
