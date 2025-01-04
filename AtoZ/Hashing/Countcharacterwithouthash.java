package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Countcharacterwithouthash {

    public static void main(String args[]){

        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n)
    {
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
            System.out.println("count of"+number+"is"+count);
        }
    }
    public List<Integer> frequencyCount(int[] arr) {



        Map<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for(int i=0; i<n;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = map.getOrDefault(i+1, 0);
        }

        List<Integer> list = new ArrayList<>();

        for(int number : ans){
            list.add(number);
        }

        return list;

    }

}
