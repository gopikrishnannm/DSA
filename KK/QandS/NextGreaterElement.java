package QandS;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 10, 12, 1, 11};
        System.out.println(Arrays.toString(forCircularray(arr)));
    }
    public static int[] bruteforce(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
            result[i] = -1;
        }
        return result;
    }
    public static int[] usingStack(int[] arr){   //{2, 10, 12, 1, 11};
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {
            // if item is greater than or equals the top of the stack and the stack is not empty
            // just pop the element from the stack
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            // if the stack is empty that means for the given element there is no greater element
            // so just mark it as -1 and push the item to the stack
            if (st.isEmpty()){
                result[i] = -1;
                st.push(arr[i]);
            }

            // if the item is less than the stack top then add stack top to the result and push the item to the
            // stack
            if (arr[i%arr.length] < st.peek()){
                result[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return  result;
    }
    public static int[] forCircularray(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 2 * n-1; i >= 0 ; i--) {
            // if item is greater than or equals the top of the stack and the stack is not empty
            // just pop the element from the stack
            while(!st.isEmpty() && arr[i%n] >= st.peek()) {
                st.pop();
            }

            if(i<n){
                if (!st.isEmpty())
                    result[i] = st.peek();
                else
                    result[i] = -1;
            }

            st.push(arr[i%n]);

        }
        return  result;
    }
}
