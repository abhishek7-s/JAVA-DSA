package StackNQueue;

public class mystack {
    protected int[] data;
    protected static int size = 5;
    
    int top = -1;

    public mystack(){
        this(size);
    }

    public mystack(int size){
        this.data = new int[size];
    }

    public boolean isfull(){
        return top == size-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int x){
        if (isfull()) {
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            data[top] = x;
            // System.out.println("Added");
        }
    } 

    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        else{
            int ele = data[top];
            top--;
            System.out.println(ele+" is Removed");
        }
    } 

    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Top Element is "+data[top]);
        }
    }

    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println("> "+data[i]);
        }
    }  

}
