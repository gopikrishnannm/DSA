package Recursion;

//Finding sum of n numbers using recursion
public class Recursion2 {
    // Parametarized way
    static void sumN1(int n, int sum){
        if (n<1) {
            System.out.println(sum);
            return;
        }
        sumN1(n-1, sum+n);
    }
    // Functional way
    static int sumN2(int n){
        if (n==1)
            return 1;
        return n+sumN2(n-1);
    }
    // factorial in functional way
    static int fact(int n){
        if(n==1 || n==0)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int initialSum = 0;
        //sumN1(3, initialSum );
        System.out.println(fact(4));
    }
}
