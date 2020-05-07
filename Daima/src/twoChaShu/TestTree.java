package twoChaShu;

public class TestTree {
    public class Node{
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val+' ');
        preOrder(root.left);
        preOrder(root.right);
    }
//    求二叉树中节点的个数
    public static int size(Node root){
        if (root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
//     求二叉树中叶子节点的个数
    public static int LeafSize(Node root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        return LeafSize(root.left)+LeafSize(root.right);
    }
//    求二叉树第k层节点的个数
    public static int sizeK(Node root,int k) {
        if (k < 1 || root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return sizeK(root.left, k - 1) + sizeK(root.right, k - 1);
    }
        //        在二叉树中查找指定元素
     Node find(Node root,char toFind){
        if (root==null){
         return null ;
        }
        if (root.val==toFind){
            return root;
        }
        Node result= find(root.left,toFind);
        if (result!=null){
            return result;
        }
        return find(root.right,toFind);
     }
}
