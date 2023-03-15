package Recursion;

import java.util.ArrayList;

public class Recursion5 {
    public static void main(String[] args) {
        int index = 0;
        int[] inputArray = {3, 1, 2};
        ArrayList<Integer> tempArray = new ArrayList<>();
       subSequencePrint(index, inputArray, tempArray, inputArray.length);
        //System.out.println(lenArray.size());
    } 
    //static ArrayList<ArrayList> lenArray = new ArrayList<>(); to check count

    private static void subSequencePrint(int index, int[] inputArray, ArrayList<Integer> tempArray, int length) {
        if (index >= length){
            if (tempArray.size() == 0)
                System.out.println("{}");
            else
                System.out.println(tempArray);
            return;
        }
        tempArray.add(inputArray[index]);
        subSequencePrint(index+1, inputArray, tempArray, length);
        tempArray.remove((tempArray.size()-1));
        subSequencePrint(index+1, inputArray, tempArray, length);

    }
}
