package LinkedList;

class Node{
    Node next;
    int data;
    Node(int d){
        this.next = null;
        this.data = d;
    }
}
 class LinearSearchInLinkedList {
    Node head;
    public void push(int newdata){
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }

    public boolean Search(Node head, int d){
        
        Node current = head; // Initialize current
        while (current != null) {
            if (current.data == d)
                return true; // data found
            current = current.next;
        }
        return false;

    }
    public static void main(String[] args) {
        LinearSearchInLinkedList llist = new LinearSearchInLinkedList();
        int x = 21;
        
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
 
          // Function call
        if (llist.Search(llist.head, x))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
