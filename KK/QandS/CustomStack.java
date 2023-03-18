package QandS;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item) throws Exception {
        if (isFull()){
            throw new Exception("stack is full man !!");
        }
        data[++ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("stack is empty!!");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("stack is empty!!");
        }
        return data[ptr];
    }


    public boolean isEmpty(){
        if (ptr == -1) return true;
        else return false;
    }
    public boolean isFull(){
        if (ptr == data.length-1) return true;
        else return false;
    }

}
