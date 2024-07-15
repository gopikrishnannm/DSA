package DP;

public class Sumofnonadjacentelements {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        System.out.println(optimized(arr));
    }
    static int recursion(int[] arr, int ind){
        if (ind == 0) return arr[ind]; // Base case: if the index is 0, return the element at index 0
        if (ind < 0) return 0;         // Base case: if the index is negative, return 0

        int pick = arr[ind] + recursion(arr, ind - 2); // Case where you pick the current element and skip the next one
        int nopick = 0 + recursion(arr, ind - 1);      // Case where you do not pick the current element

        return Math.max(pick, nopick);
    }
    static int memorizationHelper(int n, int[] arr){
        int[] dp = new int[n+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return memorization(n, dp, arr);
    }

    static int memorization(int index, int[] dp, int[] arr){
        if (index == 0){
            return arr[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int pick = arr[index] + memorization(index - 2, dp, arr);
        int nonPick =  memorization(index-1, dp,arr);;

        return dp[index] = Math.max(pick, nonPick);
    }
    static int tabulation(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
         int take = nums[i];
         if(i>1){
             take += dp[i-2];
         }
         int noTake = dp[i-1];
         dp[i] = Math.max(take, noTake);
        }
        return dp[dp.length-1];
    }
    static int optimized(int[] nums){
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1){
                take += prev2;
            }
            int noTake = 0 +  prev;
            int current = Math.max(take, noTake);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}
