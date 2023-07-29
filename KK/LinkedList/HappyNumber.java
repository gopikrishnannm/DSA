package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        int happyNumber = 8;
        System.out.println(isHappy(happyNumber));
    }
    public static boolean isHappy(int number){
        int slow = number;
        int fast = number;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow!=fast );
        if (slow == 1){
            return true;
        }
        return false;
    }
    private static int findSquare(int num){
        int ans = 0;
        while (num>0){
            int rem = num%10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

}
