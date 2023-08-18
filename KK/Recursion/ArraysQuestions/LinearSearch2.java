package Recursion.ArraysQuestions;

public class LinearSearch2 {
    public static void main(String[] args) {
        System.out.println(linearSearch2(new int[]{1, 10, 41, 5}, 1));
    }

    static boolean linearSearch2(int[] arr, int target){

        return helper(arr, target,  0);
    }
    private static boolean helper(int[] arr,int target,  int indexCovered){
        if (indexCovered == arr.length){
            return false;
        }
        return arr[indexCovered] == target ||  helper(arr, target, indexCovered+1);
    }
}
