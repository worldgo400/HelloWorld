package Test;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

class  TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class interviewTree {
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preOrderTraversal(root.left));
        result.addAll(preOrderTraversal(root.right));
        return result;
    }


}
