package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3};
        int ans = findPivot(arr)+1;
        System.out.println(ans);
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start] > nums[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;

    }
}
