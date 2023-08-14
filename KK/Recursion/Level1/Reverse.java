package Recursion.Level1;

public class Reverse {
    public static void main(String[] args) {
        int ans = rev2(123);
        System.out.println(ans);
    }
    // method 1
    static int rev = 0;
    static void rev1(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        rev = rev * 10 + rem;
        rev1(n/10);
    }

    // method 2
    static int rev2(int n){
        int noOfDigits = (int)(Math.log10(n)) + 1;
        return helper(n, noOfDigits);
    }
    private static int helper(int n, int d){
        if (n==0){
            return 0;
        }
        return (n%10) * (int)(Math.pow(10, d-1)) + helper(n/10, d-1);
    }


}
