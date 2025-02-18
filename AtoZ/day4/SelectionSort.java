package day4;

import java.util.Arrays;



public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,4};
        int[] ans = selectionSort(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int lastIndex = n-i-1;
            int maxElementIndex = getMaxElementIndex(nums, 0, lastIndex);
            swapElement(nums, lastIndex, maxElementIndex);
        }
        return nums;

    }

    private static void swapElement(int[] nums, int lastIndex, int maxElementIndex) {
        int temp = nums[lastIndex];
        nums[lastIndex] = nums[maxElementIndex];
        nums[maxElementIndex] = temp;
    }

    private static int getMaxElementIndex(int[] nums, int startIndex, int lastIndex) {
        int maxElementIndex = startIndex;
        for (int i = startIndex; i < lastIndex; i++) {
            if (nums[i] > nums[i+1]){
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
}
