package BinarySearch;

public class Thirty3 {
    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5,6,1,2,3,5,5};
        int target = 1;
        System.out.println(solution(nums, target));
    }


    static int solution(int[] nums, int target){
        int pivot = findPivotWithDuplicate(nums, 0, nums.length-1);
        if(pivot == -1){
            return bs(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return bs(nums, target, 0, pivot-1);
        }
        return bs(nums, target, pivot+1, nums.length-1);
    }
    static int bs(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target)return mid;
            if (target < arr[mid] ){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }


        }
        return -1;
    }
    static int findPivotWithDuplicate(int[] nums, int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            // if elemetns at start end mid are same just skip duplicate
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
                // now either left or right is sorted
                // check using below conditions 
            } else if (nums[start]<nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid+1;
            }
            else {
                end= mid-1;
            }

        }
        return -1;

    }
}
