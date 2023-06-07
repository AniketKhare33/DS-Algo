package com.company.linklists;

public class LinkedListdeletion {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node push(Node head_ref, int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head_ref;
        head_ref = newNode;
        return head_ref;
    }
    static Node removeFirstNode(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        head = removeFirstNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");

    }
























}

