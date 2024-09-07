package Day2;

public class CountNumberOfdigits {
    public static void main(String[] args) {
        usingLog(510020);
    }
    static void usingWhile(int n){
        int count=0;
        while(n > 0){
            count++;
            n /= 10;
        }
        System.out.println(count);
    }

    //The number of times you can divide n by 10 is proportional to the number of digits in n.
    //The number of digits in n is approximately log₁₀(n), meaning the loop runs about log₁₀(n) times.
    static void usingLog(int n){

        int no = (int) Math.log10(n)+1;

        /*
        The base-10 logarithm of a number gives the power to which 10 must be raised to get that number.
        For example, Math.log10(1000) would return 3.0 because 10^3 = 1000.
        Adding 1 to the result of Math.log10(n) accounts for the fact that the number
        of digits is always one more than the integer value of the logarithm.
For e   example, log10(1000) is 3.0, but 1000 has 4 digits, so adding 1 gives 4.
         */

        System.out.println(no);
    }
}
