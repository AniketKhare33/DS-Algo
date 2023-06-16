package com.company.linklists;
class LinkedList_{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    void insertAfter(Node prev,int d){
        Node newNode = new Node(d);
        if(prev==null){
            System.out.println("Not possible to insert");
            return;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }
    void append(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
public class SLinkedList {
    public static void main(String[] args) {
        LinkedList_ llist = new LinkedList_();

        // Insert 6.  So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printlist();

    }
}
