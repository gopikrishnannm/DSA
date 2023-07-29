package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll1 = new LL();
        ll1.insertAtLast(6);
        ll1.insertAtLast(2);
        ll1.insertAtLast(4);
        ll1.insertAtLast(10);
        ll1.insertAtLast(5);
        ll1.insertAtLast(1);
        ll1.display();
        ll1.reverselLL2(ll1.head);
        ll1.display();



//        LL ans = LL.merge(ll1, ll2);
//        ans.display();

    }
}
