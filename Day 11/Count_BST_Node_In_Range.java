public class Count_BST_In_Range {
    
    private static void countBST(Node root, int low, int high, int[] count) {
        if (root == null) {
            return;

        if (root.data >= low && root.data <= high) {
            count[0]++;

        if(root.data > high)
            countBST(root.left, low, high, count);

        if(root.data < low)
            countBST(root.right, low, high, count);
    }

    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);

        int[] count = new int[1];
        countBST(root, 5, 45, count);
        System.out.println(count[0]);
    }
}