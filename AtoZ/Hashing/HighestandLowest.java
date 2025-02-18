package Hashing;

public class HighestandLowest {
    public static void main(String args[]){

        int arr[] ={10,5,10,15,15,5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n)
    {
        int maxFrequency = 0;
        int minFrequency = 5;;
        int maxElement = 0;
        int minElement = 0;
        int lowest = arr[0];
        boolean[] isvisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int number = arr[i];
            int count = 1;
            if (isvisited[i] == true){
                continue;
            }
            for (int j = i+1; j < n; j++) {
                if (number == arr[j]){
                    isvisited[j] = true;
                    count++;
                }
            }
            if(count > maxFrequency){
                maxElement = arr[i];
                maxFrequency = count;
            }
            if(count<minFrequency){
                minElement = arr[i];
                minFrequency = count;
            }
        }
        System.out.println(maxElement + " "+minElement );
    }
}
