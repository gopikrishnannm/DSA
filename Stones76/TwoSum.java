import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,11,7,15};
        int target = 9;
        int[] ans = findIndex2(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findIndex(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    static int[] findIndex2(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
