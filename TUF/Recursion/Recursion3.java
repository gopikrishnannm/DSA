package Recursion;

import java.util.Arrays;

public class Recursion3 {

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5};
        //revArr2(arr, 0,arr.length-1);
        //revArr(arr, 0);
        //System.out.println(Arrays.toString(arr));
        String str = "madam";
        System.out.println(isPalindrome(str,0));
    }
    // Palindrome checking
    private static boolean isPalindrome(String str,int i) {
        if (i>=str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return isPalindrome(str, i+1);
    }

    //Using single pointer
    private static void revArr(int[] arr, int ptr) {
        if (ptr>=arr.length/2)
            return;
        int temp = arr[ptr];
        arr[ptr] = arr[arr.length-ptr-1];
        arr[arr.length-ptr-1] = temp;
        revArr(arr, ptr+1);
    }


    //Using 2 pointers
    private static void revArr2(int[] arr, int l, int r) {
        if (l>=r)
            return ;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revArr2(arr, l+1,r-1);
    }
}
