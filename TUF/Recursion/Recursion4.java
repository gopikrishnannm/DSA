package Recursion;

// Multiple recursion call
public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(fibanacci(3));
    }

    private static int fibanacci(int n) {
        if (n<=1)
            return n;
//        int last = fibanacci(n-1);
//        int secondLast = fibanacci(n-2);
//        return last + secondLast;
        return fibanacci(n-1) + fibanacci(n-2);
    }
}
    