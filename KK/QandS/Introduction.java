package QandS;

import java.util.*;

public class Introduction {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        //System.out.println(stack.pop()); EmptyStackException
//        Queue<Integer> queue = new LinkedList();
//        queue.add(1);
//        queue.add(2);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        // uses
        // to store and use the result in future
        //bfs dfs

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.removeFirst();
        deque.removeLast();
        deque.peekFirst();
        System.out.println(deque);
        System.out.println(deque.peek());



    }
}
