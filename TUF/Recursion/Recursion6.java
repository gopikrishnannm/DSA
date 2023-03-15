package Recursion;

import java.util.ArrayList;

public class Recursion6 {
    public static void main(String[] args) {
        int index = 0;
        int[] inputArray = {1, 2, 1};
        ArrayList<Integer> tempArray = new ArrayList<>();
        int subSum=0;
        int target = 2;
        subSequenceSum(index, inputArray, tempArray, inputArray.length, subSum, target);
    }
    public static void subSequenceSum(int index, int[] inputArray,ArrayList<Integer> tempArray, int length, int subSum, int target){
        if(index >= length){
            if (subSum == target )
                System.out.println(tempArray);
            return;
        }
        tempArray.add(inputArray[index]);
        //subSum += tempArray.get(index);
        subSum += inputArray[index];
        subSequenceSum(index+1, inputArray, tempArray, inputArray.length, subSum, target);
       // subSum -= tempArray.get(index);
        subSum -= inputArray[index];
        tempArray.remove((tempArray.size()-1));
        subSequenceSum(index+1, inputArray, tempArray, inputArray.length, subSum, target);
    }
}
