package LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.insertFirst(5);
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertAtSpecifiedIndex(2, 30);
        ll.displayInReverse();
        //1:27
    }
}
