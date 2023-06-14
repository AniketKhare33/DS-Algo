package StackandQueues;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop(){
        if (s1.size() == 0) return -1;
        else{
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println("Popped element is: " +q.pop());
    }

}
