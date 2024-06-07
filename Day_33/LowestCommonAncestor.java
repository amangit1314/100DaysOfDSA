import java.util.*;

class TreeNode {
    int val;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int data) {
        this.val = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == p || curr == q) {
                // Early termination if either p or q is found
                return curr;
            }
            if (curr.leftChild != null) {
                queue.add(curr.leftChild);
            }
            if (curr.rightChild != null) {
                queue.add(curr.rightChild);
            }
        }

        return null;
    }
}
