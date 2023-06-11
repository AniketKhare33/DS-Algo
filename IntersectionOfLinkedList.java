package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        next = null;
        data = d;
    }
}
public class IntersectionOfLinkedList {
    Node head1;
    Node head2;
    Node intersect;
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    Node intersection(Node a, Node b){
        Node result = new Node(0);
        Node curr = result;
        while (a != null && b != null) {
            if (a.data == b.data) {
                curr.next = new Node(a.data);
                curr = curr.next;
                a = a.next;
                b = b.next;
            }
            else if (a.data < b.data)
                a = a.next;
            else
                b = b.next;
        }
        result = result.next;
        return result;

    }
    public static void main(String[] args) {
        IntersectionOfLinkedList list = new IntersectionOfLinkedList();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.printList(list.head1);
        System.out.println();
        list.head2 = new Node(1);
        list.head2.next = new Node(4);
        list.head2.next.next = new Node(5);
        list.printList(list.head2);
        System.out.println();
        list.intersect = list.intersection(list.head1 , list.head2);
        System.out.println(list.intersect.data);
    }
    
}
