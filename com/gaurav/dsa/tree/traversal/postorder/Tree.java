package com.gaurav.dsa.tree.traversal.postorder;

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

    Tree (){
        root = null;
    }

    public void postorderTraversalRecursive(Node root){
        if(root == null){
            return;
        }
        if(root.right != null)
        postorderTraversalRecursive(root.right);
        if(root.left != null)
         postorderTraversalRecursive(root.left);
        System.out.print(root.data+" --> ");
    }

    public void postorderTravesalIterative(){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node ptr = root;
        stack.push(ptr);
        while (!stack.isEmpty()){
            if(ptr.left != null)
                stack.push(ptr.left);
            if(ptr.right != null)
                stack.push(ptr.right);
            ptr = stack.pop();
            System.out.print(ptr.data + "-->");
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
        System.out.println("Recursive");
        tree.postorderTraversalRecursive(tree.root);
        System.out.println("\n\niterative");
        tree.postorderTravesalIterative();
    }
}


