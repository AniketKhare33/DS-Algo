
package StackandQueues;

class Stack {
    static final int max = 1000;
    int top;
    int arr[] = new int[max];

    Stack() {
        top = -1;
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean push(int n){
        if(top>=max-1){
            System.out.println("Overflow");
            return false;
        }
        else{
            arr[++top]=n;
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Underflow");
            return -1;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Underflow");
            return -1;
        }
        else{
            int x = arr[top];
            return x;
        }
    }
    int size(){
        return top+1;
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.size());
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();;
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());

    }
}
