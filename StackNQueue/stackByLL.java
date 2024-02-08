package StackNQueue;

public class stackByLL {

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


    private Node head;
    private Node tail;
    private int size;


    public void push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void pop(){
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println(val+" is removed");

    }

    public void peek(){
        System.out.println("Top element is "+head.val);
    }


    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(" > "+temp.val);
            temp = temp.next;
        }
        // System.out.println("End");
    }


}
