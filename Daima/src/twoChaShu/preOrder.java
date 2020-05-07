package twoChaShu;

import java.util.ArrayList;
import java.util.List;

public class preOrder {
    public class TreeNode {
        int val ;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
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
}
