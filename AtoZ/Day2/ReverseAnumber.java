package Day2;

public class ReverseAnumber {
    public static void main(String[] args) {
        pal(313);
    }
    static int reverse(int n){
        int rev = 0;
        while (n>0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        }
       return rev;
    }
    static void pal(int n){
        if(n == reverse(n)){
            System.out.println("pal");
        }
        else {
            System.out.println("not pal");
        }
    }

}
