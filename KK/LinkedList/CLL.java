package LinkedList;

public class CLL {

    private Node head;

    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void delete(int value){
        Node node = head;
        if (node == null)
            return;
        if (node.value == value){
            head = node.next;
            tail.next = head;
            return;
        }



    }

    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.value+"-->");
                node = node.next;
            }while (node!=head);
        }
        System.out.print("END");
    }
}
