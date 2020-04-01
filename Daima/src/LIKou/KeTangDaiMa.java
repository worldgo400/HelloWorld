package LIKou;

import java.util.ArrayList;
import java.util.List;
    class treeNode {
        public int val;
        public treeNode left;
        public treeNode right;

        public treeNode(int val) {
            this.val = val;
        }
    }

     class InterviewTree {
        public List<Integer> preOrderTraversal(treeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            result.add(root.val);
            result.addAll(preOrderTraversal(root.left));
            result.addAll(preOrderTraversal(root.right));
            return result;
        }
    }

