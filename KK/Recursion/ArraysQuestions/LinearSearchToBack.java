package Recursion.ArraysQuestions;

public class LinearSearchToBack {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 10, 41, 5}, 41));
    }

    static int linearSearch(int[] arr, int target){

        return helper(arr, target,  arr.length-1);
    }
    private static int helper(int[] arr,int target,  int indexCovered){
        if (indexCovered == -1){
            return -1;
        }
        if (arr[indexCovered] == target ){
            return indexCovered;
        }
        return helper(arr, target, indexCovered-1);
    }
}
