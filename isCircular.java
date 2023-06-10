package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        next = null;
        data = d;
    }
}

public class isCircular {
    Node head;

    boolean iscircular(Node head){
        if(head==null){
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast !=null){
            if(slow==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
          
        }
        return false;
    }
    public static void main(String[] args) {
        isCircular list = new isCircular();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        System.out.println(list.iscircular(list.head));
    }
}
