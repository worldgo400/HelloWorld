package twoChaShu;

public class TestTree2 {
    public class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
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
}
