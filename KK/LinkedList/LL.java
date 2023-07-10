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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "---->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    //33.32

}
