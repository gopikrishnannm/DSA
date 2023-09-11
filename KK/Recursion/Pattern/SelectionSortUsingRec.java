package Recursion.Pattern;

import java.util.Arrays;

public class SelectionSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,6};
        sS(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sS(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[max]){
                sS(arr, r, c+1, c);
            }
            else{
                sS(arr, r, c+1, max);
            }

        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            sS(arr, r-1, 0, 0);
        }

    }
}
