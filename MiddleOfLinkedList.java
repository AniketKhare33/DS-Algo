package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        next = null; 
        data = d;
    }
}

public class MiddleOfLinkedList {
    Node head;
    void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    void PrintMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next= new Node(5);
        list.print(list.head);
        System.out.println();
        list.PrintMiddle(list.head);
    }
}
