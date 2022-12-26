public class CheckBSTForDeadEnd {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.right = new TreeNode(11);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(13);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(10);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(12);
        root.right.right.left = new TreeNode(13);
        root.right.right.right = new TreeNode(14);
        System.out.println(isDeadEnd(root));
    }

     private static boolean solve(TreeNode root, int min, int max) {
        if(root == null) return false;
        if(min == max) return true;
        return solve(root.left, min, root.data-1) || solve(root.right, root.data + 1,
        max);
    }
    public static boolean isDeadEnd(TreeNode root)
    {
        //Add your code here.
        return solve(root, 1, Integer.MAX_VALUE);
    }
}
}