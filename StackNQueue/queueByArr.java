package StackNQueue;

public class queueByArr {
    protected int[]  data;
    protected int F= -1;
    protected int R= -1;
    protected static int n = 5;

    public queueByArr(){
        this(n);
    }


    public queueByArr(int n2) {
        this.data = new int[n2];
    }


    public void Enqueue(int x){
        if (R== n-1) {
            System.out.println("Overflow");
        }
        else{
            if (R==-1) {
                F=R=0;
                data[R]=x;
            }
            else{
                R++;
                data[R]=x;
            }
        }
    }

    public void Dequeue(){
        if (F == -1) {
            System.out.println("Underflow");
        }
        else{
            if (F==R) {
                F= R = -1;
            }
           F++;
        }
    }

    public void Display(){
        for (int i = F; i<n ; i++) {
            System.out.print(" "+data[i]+" ");
        }
        System.out.println(" ");
    }
}
