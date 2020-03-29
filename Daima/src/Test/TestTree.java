package Test;

import javax.swing.plaf.PanelUI;

class Node{
    public char val;
    public  Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}

public class TestTree {
    public static Node build(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        g.right=h;
        c.right=f;

        return a;
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }
    public static void lastOrder(Node root){
        if (root==null){
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.val+" ");
    }
    public static int size(Node root){
        if (root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
//    求二叉树叶子节点的个数
    public static int leafSize(Node root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        return leafSize(root.right)+leafSize(root.right);
    }
//    求二叉树低K层节点的个数
public static int kLeafSize(Node root ,int k){
        if (k<0||root==null){
            return 0;
        }
        if (k==1){
            return 1;
        }
        return kLeafSize(root.left ,k-1)+kLeafSize(root.right,k-1);
}
//在二叉树中查找指定元素
    Node find(Node root,char toFind){
        if (root==null){
            return null;
        }
        if (root.val==toFind){
            return root;
        }
     Node result=find( root.left,toFind);
        if (result!=null){
            return result;
        }
        return find(root.right,toFind);
    }

    public static void main(String[] args) {
        Node root=build();
        System.out.println("先序遍历");
        preOrder(root);
        System.out.println();

        System.out.println("中序遍历");
        inOrder(root);
        System.out.println();

        System.out.println("后序遍历");
        lastOrder(root);
        System.out.println();
    }

}
