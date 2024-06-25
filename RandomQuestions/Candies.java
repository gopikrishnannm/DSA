public class Candies {
    public static void main(String[] args) {
        int[] arr = {
                0,2,4,3,2,1,1,3,5,6,4,0,0
        };
        System.out.println(helper2(arr));
    }

    static int helper(int[] arr){
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int candies = 1;

        left[0] = 1;

        right[n-1] = 1;

        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]){
                left[i] = left[i-1] + 1;
            }
            else{
                left[i] = 1;
            }
        }
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] > arr[i+1]){
                right[i] = right[i+1] + 1;
            }
            else{
                right[i] = 1;
            }
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += Math.max(left[i] , right[i]);
        }

        return total;
    }
    static int helper2(int[] arr){
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int candies = 1;

        left[0] = 1;

        right[n-1] = 1;

        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]){
                left[i] = left[i-1] + 1;
            }
            else{
                left[i] = 1;
            }
        }
        int current = 1;
        int r = 1 ;
        int sum = Math.max(1, left[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] > arr[i+1]){
                current += 1;
                r = current;
            }
            else{
                current = 1;
            }
            sum = sum + Math.max(current, left[i]);
        }



        return sum;
    }
}
