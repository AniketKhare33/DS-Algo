package LinkedList;
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class DeleteLinkedList {
    Node head;
    void deleteList() { head = null; }
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String[] args) {
        DeleteLinkedList llist = new DeleteLinkedList();
        /* Use push() to construct below list
           1->12->1->4->1  */
 
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
 
        System.out.println("Deleting the list");
        llist.deleteList();
 
        System.out.println("Linked list deleted");
    }
}
