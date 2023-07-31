package LinkedList;

public class LL {

    public Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0; // when ll is created, size is set as 0
    }

    private class Node{
        private int value;
        private Node next; // pointing to next node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;  // newly created node points to the first element (head)
        head = node; // making new node as head

        if (tail == null)
            tail = head;   // if it is the first node then make tail as first node

        size++;
    }

    public void insertAtLastWithoutTail(int val){  // not done in constant time
        Node node = new Node(val);
        Node temp = head;   // created a temp  which starts from head
        while(temp.next!= null){ // finding last node
           temp =  temp.next;  // assigning temp to last node
        }
        temp.next = node;
        size++;
    }

    public void insertAtLast(int val){
        if (tail == null){
            insertAtFirst(val);
            size++;
            return;
        }

//        if (tail == null && head == null) { // empty linked list
//            head = tail = node; // first node
//        }
        Node node = new Node(val);
        tail.next = node; // attaching new node to the ll
        tail = node; // new node becomes the tail
        size++;
    }


    public void insertAtSpecifiedIndex(int index, int value){

        if (index == 0)
            insertAtFirst(value);
        else if (index == size) {
            insertAtLast(value);
        }
        else{
            Node node = new Node(value);
            Node temp = head;
            int counter = 0;
            while (counter != index-1){ // finding the node, which is  just behind the index value
                counter++;
                temp = temp.next; // moving the temp until it reaches the index-1
            }
            Node tempValue = temp.next;  // storing index-1 th node link to temporary variable
            temp.next = node;
            node.next = tempValue; // assigning to the new node
            size++;

//            Node temp = head;
//            for (int i = 1; i < index; i++) {
//                temp = temp.next;
//
//            }
//            Node node = new Node(value, temp.next);
//            temp.next = node;
        }
    }


    // recurison can be 2 - one with void return type  - make the changes in ll
    //                    - node return type that returns the list node to change the structure
    public void insertRec(int index, int value){
        head = insertRec(index, value, head);
    }

    // 3 - 5 - 9 -> 7 - 1
    private Node insertRec(int index, int value, Node node){
        if (index == 0){
            Node temp = new Node(value);
            temp.next = node; // points to current node ie. 1
            size++;
            return temp;  // returning 7
        }
        //after returning 7, now the current node will be 9 so 9.next is whatever returned
        // in the previous recursion
        // then 9 will be returned to 5.next
        node.next = insertRec(index-1, value, node.next);
        //finally returning the first node
        return node;
    }

    public int deleteFromFirst(){
        int val = head.value;
        head = head.next;
        if (head == null)
            tail = null;  // if only one node is present
        size--;
        return val;
    }




    public int deleteFromLast(){
        if (size<=1){
            return deleteFromFirst();
        }
        Node secondLast = getNode(size-2);
        int value = tail.value;
        secondLast.next = null;
        tail = secondLast;    // last element will be removed by garbage collector later on.

        return value;
    }

    public int deleteFromSpecificIndex(int index){
        if (size<=1){
            return deleteFromFirst();
        }
        if (index == size-1) {
            return deleteFromLast();
        }
        Node previous = getNode(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }
    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;   // return reference point to the node index-number
    }

    public Node findNode(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    // 1 1 2 2 3 3 3
    public void duplicates(){
        Node node= head;
        while(node.next != null){
            if (node.next.value == node.value){  // checking first one and second second item are
                // same.
                node.next = node.next.next; // it is same so first one points to 2.
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (s!=null && f!=null) {
            if (f.value > s.value) {
                ans.insertAtLast(s.value);
                s = s.next;
            } else if (s.value > f.value) {
                ans.insertAtLast(f.value);
                f = f.next;
            } else {
                ans.insertAtLast(f.value);
                ans.insertAtLast(s.value);
                s = s.next;
                f = f.next;
            }
        }
        if (f == null) {
            while (s!=null){
                ans.insertAtLast(s.value);
                s = s.next;
            }
        }
        else{
            while (f!=null){
                ans.insertAtLast(f.value);
                f = f.next;
            }
        }
        return ans;
    }

    public void makeitCycle(){ // for testing hascycle problem
        if (head == null){
            System.out.println("empty");
            return;
        }
        if (head == tail){
            System.out.println("single item");
            return;
        }
        tail.next = head;
    }

    public boolean hasCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public int countCycleElements(){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                do {
                    slow = slow.next;
                    count++;
                }while (fast != slow);
            return count;
            }
        }
        return 0;
    }



    public int cyclePosition(LL ll){
        int length = 0;
        if (hasCycle(ll)){
            length = countCycleElements(ll);
        }
        else {
            return 0;
        }
        Node first = head;
        Node second = head;
        while(length>0){
            second = second.next;
            length--;
        }
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return first.value;
    }


    public boolean hasCycle(LL ll){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public int countCycleElements(LL ll){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                do {
                    slow = slow.next;
                    count++;
                }while (fast != slow);
                return count;
            }
        }
        return 0;
    }

    public int middleElement(){
        Node node = head;
        int length = 0;
        while(node!=null){
            node = node.next;
            length++;
        }
        Node node2 = head;
        length /= 2;
        while (length > 0){
            node2 = node2.next;
            length--;
        }
        return node2.value;
    }

    public int middleElement2(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null  ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;

    }

    public void reverseLL(Node node){
        if (node == tail){
            head = node;
            return;
        }
        reverseLL(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;

    }

    public void reverselLL2(Node node){
        if (head == null)
            System.out.println("nothing is there to reverse");
        Node prev = null;
        Node present = head;
        Node next = head.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next!=null){
                next = next.next;
            }
        }
        head = prev;

    }


    public void reverselLLinBetween(int left, int right){
        if (left == right){
            System.out.println("nothing to return");
        }
        // to skip first left-1 node
        Node current = head;
        Node previous = null;
        for (int i = 0; current!=null &&i < left-1; i++) {
            previous = current;
            current = current.next;
        }

        Node last = previous;    // at the end we have to connect this with the reversed list
        Node newEnd = current;  // it will be connected to the other end after the reversal

        // reversal part copied from the top

        Node next = current.next;
        for (int i = 0; current!=null && i < right-left+1; i++) { // left - right + 1 items has to be reversed
            current.next = previous;
            previous = current;
            current = next;
            if (next!=null){
                next = next.next;
            }
        }
        if (last!=null){
            last.next = previous;
        }else {
            head = previous;
        }

        newEnd.next = current;


    }

    public boolean palindromeCheck(Node node){
        Node middle = middleElement2(node); // finding the middle element
        Node secondHalfHead = reverselLL2withReturnType(middle); // reversing from middle
        Node rereverseHead = secondHalfHead; // storing second half head for re reversing after the
        // palindrome comparison

        // compare both half
        while (node != null && secondHalfHead!= null){
            if (node.value!=secondHalfHead.value)
                break;
            node = node.next;
            secondHalfHead = secondHalfHead.next;
        }

        reverseLL(rereverseHead); // rereversing to old state of ll

        if (node==null || secondHalfHead == null){
            return true;
        }
        return false;

    }

    public Node reverselLL2withReturnType(Node node){
        if (head == null)
            System.out.println("nothing is there to reverse");
        Node prev = null;
        Node present = head;
        Node next = head.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next!=null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    public Node middleElement2(Node node){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null  ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public void reOrder(Node node){
        if (node==null || node.next == null){
            System.out.println("nothing to return");
            return;
        }
        Node midelement = middleElement2(node);
        Node secondHead = reverselLL2withReturnType(midelement); // second part reversed and first element
        // of the second reversed part will be the head of second part

        Node firstHead = node;

        //rearrange

        while (firstHead!=null && secondHead!=null){
            Node temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;
            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if (firstHead!=null){
            firstHead.next = null;
        }


    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "---->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
