package QandS;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 3;


    int front, end, size = 0;
    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isEmpty(){
        if (size == 0) return true;
        else return false;
    }
    public boolean isFull(){
        if (size == data.length) return true;
        else return false;
    }
    public boolean insert(int item) throws Exception {
        if (isFull())
            throw new Exception("circular queue is full");
        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("circular queue is empty");
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public void display(){
        if (isEmpty())
            System.out.println("queue is empty");
        int ptr = front;
        do{
            System.out.print(data[ptr++]+ " --> ");
            ptr = ptr % data.length;
        }while(ptr != end);
        System.out.println("eocq");
    }

}
