package QandS;

import java.util.Stack;

// not completed
public class MinimumInsertionstoBalanceaParenthesesString {
    public static void main(String[] args) {
        String s = "))())(";
        boolean open = false;
        boolean closed = false;
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '('){
                st.push('(');
                open = true;
            }
            if (arr[i] == ')'){
                if (!st.isEmpty() && st.peek() == '(') {
                    closed = true;
                    st.push(arr[i]);
                    continue;
                }
                if (closed && open){
                    st.pop();
                    st.pop();
                    open = false;
                    closed = false;
                }
                else st.push(')');
            }
        }
        System.out.println(st.size());
    }
}

