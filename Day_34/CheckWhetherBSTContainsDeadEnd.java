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


public class CheckWhetherBSTContainsDeadEnd {
    public static boolean solve(TreeNode root, int min, int max) {
        if(root == null) return false;
        if(min == max) return true;

        return solve(root.leftChild, min, root.val - 1) || solve(root.rightChild, root.val + 1, max);
    }

    public static boolean isDeadEnd(TreeNode root) {
        return solve(root, 1, Integer.MAX_VALUE);
    }
}
