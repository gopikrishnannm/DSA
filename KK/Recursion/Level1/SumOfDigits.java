package Recursion.Level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sOD(523));
    }
    static int sOD(int n){
        if (n==0){
            return 0;
        }
        return n%10 + sOD(n/10);
    }
}
