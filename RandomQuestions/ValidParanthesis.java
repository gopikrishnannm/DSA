public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "((*)))";
        char[] arr = s.toCharArray();
        System.out.println(helper(arr, 0, 0));
    }
    static boolean helper(char[] arr,int index, int count){
        if(count < 0){
            return false;
        }
        if(index == arr.length){
            return count == 0 ;
        }
        if(arr[index] == '('){
            return helper(arr, index+1, count+1);
        }
        if(arr[index] == ')'){
            return helper(arr, index+1, count-1);
        }
        return (helper(arr, index+1, count-1) || helper(arr, index+1, count+1) || helper(arr, index+1, count));
    }
}
