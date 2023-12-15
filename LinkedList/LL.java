package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        int size = 0;
    } 

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }


    public void insert(int val , int index){
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFist(){
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size<=1) {
            return deleteFist();
        }
        Node temp = head;
        int lastVal = tail.val;

        for (int i = 1; i < size-2; i++) {
            temp = temp.next;
        }
        
        tail = temp.next;
        tail.next = null;

        size--;
        return lastVal;
    }

    public int delete(int index){
        if (index == 0) {
            return deleteFist();
        }
        if (index == size-1 ) {
            return deleteLast();
        }

        if (index < 0 || index > size-1) {
            System.out.print("Invalid index i.e ");
            return index;
        }

        Node temp = head;
        for (int i = 0; i <= index-2; i++) {
            temp = temp.next;
        }
        Node del = temp.next;
        temp.next = del.next;

        return del.val;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

}
