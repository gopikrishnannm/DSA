package LinkedList;

public class LL {

    private Node head;
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
    //41:52
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "---->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
