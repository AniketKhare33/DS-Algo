package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class DeleteMiddleOfLinkedList {
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
    public Node deleteMiddle(Node head){
        if(head==null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast.next!=null && fast.next.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;

    }
    public static void main(String[] args) {
        DeleteMiddleOfLinkedList list = new DeleteMiddleOfLinkedList();
        list.head = new Node(5);
        list.head.next = new Node(6);
        list.head.next.next = new Node(7);
        list.print(list.head);
        list.deleteMiddle(list.head);
        System.out.println();
        list.print(list.head);
    }
}
