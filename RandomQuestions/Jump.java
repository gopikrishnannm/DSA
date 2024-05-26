public class Jump {
    public static void main(String[] args) {
        int[] l = {
                2,3,1,1,4
        };
        System.out.println(jump(l));
    }
    static public boolean jump(int[] nums) {
        int maxJumpIndex = 0;
        int length = nums.length;
        boolean flag = false;
        for(int i=0;i<length;i++){
            if(i+nums[i] > maxJumpIndex){
                maxJumpIndex = i+nums[i];
            }
            if(maxJumpIndex >= length){
                flag = true;
                break;
            }
        }
        if(flag){
            return true;
        }
        return false;
    }
}
