package StackNQueue;
import java.util.*;

// import java.util.Scanner;

public class mainOp {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // mystack list = new mystack(5);

        
        // list.push(52);
        // list.push(6);
        // list.push(97);
        // list.push(37);
        // list.push(26);

        // list.display();
        // // list.pop();
        
        // list.display();
        // list.peek();
        



        // System.out.println("Enter size of Stack");
        // int size = ip.nextInt();

/*Stack By Array */

        // mystack list = new mystack();
        // int ch = 0;
        // while (ch!=5) {
        //     System.out.println("-----------------------------");
        //     System.out.print("1.Add element in stack \n2.Remove Top element \n3.Print Top element \n4.Display Stack \n5.exit \nEnter ch ");
        //     ch = ip.nextInt();
        //     System.out.println("-----------------------------");

        //     switch (ch) {
        //     case 1:
        //         System.out.println("Enter element");
        //         int x = ip.nextInt();
        //         list.push(x);    
        //         break;

        //     case 2:
        //         list.pop();        
        //         break;

        //     case 3:
        //         list.peek();       
        //         break;

        //     case 4:
        //         list.display();    
        //         break;

        //     case 5:
        //         return;

        //     default:
        //         break;
        //     }
        // }



/*Stack By Linkedlist */

        // stackByLL stack = new stackByLL();
        // stack.push(56);
        // stack.push(87);
        // stack.push(18);
        // stack.push(86);
        
        // stack.display();
        // stack.peek();
        // stack.pop();
        // stack.push(99);
        // stack.display();
        // stack.peek();








        /*QUEUE */

            queueByArr queue = new queueByArr();
            queue.Enqueue(56);
            queue.Enqueue(23);
            queue.Enqueue(10);
            queue.Enqueue(48);
            queue.Enqueue(23);

            queue.Display();
            
            queue.Dequeue();
            
            queue.Display();
    }
    
}
