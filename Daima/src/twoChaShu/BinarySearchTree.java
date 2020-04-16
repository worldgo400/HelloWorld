package twoChaShu;

import java.awt.image.Kernel;

public class BinarySearchTree {
    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    private Node root=null;
    public Node find(int key){
        Node cur=root;
        while (cur!=null){
         if (key<cur.key){
             cur=cur.left;
         }else if (key>cur.key){
             cur=cur.right;
         }else {
             return cur ;
         }
        }
        return cur;
    }
    public boolean insert(int key){
        if (root==null){
            root=new Node(key);
            return true;
            }
        Node cur=root;
        Node parent=null;
        while (cur!=null){
            if (key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key) {
                parent=cur;
                cur=cur.right;
            }else {
                return false;
            }
        }
        if (key<parent.key){
            parent.left=new Node(key);
        }else {
            parent.right=new Node(key);
        }
        return true;
    }
    public boolean remove(int key){
       Node cur=root;
       Node parent=null;
       while (cur!=null){
           if (key<cur.key){
               parent=cur;
               cur=cur.left;
           }else if (key>cur.key){
               parent=cur;
               cur=cur.right;
           }else {
               removeNode(parent,cur);
               return true;
           }
       }
       return false;
    }
    private void removeNode(Node parent,Node cur){
        if (cur.left==null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else if (cur.right == null) {
                if (cur == root) {
                    root = cur.left;
                } else if (cur == parent.left) {
                    parent.left = cur.left;
                } else {
                    parent.right = cur.left;
                }
            } else {
                Node goatParent = cur;
                Node scapeGoat = cur.right;
                while (scapeGoat.left != null) {
                    goatParent = scapeGoat;
                    scapeGoat = scapeGoat.left;
                }
                cur.key = scapeGoat.key;
                if (scapeGoat == goatParent.left) {
                    goatParent.left = scapeGoat.right;
                } else {
                    goatParent.right = scapeGoat.right;
                }
            }
        }
    }
    public void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.key + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(9);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);
//        tree.preOrder(tree.root);
//        System.out.println();
//        tree.inOrder(tree.root);
//        System.out.println();
//        Node cur=tree.find(100);
//        System.out.println(cur);
//        System.out.println("=================");
//        tree.remove(5);
//        tree.preOrder(tree.root);
//        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
    }



}
