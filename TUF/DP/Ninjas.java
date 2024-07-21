package DP;

public class Ninjas {
    public static void main(String[] args) {
        int[][] task = {{1,2,5},{3,1,1},{3,3,3}};
        System.out.println(tabulation( task));
    }
    static int recursion(int day, int last, int[][] task){
        if(day==0){
            int maxPoint = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last){
                    maxPoint = Math.max(maxPoint, task[day][i]);
                }
            }
            return maxPoint;
        }
        int maxPoint = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last){
                int point = task[day][i] + recursion(day-1, i, task);
                maxPoint = Math.max(maxPoint, point);
            }
        }
        return maxPoint;
    }
    static int memorizationHelper(int day, int last, int[][] task){
        int[][] memo = new int[task.length][4];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
        return memorization(task.length-1, 3, task, memo);
    }
    static int memorization(int day, int last, int[][] task, int[][]memo){
        if(day==0){
            int maxPoint = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last){
                    maxPoint = Math.max(maxPoint, task[day][i]);
                }
            }
            memo[day][last] = maxPoint;
            return maxPoint;
        }
        if (memo[day][last] != -1){
            return memo[day][last];
        }
        int maxPoint = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last){
                int point = task[day][i] + recursion(day-1, i, task);
                maxPoint = Math.max(maxPoint, point);
            }
        }
        memo[day][last] = maxPoint;
        return maxPoint;
    }

    static int tabulation(int[][] task){

        int[][] dp = new int[task.length][4];

        dp[0][0] = Math.max(task[0][1], task[0][2]);
        dp[0][1] = Math.max(task[0][0], task[0][2]);
        dp[0][2] = Math.max(task[0][0], task[0][1]);
        dp[0][3] = Math.max(task[0][0], Math.max(task[0][1], task[0][2]));

        for (int day = 1; day < task.length; day++) {
            for (int last = 0; last < 4; last++) {
                int maxi = 0;
                for (int i = 0; i <= 2; i++) {
                    if (i != last){
                        int point = task[day][i] + dp[day-1][last];
                        maxi = Math.max(maxi, point);
                    }
                }
                dp[day][last]=maxi;

            }
        }
        return dp[task.length-1][3];
    }
    static int optimization(int[][] task){

        int[] prev = new int[4];

        prev[0] = Math.max(task[0][1], task[0][2]);
        prev[1] = Math.max(task[0][0], task[0][2]);
        prev[2] = Math.max(task[0][0], task[0][1]);
        prev[3] = Math.max(task[0][0], Math.max(task[0][1], task[0][2]));

        for (int day = 1; day < task.length; day++) {
            int[] temp = new int[4];
            for (int last = 0; last < 4; last++) {
                for (int i = 0; i <= 2; i++) {
                    if (i != last){
                        temp[last] = Math.max(temp[last], task[day][i] + prev[last]);
                    }
                }
             prev = temp;
            }
        }
        return prev[3];
    }
}
