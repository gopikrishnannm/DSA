package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll1 = new LL();
        ll1.insertAtLast(1);
        ll1.insertAtLast(2);
        ll1.insertAtLast(4);
        ll1.display();
        LL ll2 = new LL();
        ll2.insertAtLast(1);
        ll2.insertAtLast(3);
        ll2.insertAtLast(4);
        ll2.display();


        LL ans = LL.merge(ll1, ll2);
        ans.display();

    }
}
