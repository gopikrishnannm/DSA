package day4;

import java.util.Arrays;

public class InsertionSort {
        public static void main(String[] args) {
            int[] nums = {2,5,1,4};
            int[] ans = insertionSort(nums);
            System.out.println(Arrays.toString(ans));
        }

    private static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j] < nums[j-1]){
                    swapElement(nums, j, j-1);
                }else break;
            }

        }
        return nums;
    }
    private static void swapElement(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
