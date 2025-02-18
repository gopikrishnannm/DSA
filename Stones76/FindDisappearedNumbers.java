import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(FindDisappearedNumbers(arr).toString());
    }

    static List<Integer> FindDisappearedNumbers(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }

}
