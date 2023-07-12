package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertAtFirst(10);
        l.insertAtLast(20);
        l.insertAtLast(30);
        l.insertAtLast(40);
        l.display();
        l.insertAtSpecifiedIndex(2,15);
        System.out.println(l.deleteFromLast());
        System.out.println(l.deleteFromSpecificIndex(1));
        l.display();
        //51
    }
}
