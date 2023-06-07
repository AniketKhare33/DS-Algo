package com.company.tree;
import java.util.LinkedList;
import java.util.Queue;
class Node{
    int data;
    Node left,right;
    public Node(int d){
        data = d;
        left = right = null;
    }
}
public class Bfs {
    Node root;
    void printlevelorder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node t = q.poll();
            System.out.print(t.data+" ");
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
    }
    public static void main(String[] args) {
        Bfs Btree = new Bfs();
        Btree.root = new Node(1);
        Btree.root.left = new Node(2);
        Btree.root.right = new Node(3);
        Btree.root.left.left = new Node(4);
        Btree.root.left.right = new Node(5);
        Btree.printlevelorder();
    }
}
