import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] weights = {
                57, 95, 13, 29, 1, 99, 34, 77, 61, 23, 24, 70, 73, 88, 33, 61, 43, 5, 41, 63, 8, 67, 20, 72, 98, 59, 46, 58,
                64, 94, 97, 70, 46, 81, 42, 7, 1, 52, 20, 54, 81, 3, 73, 78, 81, 11, 41, 45, 18, 94, 24, 82, 9, 19, 59, 48, 2, 72
        };
        int[] values = {
                83, 84, 85, 76, 13, 87, 2, 23, 33, 82, 79, 100, 88, 85, 91, 78, 83, 44, 4, 50, 11, 68, 90, 88, 73, 83, 46, 16,
                7, 35, 76, 31, 40, 49, 65, 2, 18, 47, 55, 38, 75, 58, 86, 77, 96, 94, 82, 92, 10, 86, 54, 49, 65, 44, 77, 22, 81, 52
        };
        int capacity = 58;
        int numItems = weights.length;

        int maxValue = Solution.knapSack(capacity, weights, values, numItems);
        System.out.println("Maximum value in knapsack = " + maxValue);
    }
}
class Solution
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n)
    {
        ArrayList<Item> arr = new ArrayList<>();
        for(int i=0;i<n;i++){

            arr.add(new Item(val[i], wt[i]));
        }
        Collections.sort(arr, new ItemComparator());
        int total = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).weight <= w){
                total += arr.get(i).value;
                w -= arr.get(i).weight;
            }
        }
        return total;
    }
}


class Item{
    int value;
    int weight;

    Item(int value, int weight){
        this.value = value;
        this.weight = weight;
    }

}

class ItemComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2){
        double d1 = (double)o1.value / (double)o1.weight;
        double d2 = (double)o2.value / (double)o2.weight;
        if(d1 < d2 ){
            return 1;
        }
        else if(d1 > d2){
            return -1;
        }
        else{
            return 0;
        }
    }
}