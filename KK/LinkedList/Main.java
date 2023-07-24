package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll1 = new LL();
        ll1.insertAtLast(1);
        ll1.insertAtLast(2);
        ll1.insertAtLast(4);
        ll1.insertAtLast(5);
        ll1.makeitCycle();
        System.out.println(ll1.hasCycle());
        System.out.println(ll1.countCycleElements());



//        LL ans = LL.merge(ll1, ll2);
//        ans.display();

    }
}
