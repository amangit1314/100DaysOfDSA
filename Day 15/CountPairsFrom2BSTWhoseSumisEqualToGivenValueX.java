public class CountPairsFrom2BSTWhoseSumisEqualToGivenValueX {
    public static void main(String[] args) {
        TreeNode root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        TreeNode root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;
        System.out.println(countPairs(root1, root2, x));
    }

    private static int countPairs(TreeNode root1, TreeNode root2, int x) {
        if (root1 == null || root2 == null) {
            return 0;
        }
        int count = 0;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        Node curr1 = root1;
        Node curr2 = root2;
        while (true) {
            if (curr1 != null) {
                s1.push(curr1);
                curr1 = curr1.left;
            } else if (curr2 != null) {
                s2.push(curr2);
                curr2 = curr2.right;
            } else if (!s1.isEmpty() && !s2.isEmpty()) {
                curr1 = s1.peek();
                curr2 = s2.peek();
                if (curr1.data + curr2.data == x) {
                    count++;
                    s1.pop();
                    s2.pop();
                    curr1 = curr1.right;
                    curr2 = curr2.left;
                } else if (curr1.data + curr2.data < x) {
                    s1.pop();
                    curr1 = curr1.right;
                    curr2 = null;
                } else {
                    s2.pop();
                    curr2 = curr2.left;
                    curr1 = null;
                }
            } else {
                break;
            }
        }
        return count;
    }

    private static int secondApproach(TreeNode root1, TreeNode root2, int x) {
        int count = 0;
        solve(root1, root2, x);
        return count;
    }

    private static int solve(TreeNode roo1, TreeNode root2, int x) {
        if(root1 == null) return;
        solve(root1.left, root2, x);
        if(getch(root2, x - root1.data))
            count++;
        solve(root1.right, root2, x);
    }

    private static boolean fetch(TreeNode root2, int k) {
        if(root2 == null) return false;
        if(root2.data == k) return true;
        if(root2.data > k) return fetch(root2.left, k);
        return fetch(root2.right, k);
    }
}