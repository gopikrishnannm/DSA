package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 77;
        int s = 0;
        int e = arr.length-1;
        System.out.println(Bsearch(arr, target, s, e ));
    }
    public static int Bsearch(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (target<arr[m]){
            // since return type is int we have to mention return over here . just do it
            return Bsearch(arr, target, s, m-1);
        }
        return Bsearch(arr, target,m+1,e);

    }
}