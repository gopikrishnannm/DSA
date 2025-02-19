import java.util.Arrays;

public class MakeZerosAtLast {

    public static void main(String[] args) {

        int[] arr = {1,1,0};
        zero2(arr);
    }
    //bubble sort
    static void zero(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void zero2(int[] arr){
        int n = arr.length;

        // keep a pointer j to know the place of 0
        int j=0;

        // iterate through the array
        for (int i = 0; i < n; i++) {
            // if the item is non zero then swap with j where zero present
            //{1,0,25,0,0,10,0};
            if (arr[i] != 0){

                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                // increment j value. it still pointing to the recent changed zero
                j++;
                // when next item comes it will be replaced with this zero and then j++
            }

        }
        System.out.println(Arrays.toString(arr));
    }


}
