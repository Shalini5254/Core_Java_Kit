import java.util.*;

public class StackArrays {
    private int[] stack;
    private int capacity;
    private int top;

    StackArrays(int size){
        capacity=size;
        stack=new int[capacity];
        top=-1;
    }
    void push(int value){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=value;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int remove=stack[top];
        top--;
        return  remove;
    }
    int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    }
}
