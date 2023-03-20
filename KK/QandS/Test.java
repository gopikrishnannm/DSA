package QandS;

public class Test {
    public static void main(String[] args) throws Exception {
       CircularQueue cq = new CircularQueue();
       cq.insert(1);
       cq.insert(2);
       cq.insert(3);
       cq.remove();
       cq.insert(4);
       cq.display();

    }
}
