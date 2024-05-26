public class Jump2 {
    public static void main(String[] args) {
        int[] l = {
                2,3,0,1,4
        };
        System.out.println(jump(l));
    }
    static public int jump(int[] nums) {
        return helper(nums,0,0);
    }
    static int helper(int[] arr, int index, int jump){
        if(index>=arr.length-1){
            return jump;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<= arr[index];i++){
            min = Math.min(min, helper(arr, i+index, jump+1));
        }
        return min;
    }
}
