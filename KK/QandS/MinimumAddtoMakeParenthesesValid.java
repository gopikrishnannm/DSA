package QandS;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "())))";
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '('){
                st.push('(');
            }
            if (arr[i] == ')'){
                if (!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else st.push((arr[i]));
            }
        }
        System.out.println(st.size());
    }
}
