package Recursion.Level1;

public class NumberSeries {
    public static void main(String[] args) {
        combine(3);
    }
    public static void ntoOne(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        ntoOne(n-1);

    }
    public static void onetoN(int n){
        if (n==0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);

    }
    public static void combine(int n){
        if (n==0){
            System.out.println();
            return;
        }
        System.out.print(n);
        combine(n-1);
        System.out.print(n);
    }
}
