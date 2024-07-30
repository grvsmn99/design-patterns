package com.gaurav.dsa.tree.traversal.preorder;


import java.util.Stack;

class Node {
    int data;
    Node left,right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
    
}
public class Tree {
    Node root;
    
    Tree(){
        root = null;
    }

    public void preorderTraversalRecursive(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" --> ");
        if(root.left != null)
        preorderTraversalRecursive(root.left);

        if(root.right != null)
        preorderTraversalRecursive(root.right);

    }

    public void preorderTraversalIterative(){
        if(root == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node ptr = root;
        while(!stack.isEmpty()){
            ptr = stack.pop();
            System.out.println(ptr.data+" --> ");
            if(ptr.right != null)
            stack.push(ptr.right);

            if (ptr.left != null)
            stack.push(ptr.left);
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        //tree.preorderTraversalRecursive(tree.root);
        tree.preorderTraversalIterative();
    }
}
