package LinkedList;

public class MainPr {
    public static void main(String[] args) {
        
        // LL list = new LL();
        // list.insertFirst(59);
        // list.insertFirst(32);
        // list.insertFirst(94);

        // //insertion at last
        // list.insertLast(99);

        // //insert at any index
        // list.insert(45, 2);
        // list.insert(13, 5);
        
        // list.display();


        // System.out.println(list.deleteFist());  // will delete head node and head becomes head.next
        // list.display();
        
        // System.out.println(list.deleteLast());
        // list.display();

        // System.out.println(list.deleteLast());
        // list.display();

        // System.out.println(list.delete(2));
        // list.display();




        /*Doubly Linked List */

        DLL dlist = new DLL();

        dlist.insertFirst(5);
        dlist.insertFirst(23);
        dlist.insertFirst(46);
        dlist.insertFirst(16);
        dlist.insertFirst(7);

        // dlist.Display();
        
        dlist.insertLast(99);
        // dlist.insertLast(465);
        dlist.Display();
        
        dlist.insert(33, 4);
        dlist.Display();
    }
}
