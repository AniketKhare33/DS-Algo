package LinkedList;

import java.util.ArrayList;

class Node{
    Node next;
    int data;
    Node(int d){
        next = null;
        data = d;
    }
}
public class PalindromeLinkedList {
    Node head;
    void push(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    boolean isPalindrome(Node head){
        ArrayList<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.data);
            head = head.next;
        }
        for(int i=0;i<al.size()/2;i++){
            if(al.get(i)!=al.get(al.size()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(2);
        //list.push(1);
        System.out.println(list.isPalindrome(list.head));
    }
}
