package Recursion.ArraysQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 10, 41, 5}, 22));
    }

    static int linearSearch(int[] arr, int target){

        return helper1(arr, target,  0);
    }
    private static int helper1(int[] arr,int target,  int indexCovered){
        if (indexCovered == arr.length){
            return -1;
        }
        if (arr[indexCovered] == target ){
            return indexCovered;
        }
        return helper1(arr, target, indexCovered+1);
    }





}
