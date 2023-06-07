package com.company.queues;
class Qnode{
    int key;
    Qnode next;
    public Qnode(int key){
        this.key = key;
        this.next = null;
    }
}
class Queues{
    Qnode front,rear;
    public Queues(){
        front = rear = null;
    }
    void enQueue(int key){
        Qnode temp  = new Qnode(key);
        if(rear==null){
            rear = front = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    void deQueue(){
        if(front == null){
            return;
        }
        Qnode temp = front;
        front = front.next;

        if (front == null)
            rear = null;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queues q = new Queues();
        q.enQueue(10);
        q.enQueue(20);
        q.deQueue();
        q.deQueue();
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.deQueue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}
