package twoChaShu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class interviewTree {
     public List<Integer>preOrderTraversal(TreeNode root){
         List<Integer>result=new ArrayList<>();
         if (root==null){
             return result;
         }
         result.add(root.val);
         result.addAll(preOrderTraversal(root.left));
         result.addAll(preOrderTraversal(root.right));
         return result;
     }
     public List<Integer>inOrderTraversal(TreeNode root){
         List<Integer>result=new ArrayList<>();
if (root==null){
    return result;
}
result.addAll(inOrderTraversal(root.left));
result.add(root.val);
result.addAll(inOrderTraversal(root.right));
return result;
     }
//     判断两棵树是否相同
    public boolean isSameTree(TreeNode p,TreeNode q){
//         可以分为四种情况
//        1，p q都为null;
//        2,P为null,q不为null;
//        3,q为null,p不为null;
//        4,p q都不为null;
        if (p==null&&q==null){
            return true;
        }
        if (p==null||q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }
    public boolean isSubTree(TreeNode s,TreeNode t){
         if (s==null&&t==null){
             return true;
         }
         if (s==null||t==null){
             return false;
         }
         boolean ret=false;
         if (s.val==t.val){
             ret= isSameTree(s,t);
         }
         return ret||isSubTree(s.left,t)||isSubTree(s.right,t);
    }
    public int maxDepth(TreeNode root){
         if (root==null){
             return 0;
         }
         if (root.left==null&&root.right==null){
             return 1;
         }
         int leftDepth=maxDepth(root.left);
         int rightDepth=maxDepth(root.right);
         return 1+Math.max(leftDepth,rightDepth);
    }
    public boolean isBalance(TreeNode root){
         if (root==null){
             return true;
         }
         int leftDepth=maxDepth(root.left);
         int rightDepth=maxDepth(root.right);
         if (leftDepth-rightDepth>1||leftDepth-rightDepth<-1){
             return false;
         }
         return isBalance(root.left)&&isBalance(root.right);
    }
    public boolean isSymmetric(TreeNode root){
         if (root==null){
             return true;
         }
         return isMirror(root.left,root.right);
    }
         private  boolean isMirror(TreeNode t1,TreeNode t2){
         if (t1==null&&t2==null){
             return true;
         }
         if (t1==null||t2==null){
             return false;
         }
         if (t1.val!=t2.val){
             return false;
         }
         return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
         }

//层遍历
    public void levelOrder(TreeNode root){
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.println(cur.val+" ");
            if (cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    public static TreeNode build(){
         TreeNode A=new TreeNode(1);
        TreeNode B=new TreeNode(2);
        TreeNode C=new TreeNode(3);
        TreeNode D=new TreeNode(4);
        TreeNode E=new TreeNode(5);
        TreeNode F=new TreeNode(6);
        TreeNode G=new TreeNode(7);
        TreeNode H=new TreeNode(8);
        TreeNode I=new TreeNode(9);
        TreeNode J=new TreeNode(10);
        TreeNode K=new TreeNode(11);
        TreeNode L=new TreeNode(12);
        TreeNode Z=new TreeNode(13);
         A.left=B;
         A.right=C;
         B.left=D;
         B.right=E;
         D.left=E;
         D.right=G;
         F.left=Z;
         E.left=H;
         E.right=I;
         C.left=K;
         C.right=L;
         K.left=J;
         return A;
    }

    public static void main(String[] args) {
        TreeNode root=build();
        interviewTree interviewTree=new interviewTree();
        interviewTree.levelOrder(root);
        System.out.println( );
    }
}
