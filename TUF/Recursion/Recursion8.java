package Recursion;

// no of subsequces whose sum that matching the target
public class Recursion8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;
        System.out.println(subseq(0, arr, target, 0));
    }
    private static int subseq(int index, int[] arr, int target, int sum){
        if(index == arr.length) {
            if (sum == target) return 1;
            return 0;
        }
        sum += arr[index];
        int left = subseq(index+1,arr,target,sum);
        sum -= arr[index];
        int right = subseq(index+1,arr,target,sum);
        return left + right;

    }

}
