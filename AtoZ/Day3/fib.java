package Day3;

public class fib {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(fibUsingRecursion(i));
        }

    }
    static int fibUsingRecursion(int n){
        if (n<=1){
            return n;
        }
        int last = fibUsingRecursion(n-1);
        int secondLast = fibUsingRecursion(n-2);
        return last+secondLast;
    }


}
