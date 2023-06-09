package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        next = null;
        data = d;
    }
}

public class ReverseLinkedList {
    static Node head;

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(5);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        list.print(head);
        head = ReverseLinkedList.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.print(head);
        
    }
    
}
