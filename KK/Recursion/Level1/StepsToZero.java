package Recursion.Level1;

public class StepsToZero {
    public static void main(String[] args) {
        int ans = steps(14);
        System.out.println(ans);
    }

    // how to pass a number to above calls
    static int steps(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }
        if (n%2 == 0){
            return helper(n/2, count+1);
        }
        return helper(n-1, count+1);
    }
}
