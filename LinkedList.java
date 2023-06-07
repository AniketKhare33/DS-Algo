import java.util.HashSet;
//LOOP IN LINKED LIST //


//public class LinkedList {
//    static Node head; // head of list

    /* Linked list Node*/
//    static class Node {
//        int data;
//        Node next;
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
//
//    /* Inserts a new Node at front of the list. */
//    static public void push(int new_data)
//    {
//        /* 1 & 2: Allocate the Node &
//                  Put in the data*/
//        Node new_node = new Node(new_data);
//
//        /* 3. Make next of new Node as head */
//        new_node.next = head;
//
//        /* 4. Move the head to point to new Node */
//        head = new_node;
//    }
//

//    static boolean detectLoop(Node h)
//    {
//        HashSet<Node> s = new HashSet<Node>();
//        while (h != null) {
//            if (s.contains(h))
//                return true;
//
//            s.add(h);
//
//            h = h.next;
//        }
//
//        return false;
//    }
//
//     public static void main(String[] args) {
//        LinkedList llist = new LinkedList();
//        llist.push(20);
//        llist.push(4);
//        llist.push(15);
//        llist.push(10);
//        /*Create loop for testing */
//        llist.head.next.next.next.next = llist.head;
//        if (detectLoop(head))
//            System.out.println("Loop found");
//        else
//            System.out.println("No Loop");
//    }
//}
//

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }
    public void push(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    void detectLoop(){
        Node slowptr = head,fastptr=head;
        int flag = 0;
        while(slowptr!=null && fastptr!=null && fastptr.next!=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr==fastptr){
                flag =1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(4);
        llist.push(15);
        llist.push(10);
        /*Create loop for testing */
        llist.head.next.next.next = llist.head;
        llist.detectLoop();

    }
}

