package com.company.queues;
class Queue{
    int rear,front,capacity,size;
    int array[];
    Queue(int capacity){
        this.capacity = capacity;
        size = 0;
        front =0;
        rear = capacity-1;
        array = new int[capacity];
    }
    boolean isFull(Queue queue){
        return (queue.size==queue.capacity);
    }
    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }
    void enQueue(int item){
        if(isFull(this)){
            return;
        }
        this.rear = (this.rear+1)%this.capacity;
        this.array[this.rear] = item;
        this.size = this.size+1;
        System.out.println(item
                + " enqueued to queue");
    }

    int deQueue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size-1;
        return item;
    }

    int front(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    int rear(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        System.out.println(queue.isEmpty(queue));
        System.out.println(queue.isFull(queue));
        System.out.println("Front item is "
                + queue.front());
        System.out.println("Rear item is "
                + queue.rear());
        queue.deQueue();
        System.out.println("Front item is "
                + queue.front());


    }
}
