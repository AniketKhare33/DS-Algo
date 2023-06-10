package LinkedList;

import java.util.HashSet;

class Node{
    Node next;
    int data;
    Node(int d){
        next = null;
        data = d;
    }
}

public class LoopInLinkedList {
    Node head;
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public boolean isLoop(Node head){
        HashSet<Node> h = new HashSet<>();
        while(head!=null){
            if(h.contains(head)){
                return true;
            }
            h.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LoopInLinkedList list = new LoopInLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        //list.head.next.next.next = list.head;
        System.out.println(list.isLoop(list.head));
    }
}
