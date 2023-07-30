package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL ll1 = new LL();
        ll1.insertAtLast(1);
        ll1.insertAtLast(2);
        ll1.insertAtLast(3);
        ll1.insertAtLast(3);
        ll1.insertAtLast(2);
        ll1.insertAtLast(1);
        ll1.display();
        System.out.println(ll1.palindromeCheck(ll1.head));
        ll1.display();



//        LL ans = LL.merge(ll1, ll2);
//        ans.display();

    }
}
