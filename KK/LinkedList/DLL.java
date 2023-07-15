package LinkedList;

public class DLL {

    Node head;
    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node;
        }
        head = node;

    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }



    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value + "--->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayInReverse(){
        Node node = head;  // for traversing the ll
        Node last = null;  // keeping a last pointer
        while(node != null){
            last = node;  // updating the last node by traversing
            node = node.next;
        }
        while (last!=null){  // traversing backwards
            System.out.print(last.value+"---->");
            last = last.prev;
        }
        System.out.print("START");
    }


}
