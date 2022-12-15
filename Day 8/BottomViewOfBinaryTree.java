public class BottomViewOfBinaryTree {
    public static void bottomView(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(root);
        int hd = 0;
        root.hd = hd;
        while (!queue.isEmpty()) {
            hd = root.hd;
            
                map.put(hd, root.val);
            
            if (root.left != null) {
                root.left.hd = hd - 1;
                queue.add(root.left);
            }
            if (root.right != null) {
                root.right.hd = hd + 1;
                queue.add(root.right);
            }
            queue.remove();
            root = queue.peek();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
    public static void main(String[] args) {

    }
}