package QandS;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        RemoveEfficient ie = new RemoveEfficient();
        ie.add(10);
        ie.add(20);
        ie.add(30);
        ie.add(40);
        ie.remove();
        System.out.println(ie.peek());

    }
}
class InsertEfficient{

    private Stack<Integer> first;
    private Stack<Integer> second;

    public InsertEfficient(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove(){
        // moving all the items from stack1 to stack2
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        //after removing the top most item moving back the items
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return  first.isEmpty();
    }

    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

    }
}

class RemoveEfficient{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public RemoveEfficient(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }

    public boolean isEmpty(){
        return  first.isEmpty();
    }

    public int peek(){
        return first.peek();

    }
}

