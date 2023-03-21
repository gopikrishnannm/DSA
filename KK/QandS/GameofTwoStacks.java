package QandS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GameofTwoStacks {
    public static void main(String[] args) {

        int[] a = {1, 4, 6};
        int[] b = {2, 1, 8, 5};
        int target = 2;
        System.out.println(gots(a, b, target));
    }
    public static int gots(int[] a, int[] b, int target){
        return Worker(target, a, b, 0, 0)-1;
    }
    public static int Worker(int target, int[] a, int[] b, int sum, int count){
        if (sum>target){
            return count;
        }
        if (a.length==0 || b.length==0){
            return count;
        }

        int left = Worker(target, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);

        int right = Worker(target,a, Arrays.copyOfRange(a, 1, b.length), sum+a[0], count+1);
        return Math.max(left, right);
    }

}
