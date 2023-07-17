package LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.insertFirst(5);
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertAtSpecifiedIndex(2, 30);
        ll.display();
        ll.insertAfterValue(5,15);
        ll.insertAfterValue(40,100);
        ll.display();
        //137
    }
}
