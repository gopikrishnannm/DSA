package day4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,4};
        int[] ans = bubbleSort(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] bubbleSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            boolean swaped =false;
            for (int j = 0; j < length-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaped= true;
                }

            }
            if(!swaped){
                break;
            }
        }
        return nums;
    }
}
