package QandS;

public class CutomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    CutomQueue(){
        this(DEFAULT_SIZE);
    }
    CutomQueue(int size){
        this.data = new int[size];
    }
    public boolean isEmpty(){
        if (end == 0) return true;
        else return false;
    }
    public boolean isFull(){
        if (end == data.length-1) return true;
        else return false;
    }
    public boolean add(int item) throws Exception {
        if (isFull())
            throw new Exception("queue is full");
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");
        int removed = data[0];
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];
        }
        return removed;
    }

    public void dispay(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <-- ");
        }
        System.out.print("eoq");
    }
}
