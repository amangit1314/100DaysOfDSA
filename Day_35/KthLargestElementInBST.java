package Day_35;

import java.util.ArrayList;

public class KthLargestElementInBST {
    public int KthLargestElement(TreeNode root, int k) {
        ArrayList<Integer> a = new ArrayList<>();

        dfs(root, a);
    }

    public void dfs(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (root.leftChild != null) {
            // recursion stack
            dfs(root.leftChild, list);
        }

        list.add(root.val);

        if (root.rightChild != null) {
            // recursion stack
            dfs(root.rightChild, list);
        }
    }
}
