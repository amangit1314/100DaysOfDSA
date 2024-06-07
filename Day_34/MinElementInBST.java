public class MinElementInBST {
    int minValue(TreeNode node) {
        if(node == null) return -1;
        if(node.left != null) {
            node = node.left;
        }

        return node.data;
    }
}
