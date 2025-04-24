package com.manoj.learning.datastructures.trees;

public class BinaryTreeTest {

    public static void main(String[] args) {
        MyBinaryTree tree=new MyBinaryTree();
        tree.insert(8);
        tree.insert(5);
        tree.insert(15);
        tree.insert(12);
        tree.insert(7);
        tree.insert(11);
        tree.insert(1);




        tree.inOrder();
        tree.preOrder();
    }
}
