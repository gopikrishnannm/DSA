package Recursion.ArraysQuestions;

import java.util.ArrayList;

public class LinearSearchAllOccurance {
    public static void main(String[] args) {
        linearSearchAllOccurance2(new int[]{1, 10, 41, 5, 41},4 );
    }
    static void linearSearchAllOccurance(int[] arr, int target){

        helper1(arr, target,  0);
        System.out.println(list);
    }
    static void linearSearchAllOccurance2(int[] arr, int target){

        ArrayList<Integer> ans = helper2(arr, target,  0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    private static void helper1(int[] arr,int target,  int indexCovered){
        if (indexCovered == arr.length){
            return;
        }
        if (arr[indexCovered] == target ){
            list.add(indexCovered);
        }
        helper1(arr, target, indexCovered+1);
    }

    private static ArrayList helper2(int[] arr, int target, int index, ArrayList<Integer> alist){
        if (index == arr.length){
            return alist;
        }
        if (arr[index] == target){
            alist.add(index); // different function call has different reference variable but all of
            // them are pointing to same arrayList object
        }
        return helper2(arr, target, index+1, alist);
    }
}
