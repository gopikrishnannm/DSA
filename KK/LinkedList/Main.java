package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAtFirst(5);
        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(25);
        ll.insertRec(2,15);
        ll.display();

        //1:52
    }
}
