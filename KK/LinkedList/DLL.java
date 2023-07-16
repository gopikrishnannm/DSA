package LinkedList;

public class DLL {

    Node head;

    int size = 0;
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
        size++;
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
        size++;
    }

    public void insertAtSpecifiedIndex(int index, int value){

        if (index == 0)
            insertFirst(value);
        else if (index == size) {
            insertLast(value);
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
            node.prev = temp;
            node.next = tempValue; // assigning to the new node
            node.next.prev = node;    // node.next is    [old node]-> [new node] <- [node.next.prev]
            //tempValue.prev = node;
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
