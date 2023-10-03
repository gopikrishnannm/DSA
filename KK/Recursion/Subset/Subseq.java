package Recursion.Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subseq {
    public static void main(String[] args) {

        List<List<Integer>> ans = subSet(new int[]{1,2,2});
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }
    public static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p+up.charAt(0), up.substring(1));
        subseq(p, up.substring(1));

    }
    static ArrayList<String> ans = new ArrayList<>();
    public static void subseq(String p, String up, ArrayList<String> ans){
        if (up.isEmpty()){
            ans.add(p);
            return;
        }
        subseq(p+up.charAt(0), up.substring(1), ans);
        subseq(p, up.substring(1), ans);

    }
    public static ArrayList<String> subseqret(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subseqret(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subseqret(p, up.substring(1));

        left.addAll(right);

        return left;

    }
    public static void subseqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseqAscii(p+up.charAt(0), up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (up.charAt(0) + 0), up.substring(1));

    }

    public static ArrayList<String> subseqretAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqret(p+ch, up.substring(1));
        ArrayList<String> second = subseqret(p, up.substring(1));
        ArrayList<String> third = subseqret( p + (ch+0),  up.substring(1));

        first.addAll(second);
        first.addAll(third);


        return first;

    }

    // TimeComplexity
    //O(N [n items copying] * 2^n [Total number of subsets we get])

    // 2^n * n[space taken by each subset]

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // creating an empty list inside doubly list
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {  // loop through no of list inside the outer list
                // and then creating inner list with the copy of already present inner list
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                // add the new number in the copy inner list old remains the same
                inner.add(num);
                outer.add(inner);// add the inner to outer list
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // creating an empty list inside doubly list
        int start = 0;
        int end = 0;
        // when you find a duplicate element, only add it into newly created subset of previous step
        // for that we have to make sure our array is sorted so that dup element will be together
        //  [] [1] ||[2], [1,2] -> newly created subset
        // [] [1],  [1,2],[2]     || [2], [1,2], [2,2], [1,2,2]
        //           xxxxxxx

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j  = start; j < n; j++) {  // loop through no of list inside the outer list
                // and then creating inner list with the copy of already present inner list
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                // add the new number in the copy inner list old remains the same
                inner.add(arr[i]);
                outer.add(inner);// add the inner to outer list
            }
        }
        return outer;
    }

}
