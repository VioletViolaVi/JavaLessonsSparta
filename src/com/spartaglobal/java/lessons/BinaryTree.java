package com.spartaglobal.java.lessons;

public class BinaryTree {
    // all code from TreeNode class
    private class TreeNode {
        private int value;
        private com.spartaglobal.java.lessons.BinaryTree.TreeNode leftNode = null;
        private com.spartaglobal.java.lessons.BinaryTree.TreeNode rightNode = null;

        public TreeNode(int nextValue) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public com.spartaglobal.java.lessons.BinaryTree.TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(com.spartaglobal.java.lessons.BinaryTree.TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public com.spartaglobal.java.lessons.BinaryTree.TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(com.spartaglobal.java.lessons.BinaryTree.TreeNode rightNode) {
            this.rightNode = rightNode;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }




    // reference to root of tree
    private TreeNode root = null;

    public void add(int nextValue) {
        if(root == null){
            root = new TreeNode(nextValue);
            return; // prevents next if statements from being called
        }
        if (nextValue > root.getValue()) {
            root.setRightNode(new TreeNode(nextValue));
            return;
        }
        if(nextValue < root.getValue()){
            root.setLeftNode(new TreeNode(nextValue));
            return;
        }
    }



}
