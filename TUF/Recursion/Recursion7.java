package Recursion;

import java.util.ArrayList;

public class Recursion7 {
    public static void main(String[] args) {
        int[] inputArray = {1,2,1};
        int target = 2;
        printOnlyoneSumSubSequence(inputArray, target);
    }
    public static void printOnlyoneSumSubSequence(int[] arr, int target){
         worker(0,arr, new ArrayList<Integer>(), arr.length, 0, target );
    }
    private static boolean worker(int index, int[] inputArray, ArrayList<Integer> tempArray, int length, int subSum, int target){
        if (index == length){
            if (subSum == target){
                System.out.println(tempArray);
                return true;
            }
            else return false;
        }
        tempArray.add(inputArray[index]);
        subSum += inputArray[index];
        if (worker(index+1, inputArray, tempArray, inputArray.length, subSum, target) == true)
            return true;
        subSum -= inputArray[index];
        tempArray.remove(tempArray.size()-1);
        if (worker(index+1, inputArray, tempArray, inputArray.length, subSum, target) == true)
            return true;
        return false;
    }
}
