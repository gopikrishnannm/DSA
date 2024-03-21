package BinarySearch;

public class CellingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18 };
        int ans = findCelling(arr, -2);
        System.out.println(ans);
    }
    static int findCelling(int[] arr, int target){

        if (target > arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target)return arr[mid];
//            if (start==end)return arr[mid-1];
            if (target < arr[mid] ){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }


        }
        return start;
    }

    static int findFloor(int[] arr, int target){


        if (target>arr[arr.length-1]) return arr.length-1;
        int start = 0;
        int end = arr.length;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target)return arr[mid];
//            if (start==end)return arr[mid-1];
            if (target < arr[mid] ){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }


        }
        return end;
    }
}
