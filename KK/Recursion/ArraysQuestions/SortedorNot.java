package Recursion.ArraysQuestions;

public class SortedorNot {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,41,5}));
    }

    static boolean isSorted(int[] arr){
        return helper(arr, 0);
    }
    private static boolean helper(int[] arr, int indexCovered){
        if (indexCovered == arr.length-1){
            return true;
        }
        return arr[indexCovered]<arr[indexCovered+1] && helper(arr, indexCovered+1);
    }
}
