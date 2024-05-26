package BinarySearch;

public class Eight52 {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,33,2,1};
        int ans = peak2(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr) {
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if (arr[i]>arr[j]){
                return arr[i];
            }
            i++;
            j++;
        }
        return -1;
    }

    static int peak2(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            // if start == end means we found the max value in the range
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //we are in descentng region so we have to check the previous area including
                // the mid element beacause this can be also the answer
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return arr[start];
    }


}
