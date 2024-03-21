package BinarySearch;

import java.util.Arrays;

public class Thirty4 {
    public static void main(String[] args) {
        // find starting and ending of target in ascending order array
        int[] arr = {
                5, 7,7,7,7,8,8,10
        };
        int target = 8;
        int[] ans = bruteForce(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bruteForce(int[] arr, int target){
        int starting = 0;
        int ending = arr.length-1;
        boolean start = false;
        boolean end = false;
        int startingIndex = 0;
        int endingIndex=0;
        while(starting!=arr.length-1 && ending!=0){
            if (arr[starting] == target && start==false ){
                startingIndex = starting;
                // no need to move forward as we found starting point
                // setting a flag as true
                start=true;
            }
            if (arr[ending] == target && end==false){
                endingIndex = ending;
                end = true;
            }

            starting++;
            ending--;
        }
        if (start){
            return new int[] {startingIndex, endingIndex};
        }
        return new int[] {-1, -1};
    }
}
