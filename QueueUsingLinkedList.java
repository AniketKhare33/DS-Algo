package StackandQueues;
class QNode {
    QNode next;
    int data;
    QNode(int x) {
        next = null;
        data = x;
    }
}
public class QueueUsingLinkedList {
    QNode front = null;
    QNode rear = null;

    public void push(int x) {
        QNode newNode = new QNode(x);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int pop() {
        if (front == null) {
            return -1;
        }
        QNode temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.push(5);
        q.push(4);
        q.push(6);
        q.push(1);
        System.out.println(q.pop());
    }
}
