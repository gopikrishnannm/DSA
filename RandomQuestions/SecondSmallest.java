import java.util.Arrays;
import java.util.Collections;

public class SecondSmallest {
    public static void main(String[] args) {
        using2loop(new int[]{1,1,2,3,4,5});
    }
    static void usingSort(int[] arr){
        Arrays.sort(arr);
        int smallest = arr[0];
        for(int num : arr){
            if(num!=smallest){
                System.out.println(num);
                break;
            }


        }

    }
    static void using2loop(int[] arr){
        // first find smallest
        int smallest = Integer.MAX_VALUE;
        for (int num : arr){
            if(smallest > num ){
                smallest = num;
            }
        }
        int secondSmall = Integer.MAX_VALUE;
        for (int num: arr){
            if (num > smallest && num < secondSmall){
                secondSmall = num;
            }
        }
        System.out.println(secondSmall);
    }
}
