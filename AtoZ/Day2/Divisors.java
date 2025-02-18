package Day2;

public class Divisors {
    public static void main(String[] args) {
        findDivisors(5);
    }
    static void findDivisors(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.println(i);
            } 
        }
    }
}
