package com.company.linklists;
class LinkedList {
    Node head;
    class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
}

public void insertAfter(Node prevNode, int new_data){
        if(prevNode == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
}
public void append(int new_data){
        Node newNode = new Node(new_data);
        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        newNode.next = null;
        last.next = newNode;
        return ;
}


public void printlist() {
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }

}
public static void main(String[] args) {
//    LinkedList llist = new LinkedList();
//    llist.head = new Node(1);
//    Node second = new Node(2);
//    llist.head.next = second;
//    llist.printlist();
      LinkedList llist = new LinkedList();
      llist.push(2);
      llist.push(3);
      llist.insertAfter(llist.head.next, 1);
      llist.append(5);
      llist.printlist();
    }
}
