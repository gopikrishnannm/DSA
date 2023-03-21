package QandS;

import java.util.Arrays;
import java.util.Stack;

// not completed
public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(Arrays.toString(usingStack(heights)));
    }
    public static int bruteforce(int[] heights){
        int maxarea = 0;
        int minheight = 0;
        for (int i = 0; i < heights.length; i++) {
            minheight = heights[i];
            maxarea = Math.max(heights[i], maxarea);
            for (int j = i-1; j >=0 ; j--) {
                minheight = Math.min(minheight, heights[j]);
                int width = i-j+1;
                maxarea = Math.max(minheight * width , maxarea);
            }
        }
        return maxarea;
    }
    public static int[] usingStack(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] rlimit = new int[n];
        int[] llimit = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()]>heights[i]) {
                st.pop();
            }
            if (st.isEmpty()){
                llimit[i] = 0;

            }
            else {
                llimit[i] = st.peek()+1;
            }
            st.push(i);

        }
        while (!st.isEmpty()){
            st.pop();
        }
        for (int i = n-1; i >=0 ; i--) {
            if (st.isEmpty()){
                rlimit[i] = n-1;
                st.push(i);
            }
            if (heights[i]< heights[st.peek()]){
                rlimit[i] = st.peek();

            }
        }
        return llimit;
    }
}
