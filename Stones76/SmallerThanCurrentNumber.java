import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        //[4,0,1,1,3]
        int[] ans = smaller2(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smaller(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    static int[] smaller2(int[] nums){
        int n = nums.length;
        int[] copy = nums.clone();
        int[] ans = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(copy);
        for (int i = 0; i < n; i++) {
            // condition is less than current value so if 3 2's are there only one should consider
            map.putIfAbsent(copy[i],i);
        }

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }

}
