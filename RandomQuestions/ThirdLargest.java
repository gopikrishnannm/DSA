import java.util.Arrays;
import java.util.Collections;

public class ThirdLargest {
    public static void main(String[] args) {
        traversing3times(new Integer[] {1,2,3,4, 4,5,1,2});
    }
    static void withSorting(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        int largest = arr[0];
        int i=0;
        while(largest == arr[i]){
            i++;
        }
        int secondL = arr[i];
        while (secondL == arr[i]){
            i++;
        }
        System.out.println("Third largest is "+ arr[i]);

    }
    static void traversing3times(Integer[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int secondL = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> secondL && arr[i] < largest){
                secondL = arr[i];
            }
        }
        int thirdL = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > thirdL && arr[i]<secondL){
                thirdL = arr[i];
            }
        }
        System.out.println(thirdL);
    }
    static void threePointer(Integer[] arr){
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            if(arr[i] > second && arr[i]!= first){
                third = second;
                second = arr[i];
            }
            if (arr[i] > third && arr[i] != second && arr[i] != first){
                third = arr[i];
            }

        }
        System.out.println(third);
    }
}
