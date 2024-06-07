package Day_35;

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

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if (root == null)
            return true;
        if (root.val >= maxValue || root.val <= minValue)
            return false;

        return isValidBST(root.leftChild, minValue, root.val) && isValidBST(root.rightChild, root.val, maxValue);
    }
}
