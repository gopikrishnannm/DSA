package Recursion.Pattern;

import java.util.Arrays;

public class BubbleSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,6};
        bS(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bS(int[] arr, int r, int c){
        if (r == 0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            bS(arr, r, c+1);
        }
        else{
            bS(arr, r-1, 0);
        }

    }
}
