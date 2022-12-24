public class MedianOfBST {
    private static void medianOfBST(TreeNode root) {
        if (root == null) {
            return;
        }
        int count = 0;
        TreeNode temp = root;
        while (temp != null) {
            count++;
            temp = temp.left;
        }
        if (count % 2 == 0) {
            System.out.println("Median is: " + (count / 2) + " and " + (count / 2 + 1));
        } else {
            System.out.println("Median is: " + (count / 2 + 1));
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        Scanner sc = new Scanner(System.in);
        root.val = sc.nextInt();

    }
}