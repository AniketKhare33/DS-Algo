package com.company.tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node1{
    int data;
    Node1 left,right;
    public Node1(int d){
        data = d;
        left = right = null;
    }
}

public class reverseBfs {
    Node1 root;
    void reverselevelorder(Node1 node){
        Queue<Node1> q = new LinkedList<>();
        Stack<Node1> s = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Node1 t = q.poll();
            s.push(t);
            if(t.right!=null){
                q.add(t.right);
            }
            if(t.left!=null){
                q.add(t.left);
            }
        }
        while(!s.isEmpty()){
            Node1 e = s.pop();
            System.out.print(e.data+" ");
        }
    }
    public static void main(String[] args) {
        reverseBfs Btree = new reverseBfs();
        Btree.root = new Node1(1);
        Btree.root.left = new Node1(2);
        Btree.root.right = new Node1(3);
        Btree.root.left.left = new Node1(4);
        Btree.root.left.right = new Node1(5);
        Btree.reverselevelorder(Btree.root);

    }
}
