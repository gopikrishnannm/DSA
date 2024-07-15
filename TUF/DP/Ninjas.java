package DP;

public class Ninjas {
    public static void main(String[] args) {
        int[][] task = {{1,2,5},{3,1,1},{3,3,3}};
        System.out.println(memorizationHelper(task.length-1, 3, task));
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
}
