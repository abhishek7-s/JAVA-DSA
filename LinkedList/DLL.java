package LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev= null;
            head = node;
            return;
        }

        while (last.next != null) {
                last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int val , int index){
        if (index < 0 || index > size) {
            System.out.println("Invalid index i.e " + index);
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val ,temp.next , temp );
        temp.next = node;
        size++;
    }

    public void Display(){  
            Node node = head;
            while (node!=null) {
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.err.println("End");

    }


    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        Node(int val ,Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
