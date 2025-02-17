import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1};
        missing(arr);
    }
    static void missing(int[] arr){
        int n= arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i != arr[i]){
                System.out.println("missing number is "+ i);
                return;
            }
        }
        // if no missing item in current array then it would be the last element which is equals
        //to the size of array
        System.out.println("missing number is "+ n);
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n+1)/2;
        int actualSum = 0;

        for(int i : nums)
            actualSum += i;

        return sum - actualSum;
    }
}
