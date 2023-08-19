package Recursion.ArraysQuestions;

import java.util.ArrayList;

public class LinearSearchAllOccurance {
    public static void main(String[] args) {
        linearSearchAllOccurance(new int[]{1, 10, 41, 5, 41}, 41);
    }
    static void linearSearchAllOccurance(int[] arr, int target){

        helper1(arr, target,  0);
        System.out.println(list);
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
}
