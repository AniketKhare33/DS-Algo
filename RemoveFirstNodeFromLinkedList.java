package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class RemoveFirstNodeFromLinkedList {
    Node head;

    public void push(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void print(Node node){
        Node temp = node;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public Node removefirst(Node head){
        if(head==null){
            return null;
        }
        Node temp = head;
        head = head.next;
        return head;
        
    }
    public static void main(String[] args) {
        RemoveFirstNodeFromLinkedList list = new RemoveFirstNodeFromLinkedList();
        list.head = new Node(5);
        list.head.next = new Node(6);
        list.head.next.next = new Node(7);
        list.print(list.head);
        list.head = list.removefirst(list.head);
        System.out.println();
        list.print(list.head);
        
    }
}
