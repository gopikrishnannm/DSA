package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {
                1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,21,22,23,24,25,26,27,28,29
        };
        int target = 21;
        int ans = infiniteFind(arr, target);
        System.out.println(ans);
    }
    static int infiniteFind(int[] arr, int target){
        int start = 0;
        int end =1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end - start+1) * 2 ;
            start = newStart;
        }

        return binSearch(arr, target, start, end);
    }

    static int binSearch(int[] arr, int target, int start, int end){
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
}
