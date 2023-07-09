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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "---->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
