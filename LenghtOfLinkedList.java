package LinkedList;
class Node{
    Node next;
    int data;
    Node(int d){
        this.next = null;
        this.data = d;
    }
}

public class LenghtOfLinkedList {
    Node head;
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LenghtOfLinkedList linkedList = new LenghtOfLinkedList();
        linkedList.push(1);
        linkedList.push(1);
        System.out.println("Length is"+ linkedList.getCount());
    }
}
