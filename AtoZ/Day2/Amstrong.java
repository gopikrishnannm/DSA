package Day2;

public class Amstrong {
    public static void main(String[] args) {
        isAmstrong(408);
    }
    static void isAmstrong(int n){
        /*
        Armstrong number, also known as a narcissistic number or plenary number,
         is a number that is equal to the sum
        of its own digits each raised to the power of the number of digits.
         */

        int noOfDigits = String.valueOf(n).length();

        int sum = 0;

        int original = n;

        while (n>0){

            int lastDigit = n%10;

            sum += (int) Math.pow(lastDigit, noOfDigits);

            n = n/10;


        }

        if (original == sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
