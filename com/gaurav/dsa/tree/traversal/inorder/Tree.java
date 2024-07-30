package com.gaurav.dsa.tree.traversal.inorder;

import java.util.Stack;

class Node {
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class Tree {

    Node root;
    public Tree (){
        root = null;
    }

    public void inorderTraversalRecursive(Node node){
        if(node == null){
            return;
        }
        inorderTraversalRecursive(node.left);

        System.out.println(node.data+" -->");

        inorderTraversalRecursive(node.right);

    }
    public void inorderTraversalIterative(){
        if(root == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node ptr = root;
        while(ptr != null || !stack.isEmpty()){

            //traverse all left nodes for that go to left leaf node

            while(ptr != null){
                stack.push(ptr);
                ptr = ptr.left;
            }

            //now we are at left most node so we will pop the items
            ptr = stack.pop();
            System.out.println(ptr.data +"-->" );

            //Now its turn for right node
            ptr = ptr.right;
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

        tree.inorderTraversalRecursive(tree.root);

    }
}
