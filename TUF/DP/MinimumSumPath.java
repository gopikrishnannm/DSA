package DP;

public class MinimumSumPath {
    public static void main(String[] args) {

        int[][] arr= {{1,3,1},{1,5,1},{4,2,1}};

        int n = arr.length;
        int m = arr[0].length;

        System.out.println(tabulation(n-1,m-1,arr));

    }
    static int recursion(int i, int j, int[][] arr){

        if(i==0 && j==0){
            return arr[0][0];
        }
        if(i<0 || j<0){
            return (int)1e9;
        }
        int top = arr[i][j] + recursion(i-1,j,arr);
        int left = arr[i][j] + recursion(i,j-1,arr);
        return Math.min(left, top);

    }

    static int memorizationHelper(int n, int m,int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return memorization(n, m, arr, dp);
    }
    static int memorization(int i, int j, int[][] arr, int[][] dp){
        if(i==0 && j==0){
            return arr[i][j];
        }
        if(i<0 || j<0){
            return (int)1e9;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int top = arr[i][j] + memorization(i-1,j,arr,dp);
        int left = arr[i][j] + memorization(i,j-1,arr,dp);
        return dp[i][j] = Math.min(left, top);
    }
    static int tabulation(int n, int m, int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if(i==0 && j==0){

                    dp[i][j] = arr[i][j];
                }
                else{

                    int up = arr[i][j];
                    if (i > 0){
                        up += arr[i-1][j];
                    }
                    else{
                        up += (int)1e9;
                    }

                    int left = arr[i][j];
                    if(j > 0){
                        left += dp[i][j-1];
                    }
                    else{
                        left += (int)1e9;
                    }

                    dp[i][j] = Math.min(left,up);
                }
            }



        }
        return dp[n][m];
    }
}
