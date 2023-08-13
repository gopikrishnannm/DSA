package Recursion.Level1;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(pOD(523));
    }
    static int pOD(int n){
        if (n%10 == n){
            return n;
        }
        return n%10 * pOD(n/10);
    }
}
