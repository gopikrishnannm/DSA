package BinaryTrees;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,10,11};
        int target = 8;
        int lp = 0;
        int rp = arr.length-1;
        while(lp<rp) {
            if(arr[lp]+arr[rp]>target){
                rp--;
            } else if (arr[lp]+arr[rp]<target) {
                lp++;
            }
            else {
                System.out.println(Arrays.toString(new int[]{lp,rp}));
                break;
            }
        }

    }
}
