class CheckIfTreeIsBalancedOrNot {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static Pair<boolean, int> isBalancedFast(TreeNode root) {
        if (root == null) {
            return new Pair<>(true, 0);
        }
        Pair<boolean, int> left = isBalancedFast(root.left);
        Pair<boolean, int> right = isBalancedFast(root.right);
        int height = 1 + Math.max(left.second, right.second);
        if (left.first && right.first && Math.abs(left.second - right.second) <= 1) {
            return new Pair<>(true, height);
        }
        return new Pair<>(false, height);
    }
}